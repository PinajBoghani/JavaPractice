package accessModifier;

import accessModifier1.Class2;

public class ClassA {
    int no=10;
    public static String name="Pinaj";
   protected String emailId="pinaj.gmail.com";
   private String password="Be Kind";
   public  void clickName()
   {
       System.out.println("my name is "+name);
   }
   protected static void login(){
       System.out.println("loggin");
   }

   public static void main(String[] args) {
       ClassA classA=new ClassA();
        System.out.println(classA.no);
        System.out.println(Class2.publicAcc);
        Class2 class2=new Class2();



    }



}
