package accessModifier1;

import accessModifier.ClassA;
public class Class1 {
    public String myAddress="wd19";
     int accountNo=1233;
     protected static int myBal=2300;
     private static int pinNo=9010;
     protected static void showMyBalnce(){
         System.out.println("my balance "+myBal);
     }
     public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.clickName();
        Class1 class1=new Class1();
        System.out.println(class1.accountNo);
        showMyBalnce();
        classA.clickName();

     }

}
