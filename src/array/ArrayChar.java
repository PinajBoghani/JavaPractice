package array;

public class ArrayChar {

    public static void getCharReverse(char[]a){
        System.out.println("Reverse Order");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    public static void getChar(char[] a){
        for (char b:a) {
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
        char[]a={'a','b','c','d','e',};
        getChar(a);
        getCharReverse(a);

    }
}
