package methodOverloading;

public class MethodOverloadingExp {
    public static void Addition(int a, int b){

        int c=a+b;
        System.out.println(c);
    }
    void Addition(int a,float b){
        int c=(a+(int)b);
        System.out.println(c);
    }
    public static void Addition(String s1,String s2){
        int a =Integer.parseInt(s1);  //String parcing
        int b=Integer.parseInt(s2);
        int c=a+b;
        System.out.println(c);
    }
    int Addition(float a,float b,float c)
    {
       int d= (int)(a+b+c);  //narrowtypecast
        return d;
    }

    public static void main(String[] args) {
        MethodOverloadingExp methodOverloadingExp=new MethodOverloadingExp();
        Addition(10,50) ;
        Addition("10","50");
        methodOverloadingExp.Addition(10,50.1f);
        System.out.println(methodOverloadingExp.Addition(10.0f,50.0f,0.1f));
        System.out.println(methodOverloadingExp.Addition(10.5f,50.0f,1.5f));
        methodOverloadingExp.Addition(10,50.5f);
    }
}
