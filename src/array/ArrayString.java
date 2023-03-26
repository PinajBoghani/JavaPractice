package array;

public class ArrayString {
 static String[]names={"Pinaj","Jaiveer","Aviraj","Mahen","Jenny","Zoe"};
    public static void printName(){

        System.out.println("Print the name which has even index position");

      for (int i=0;i<names.length;i++){
          if(i%2==0)
              System.out.println(names[i]);
      }
    }
      public static void getName(){
          System.out.println("Print all the name");
          for (String name:names) {
              System.out.println(name);
          }
    }
       public static void main(String[] args) {
         printName();
         getName();

    }
}
