package array;

public class StringParcing1 {
    public static void parcetoInt(){
        String s1="9057";
        //String s2=
        int a=Integer.parseInt(s1);
        System.out.println(a);
        int b=123456789;
        String s=Integer.toOctalString(b);
        System.out.println(s);

    }

    public static void main(String[] args) {
        parcetoInt();

    }
}
