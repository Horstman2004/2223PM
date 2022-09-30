public class ArrayAlgos {
    public static void main(String[] args) { 
        double[] test = {12,7,13,8,4.0,3,72};
        
        System.out.printf("Max: %f",max(test));
    }
    
    public static double max(double[] arr){
        double pastnum=0;
        for(int i=0;i<arr.length;i++){
            double num = arr[i];
            if(num > pastnum){
                pastnum = num;
            }
        }
        System.out.println("Max Value is: "+pastnum);
    }



}
