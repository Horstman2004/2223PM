# sheets.py

#Notes from (https://blog.coupler.io/python-to-google-sheets/)

from __future__ import print_function
from auth import spreadsheet_service
from auth import drive_service

def create():
    spreadsheet_details = {
    'properties': {
        'title': 'Python-google-sheets-demo'
        }
    }
    sheet = spreadsheet_service.spreadsheets().create(body=spreadsheet_details,
                                    fields='spreadsheetId').execute()
    sheetId = sheet.get('spreadsheetId')
    print('Spreadsheet ID: {0}'.format(sheetId))
    permission1 = {
    'type': 'user',
    'role': 'writer',
    'emailAddress': 'YOUR EMAIL'
    }
    drive_service.permissions().create(fileId=sheetId, body=permission1).execute()
    return sheetId

create()

def read_range():
    range_name = 'Sheet1!A1:H1'
    spreadsheet_id = '1JCEHwIa4ZzwAiKGmAnWGfbjeVCH_tWZF6MkIU0zICwM'
    result = spreadsheet_service.spreadsheets().values().get(
    spreadsheetId=spreadsheet_id, range=range_name).execute()
    rows = result.get('values', [])
    print('{0} rows retrieved.'.format(len(rows)))
    print('{0} rows retrieved.'.format(rows))
    return rows

def write_range():
    spreadsheet_id = create()
    range_name = 'Sheet1!A1:H1'
    values = read_range()
    value_input_option = 'USER_ENTERED'
    body = {
        'values': values
    }
    result = spreadsheet_service.spreadsheets().values().update(
        spreadsheetId=spreadsheet_id, range=range_name,
        valueInputOption=value_input_option, body=body).execute()
    print('{0} cells updated.'.format(result.get('updatedCells')))
write_range()

def read_ranges():
    write_range()
    sheetId = '1JCEHwIa4ZzwAiKGmAnWGfbjeVCH_tWZF6MkIU0zICwM'
    range_names = ['Sheet1!A2:H21', 'Sheet1!A42:H62']
    result = spreadsheet_service.spreadsheets().values().batchGet(
     spreadsheetId=sheetId, ranges=range_names).execute()
    ranges = result.get('valueRanges', [])
    print('{0} ranges retrieved.'.format(len(ranges)))
    return ranges

def write_ranges():
    values = read_ranges()
    data = [
        {
            'range': 'Sheet1!A2:H21',
            'values': values[0]['values']
        },
       {
            'range': 'Sheet1!A22:H42',
            'values': values[1]['values']
        }
    ]
    body = {
        'valueInputOption': 'USER_ENTERED',
        'data': data
    }
    result = spreadsheet_service.spreadsheets().values().batchUpdate(
        spreadsheetId=spreadsheet_id, body=body).execute()
    print('{0} cells updated.'.format(result.get('totalUpdatedCells')))
write_ranges()

def append():
    values = read_ranges()
    data = [
         values[0]['values'], values[1]['values']
    ]
    body = {
        'valueInputOption': 'USER_ENTERED',
        'data': data
    }
    result = spreadsheet_service.spreadsheets().values().append(
        spreadsheetId=spreadsheet_id, body=body).execute()
    print('{0} cells updated.'.format(result.get('totalUpdatedCells')))
append()

def export_excel_to_sheets():
    spreadsheet_id = '1JCEHwIa4ZzwAiKGmAnWGfbjeVCH_tWZF6MkIU0zICwM'
    excel_data_df = pandas.read_excel('sample-excel.xlsx', sheet_name='Sheet1', skiprows = range(1, 62), engine='openpyxl')
    excel_data_df['Date'] = excel_data_df['Date'].astype(str)
    excel_data_df['Unnamed: 0'] = ''
    body = {
        'values': excel_data_df.values.tolist()
    }
    
  
    spreadsheet_service.spreadsheets().values().append(
        spreadsheetId=spreadsheet_id, body=body, valueInputOption='USER_ENTERED', range='Sheet1').execute()
    print('{0} cells appended.'.format(result \
                                       .get('updates') \
                                       .get('updatedCells')))
export_excel_to_sheets()

def export_pandas_df_to_sheets():
    spreadsheet_id = '1iKZHRN4MnbyUeeSO5EWvTLmSeIOzXfwx1s0PSVw27lc'
    
    df = pd.DataFrame(
        [[21, 72, 67],
        [23, 78, 69],
        [32, 74, 56],
        [52, 54, 76]],
        columns=['a', 'b', 'c'])
    body = {
        'values': df.values.tolist()
    }
    
  
    result = spreadsheet_service.spreadsheets().values().append(
        spreadsheetId=spreadsheet_id, body=body, valueInputOption='USER_ENTERED', range='Sheet1').execute()
    print('{0} cells appended.'.format(result \
                                       .get('updates') \
                                       .get('updatedCells')))