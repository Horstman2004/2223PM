public class BufferTester {
    //read in the file and print to the console
    public static void main(String args[]){
        BufferWriter.writeString("Hello World");
        BufferWriter.saveAndClose();
        System.out.println(BufferWriter.readString());
    }
}
