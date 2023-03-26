package conditionalStatements;

public class ForLoopEx {
    public static void printName(int no) {

        System.out.println("Print my name "+no+" times");
        for ( int i=1 ; i <= no; i++) {
            System.out.println("Pinaj");

        }
    }

    public static void main(String[] args) {
        printName(4);

    }
}
