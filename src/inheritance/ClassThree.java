package inheritance;

public class ClassThree extends ClassTwo{
    public void Upgrade(){


        if (result=="Pass") {
            System.out.println("you are awarded with Gold medal");
        }else
        System.out.println("Sorry,you are not");
    }

    public static void main(String[] args) {
        ClassThree classThree=new ClassThree();
        classThree.reslut(9,"Ram",24);
        classThree.Upgrade();
        classThree.reslut(7,"Jaiveer",85);
        classThree.Upgrade();
    }
}
