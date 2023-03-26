package accessModifier;

import accessModifier1.Class1;
import accessModifier1.Class2;

public class ClassB {
    void display(){
        System.out.println("this is access through same package");
    }
   public void show(){
       System.out.println("this is public ");

   }public static void main(String[] args) {
        Class1 class1=new Class1();
        System.out.println(class1.myAddress);
        Class2 class2=new Class2();
        System.out.println(Class2.publicAcc);
        System.out.println(ClassA.name);
        ClassA classA=new ClassA();
        classA.clickName();

    }
}
