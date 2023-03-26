package methods;

import java.util.Locale;

public class ClassString {

    public static void main(String[] args) {

        String line = "Hello people";
        String line2 = "String is a class,";
        String line3 = "jAVA is object oriented language";

        int Name=line.length();
        System.out.println(Name);

      String newLine=line.replace("Hello people","good morning");
        System.out.println(newLine);

        String uppercaseName=line2.toUpperCase(Locale.ROOT);
        System.out.println(uppercaseName);
        String lowercaseName=line3.toLowerCase(Locale.ROOT);
        System.out.println(lowercaseName);

        char a=line3.charAt(3);
        System.out.println(a);

        String concateLine=line.concat(line2).concat(line);
        System.out.println(concateLine);
       boolean contain=line2.contains("is");
        System.out.println(contain);
       boolean contain1=line2.contains("no");
        System.out.println(contain1);
        int no=line.indexOf(0);
        System.out.println(no);


    }
}
