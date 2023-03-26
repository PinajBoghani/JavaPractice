package conditionalStatements;

public class TimeTable {
    public static void dosuareroot(int no){
        for(int i=1;i<=no;i++){
            System.out.println("Square root of "+i+" = "+i*i);
        }

    }
    public static void doTable(int no) {

        System.out.println("===============================");
        System.out.println("This is the table of "+no);
        for (int i = 1; i <= 10; i++) {

                     System.out.println( no +"x" +i +"="+no*i);

        }

    }
    public static void main(String[] args) {
        doTable(8);
        dosuareroot(79);
    }
}


