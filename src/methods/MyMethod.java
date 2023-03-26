package methods;

public class MyMethod {
    public static void go()   // void method
    {
        System.out.println("this is void method");

    }
    public static int claculation()    //
    {
        int a=10;
        int b=7;
        int c=a+b/4;
        System.out.println("This is return type method");
        return c;
    }
    double total(double price,double discount) //
    {
        double total= price*discount/100d;
        System.out.println("This is return type ,parameterized method");
        return total;

    }
    private String Printmyinfo(String firstName,String lastName,int no )
    {
        String myInfo= firstName +" " +lastName +" "+ no;
        return myInfo;


    }

    public static void main(String[] args) {
        go();
        MyMethod myMethod=new MyMethod();
        System.out.println( myMethod.total(50,30));
        System.out.println(claculation());
        System.out.println(myMethod.Printmyinfo("Pinaj","Boghani",07));





    }

}
