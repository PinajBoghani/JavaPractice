package conditionalStatements;

public class LeapYear {
    public static void showLeapYear(int year){
        if(((year%4==0)&&(year%100!=0)) ||(year%400==0))
            System.out.println(year+ " is leap year");
        else
            System.out.println(year+ " is not leap year");

    }
    public static void main(String[] args) {
        showLeapYear(2024);
        showLeapYear(2022);

    }
}
