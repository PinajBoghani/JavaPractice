package array;

public class TypeCast {
//  static int a=10;
  //static int b=10;
 // static int discount=50;

    public static float total(int a,int b,int dis)
    {
        float total=(float)(a+b/dis);
        return total;

    }

    public static void main(String[] args) {
        System.out.println(total(5,5,50));

}}
