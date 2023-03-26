package conditionalStatements;

public class IfElseExample {
    public static void findMaxNo(int a,int b,int c){
        if(a!=b&&b!=c&&c!=a) {
            if (a > b && a > c)
                System.out.println(a + " is greater no");
            else if (b > a && b > c)
                System.out.println(b + " is greater no");
            else
                System.out.println(c + " is greater no");
        }
        else
            System.out.println("Numbers are same");
    }

    public static void main(String[] args) {
        findMaxNo(89,9,8);
        findMaxNo(6,6,8);
    }
}