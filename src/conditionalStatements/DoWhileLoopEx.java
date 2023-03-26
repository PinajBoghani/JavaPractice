package conditionalStatements;

public class DoWhileLoopEx {
    public static void checkNo(int a){
        do{
            System.out.println(a);
            a--;
        }while (a>=8);
    }

    public static void main(String[] args) {
        checkNo(56);
    }
}
