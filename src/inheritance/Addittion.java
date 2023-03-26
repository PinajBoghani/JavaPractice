package inheritance;

public class Addittion extends Calculator{
   public static int total;
   Addittion(int a,int b){
       no1=a;
       no2=b;

   }
    public void add(){
        total=no1+no2;
        System.out.println(total);

    }

    public static void main(String[] args) {
        Addittion addittion=new Addittion(3,89);
        addittion.add();





    }
}
