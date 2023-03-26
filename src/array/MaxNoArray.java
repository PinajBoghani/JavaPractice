package array;


public class MaxNoArray {
    int array[] = {10, 20, 25, 63, 96, 57};
    public static void GetmaxNo() {
        int array[] = {-10, 20, 250, -63, 96, 57};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];

            }
        }
        System.out.println("This is the max no "+temp);
        for(int i=0;i<array.length;i++){
            if(temp>array[i]){
                temp=array[i];
            }
        }
        System.out.println("This is the mix no "+temp);
    }

        public static void main(String args[]){
            GetmaxNo();

        }
    }

