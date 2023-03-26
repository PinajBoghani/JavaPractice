package conditionalStatements;

import java.util.Locale;

public class Vowel {
    public static void main(String[] args) {
        String name = "Its a beautiful day";
        name=name.toLowerCase();
        System.out.println(name);
        int count=0;
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'|| name.charAt(i) == 'u') {
               count++;
                System.out.println("vowel is an index no - "+i +" and it is - " +name.charAt(i));
            }

        }
        System.out.println("total vowels are "+count);
    }

    }

