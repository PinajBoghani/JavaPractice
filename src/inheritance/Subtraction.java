package inheritance;

public class Subtraction extends Calculator {
    static int total;

    public void sub() {
        total = no1 + no2;


    }
    public static void main(String[] args) {
  Subtraction subtraction=new Subtraction();
  subtraction.sub();
   // subtraction.sub(7,4);




}}
