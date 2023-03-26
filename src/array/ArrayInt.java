package array;

public class ArrayInt {
    public static void printReverseNo() {
        int[] rollNo = {101, 102, 103, 105, 108, 104};
        int rollNoLenth = rollNo.length;
        System.out.println("Reverse Rollno");
        for (int i = rollNoLenth - 1; i >= 0; i--) {
            System.out.println(rollNo[i]);
        }
    }

    public void printNo(int[] rollNo) {
        System.out.println();

        for (int x : rollNo) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrayInt arrayInt = new ArrayInt();
        int[] rollNo = {101, 102, 103, 105, 108, 104};
        arrayInt.printNo(rollNo);
        printReverseNo();
    }
}
