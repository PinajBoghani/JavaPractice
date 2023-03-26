package allOperators;

public class ArithmeticOp {
    public static void getfacto(int n){
        int result = 1;
        for (int a = 1; a <= n; a++){
            result = result * a;

        }
        System.out.println("factorial "+n+" is- "+result);
    }

    public static void main(String[] args) {
        getfacto(3);
        getfacto(7);

    }

}






