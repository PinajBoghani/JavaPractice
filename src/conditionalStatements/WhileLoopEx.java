package conditionalStatements;

public class WhileLoopEx {
    public static void checkNumber(int a) {
        if (a > 0) {
            System.out.println("Print no from " + a + " to 10");
            while (a >= 0 && a <= 25) {
                System.out.println(a);
                a++;

            }
        } else {
            System.out.println("incorrect no");
        }
    }

    public static void main(String[] args) {
        checkNumber(3);
        checkNumber(-2);
    }
}
