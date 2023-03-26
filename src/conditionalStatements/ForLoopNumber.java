package conditionalStatements;

public class ForLoopNumber {
    public static void dosum(int no){

        int sum=0;
        System.out.println("Addition of number 1 to "+no);

        for(int i=1;i<=no;i++) {
          sum = sum + i;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        dosum(67);
    }
}
