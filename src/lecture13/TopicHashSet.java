package lecture13;

import java.util.HashSet;

public class TopicHashSet {
    public static void main(String[] args) {
        HashSet<String>StudentNames=new HashSet<>();
        StudentNames.add("Ram");
        StudentNames.add("Shyam");
        StudentNames.add("Ram");   // cant add duplicate value
        StudentNames.add("Radha");
        StudentNames.add(null);
        StudentNames.add("Gopi");
        StudentNames.add(null);      // cant add duplicate null-more than one null not allowed
        System.out.println(StudentNames);  //data come in unorder way in list

        HashSet<Integer>myNo=new HashSet<>();
        myNo.add(4);
        myNo.add(9);
        myNo.add(60);
        myNo.add(34);
        myNo.add(4);
        myNo.add(23);
        myNo.add(0);
        myNo.add(null);
        System.out.println(myNo);
        myNo.remove(23);    //to remove value mention value not index position
        System.out.println(myNo);
        System.out.println(myNo.size());



    }
}
