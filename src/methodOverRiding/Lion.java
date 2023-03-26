package methodOverRiding;

public class Lion extends Monkey{
    public static void says(){
        System.out.println("Lion roars");
        Dog.says();
        Cat.says();
        Monkey.says();
    }

    public static void main(String[] args) {

   says();

    }
}
