package lecture13;

import java.util.ArrayList;
import java.util.Collections;

public class MaxNoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myNo = new ArrayList<>();
        myNo.add(4);
        myNo.add(34);
        myNo.add(-8);
        myNo.add(3);
        myNo.add(49);
        myNo.add(5, 90); //add array on index 5
        myNo.add(78);
        System.out.println(myNo);
        myNo.remove(4);       //remove no by mentioning index position
        System.out.println(myNo);
        Integer max = Collections.max(myNo);
        System.out.println(max + " is a max no");
        Integer minimum = Collections.min(myNo);
        System.out.println(minimum + " is a minimum no");
    }
}



  /* Collections.max(list). max() method sort the list of values in the natural order and return max value from it.*/





