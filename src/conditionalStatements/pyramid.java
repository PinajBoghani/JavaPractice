package conditionalStatements;

public class pyramid {
    public static void loop() {
        int row=5;
        for (int i = 1; i <= 5; i++) {


            for(int j=1;j<=i;j++){
                System.out.print(j +" " );
            }
            System.out.println( );
        }
    }

    public static void main(String[] args) {
        loop();

    }
}
