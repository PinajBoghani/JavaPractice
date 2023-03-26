package variablesAndDatatypes;
public class StaticVariable {
    static String namePlate="JAI007";
    static String carBrand="Range Rover";
    static String color="Black";
    static int passenger=4;
    static int driver=1;

    public static void start()
    {
        System.out.println("Car has been started");
    }
    public static void goingTo()
    {
        System.out.println("They are going to hike");
    }


    public static void main(String[] args) {
        System.out.println("CarNo "+namePlate+" "+color+" "+carBrand);
        System.out.println(passenger+" Passengers and "+driver +" driver sat on car");
        start();
        goingTo();


    }
}
