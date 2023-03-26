package accessModifier1;

import accessModifier.ClassA;
import accessModifier.ClassB;

public class Class2 {
    public static String publicAcc="all over the world";
    protected String protectedAcc="Same package and subclass";
    private String privateAcc="only class";
    String defaultAcc="samePackage";


    public static void main(String[] args) {
        System.out.println(ClassA.name);
        ClassB classB=new ClassB();
        classB.show();
        Class1.showMyBalnce();


    }

}
