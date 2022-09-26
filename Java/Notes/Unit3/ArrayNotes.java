package Notes.Unit3;

public class ArrayNotes {
    public static void main(String[] args){

        //Array --> List.... A sequence of data that is not mutable -> can not change
        //Only one data type

        //Python --> List
        /*
            Listy=[]
            listy=[1,2,3,"four",[1,2,3,4],True]
         */
        

        /*
            Primitive       = Binary, booleans, ints, doubles, chars
            Non-Primitive   = Arrays, Strings, Tuples,

            Array --> List and ArrayList
        */

        //datatypes[] nameOfArray = { The Data };
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        double[] decimalNumbers = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};

        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]+4);   //5
        numbers[1]=numbers[1]+4;            //reset 1 to 5
        //Python --> Listy.append(number)
        //Java
        printHorizontalArray(numbers);
        int[] numbersLonger = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbersLonger);

    }

    private static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void printHorizontalArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    private static void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
