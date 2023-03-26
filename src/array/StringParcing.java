 package array;

public class StringParcing {
    public static void main(String[] args) {
        String s="45";
        String s1="123";
        String s2="name";// it gave runtime error,alphabates doesnt covert to number

        int no1=Integer.parseInt(s);
        int no=Integer.parseInt(s1);
        System.out.println(no+no1);  //it will do addition of no1 and no beacause it convert into int

        int a=123;
        int b=70;
        String name=Integer.toString(a);
        String name1=Integer.toString(b);
        System.out.println(name+name1);   //it will do concatenation of name and name1 beacuse it convert to string

    }

}
