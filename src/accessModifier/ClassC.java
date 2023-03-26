package accessModifier;

public class ClassC {
    public static void main(String[] args) {


        int no = 10;
        final String name = "Ram";
        String name1 = name.replace("Ram", "Shyam");
        System.out.println(name1);
        System.out.println(name);
    }
}