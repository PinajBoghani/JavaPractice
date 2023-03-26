package conditionalStatements;

public class GradeClass {
    public static void giveGrade(int marks) {
      if(marks<=100&&marks>=0)

        if (marks >= 35 && marks <= 50)
            System.out.println("Grade D");
        else if (marks >= 51 && marks <= 60)
            System.out.println("Grade C");
        else if (marks >= 61 && marks <= 70)
            System.out.println("Grade B");
        else if (marks >= 71 && marks <= 90)
            System.out.println("Grade A");
        else if (marks >= 91 &&marks<=100)
            System.out.println("Grade A+");
        else
            System.out.println("failed");
        else
          System.out.println("incorrect input");


    }

    public static void main(String[] args) {
        giveGrade(45);
        giveGrade(-98);
        giveGrade(3);
    }
}


