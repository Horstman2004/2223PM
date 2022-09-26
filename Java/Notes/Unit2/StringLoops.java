package Notes.Unit2;

public class StringLoops {
    public static void main(String[] args){
        //Examples of Loops utilize with Strings
        //Seuence Data --> Strings, Array, List, ArrayList

        //Count the number of chars in a string
        howMany("GIGGLING","G");

        spaceReader("This sentence.  has.  double space.  !");

        //input a banana and print out bnn
        removeVowels("banana");

        //Password Cracker
        passwordCrack("123456");
    }

    private static void howMany(String s, String v){
        //find and count v in s
        int count = 0;

        for(int i=0; i<s.length(); i++){
            //substring returns a porton of the string  s[4:7]
            if(s.toUpperCase().substring(i,i+1).equals(v.toUpperCase())){
                count=count+1;
            } 
        }
        System.out.println(count);
    }

    private static void spaceReader(String s){
        // String output="";

        System.out.println(s.replace("  ","  "));

        // for(int i=0;i<s.length()-1;i++){
        //     if(s.substring(i,i+2).equals("  ")){
        //         output+=" ";
        //     }
        //     else{
        //         output+=s.substring(i,i+1);
        //     }
        // }
    }

    private static void removeVowels(String s){
        //System output="";



        System.out.println();

        
    }

    private static void passwordCrack(String p){
        String guess="";
        int count=0;
        
        while(!guess.equals(p)){
            count++;
            guess=String.valueOf(count);

        }
        System.out.println("Got it!");
        System.out.println(count);
        
    }



}
