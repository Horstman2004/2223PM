import smtplib
import ssl
from email.message import EmailMessage

#Sender and Reciever
sender = ''
password = ''
receiver = 'write-email-receiver-here'

#Put the subject and body of the email
subj = "Attendance Infromation"
body = "This email contains the attendance information"

em = EmailMessage()
em['From'] = sender
em['To'] = receiver
em['Subject'] = subj
em.set_content(body)

#Security Layer (IDK what it does)
context = ssl.create_default_context()

#Logs in and sends email
with smtplib.SMTP_SSL('email@gmail.com', 465, context=context) as smtp:
    smtp.login(sender, password)
    smtp.sendmail(sender, receiver, em.as_string())