package variablesAndDatatypes;

public class TypesOfVariables {
    int a=10;   //instance
    int b=20;    //instance
    boolean globalVariable=a>b;  //instance
    static int c=10;      //static
    static int d=25;      //static
    static boolean sVariable=c<d;  //static
    public static void main(String[] args) {
        int localVariable=15;            //local
        System.out.println("This is the local Variable - "+localVariable);
        TypesOfVariables myObj=new TypesOfVariables();      //create obj

       // myObj.globalVariable;

        System.out.println("This is the global variable -"+myObj.globalVariable); //call by obj
        System.out.println(sVariable+ " -this is the static variable");  //can call direct without obj





    }
}
