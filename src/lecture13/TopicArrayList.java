package lecture13;

import java.util.ArrayList;

public class TopicArrayList {
    public static void main(String[] args) {
        ArrayList<String>Clothes=new ArrayList<>();
        Clothes.add("T-shirt");
        Clothes.add("Top");
        Clothes.add("Blazer");
        Clothes.add("Dress");
        Clothes.add("Skirts");
        Clothes.add(null);
        System.out.println(Clothes);
        System.out.println(Clothes.get(2)); //to get value by index position 2
        Clothes.set(1,"Midi Dress");  //to set value by index position
        System.out.println(Clothes);
        for(String women:Clothes) {
            System.out.println(women);
        }
            ArrayList<Integer>no=new ArrayList<>();
            no.add(34);
            no.add(4);
            no.add(78);
            no.add(7);
            no.add(8);
            no.add(null);  // we can add null many times
            no.add(null);
            no.add(65);
        System.out.println(no);

            int total=no.get(1)+no.get(3);
            System.out.println(total);
        System.out.println(no.size());  // to find length of list

        }

    }

