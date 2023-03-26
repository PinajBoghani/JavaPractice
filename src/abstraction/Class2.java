package abstraction;

public class Class2 extends Class1{
    @Override
  void forgotpassword() {
        System.out.println("Enter new password");

    }

    public static void main(String[] args) {
        Class2 class2=new Class2();
        login();
        class2.logout();
        class2.forgotpassword();
    }
}
