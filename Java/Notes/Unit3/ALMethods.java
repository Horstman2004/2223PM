import java.util.ArrayList;
import java.util.Scanner;

public class ALMethods {
    public static void main(String[] args){
        //1,5,9,7,4,8,2,3,6,0,9
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int[] ia = {1,5,9,7,4,8,2,3,6,0,9};
        arrList=createArrayList(ia);

        System.out.println(minIntAL(arrList));
        System.out.println(maxIntAL(arrList));
        System.out.println(aveIntAL(arrList));
        System.out.println(sumIntAL(arrList));



    }
    //convert an int array to an int arrayList
    public static ArrayList<Integer> createArrayList(int[] iarr){
        // hint hint.... loop through the array and add it to an array list
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<iarr.length;i++){
            temp.add(iarr[i]);
        }
        return temp;
    }
    public static int minIntAL(ArrayList<Integer> arrList){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arrList.size();i++){
             if(min>arrList.get(i)){
                  min=arrList.get(i);
             }
        }
        return min;
    }
    public static int maxIntAL(ArrayList<Integer> arrList){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arrList.size();i++){
            if(max<arrList.get(i)){
                max=arrList.get(i);
            }
        }
        return max;
    }
    public static int aveIntAL(ArrayList<Integer> arrList){
        int total = 0;
        for(int i = 0;i<arrList.size();i++){
            total+=arrList.get(i);
        }
        return (total/arrList.size());
    }
    public static int sumIntAL(ArrayList<Integer> arrList){
        int total = 0;
        for(int i = 0;i<arrList.size();i++){
            total+=arrList.get(i);
        }
        return total;
    }
    public static int count(ArrayList<Integer> arrList){
        int count=0;
        for(int i = 0;i<arrList.size();i++){
            if(count == arrList.get(i)){
                count+=1;
            }
        }
        return count;
    }
    public static int mode(ArrayList<Integer> arrList){
        ArrayList<Integer> uniqueList = new ArrayList<Integer>();
        uniqueList=removeDuplicateds(temp);

        ArrayList<Integer> countList = new ArrayList<Integer>();
        //countList=createArrayList(new int[uniqueList.size()])
        //for each for loop
        for(int n: uniqueList){         //for(item in uniqueList)
            countList.add(0);
        }
        for(int c:uniqueList){
            int c = count(temp,n);
            countList.set(countList.get(n)+1,c);
        }
        int modeValue = maxIntAL(countList);

        int mod = uniqueList.get(countList.get(modeValue));
        



        return 0;
    }
}
