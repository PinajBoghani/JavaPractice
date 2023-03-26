package variablesAndDatatypes;

public class GlobalVariable {
    int price=245;
    int discount=30;
    float total;
    public void total()
    {
        total=price*discount/100;
        System.out.println("Discount Price "+total);

    }

    public static void main(String[] args) {
        GlobalVariable Gobj=new GlobalVariable();
        System.out.println("Original Price "+Gobj.price);
        Gobj.total();

    }

}

