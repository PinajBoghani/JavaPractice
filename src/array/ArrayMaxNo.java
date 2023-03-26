package array;

public class ArrayMaxNo {
    public static void getMaxNo() {
        int temp;
        int[] number = {24, 9, 56, 3, 65, 78, 34, 20};


        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
               // int k=j+1;
                if(number[i]>number[j]){
                    int max=number[i];
                    number[i] = number[j];
                    number[j] = max;

                }




            }
        }
        System.out.println(number[number.length-1]);
    }

    public static void main(String[] args) {
        getMaxNo();

    }

}
