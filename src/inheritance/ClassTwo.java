package inheritance;

public class ClassTwo extends ClassOne{
    public void reslut(int no,String name1,int marks){
      //  getDetail();
        rollNo=no;
        name=name1;


       if(marks>=35 && marks<=100){
            result="Pass";
       }

       else

           result="Fail";
        getDetail();


    }

    public static void main(String[] args) {
      //  ClassTwo classTwo=new ClassTwo();
       //classTwo.reslut(23,"Ram",89);
      // classTwo.reslut(4,"Shyam",30);



    }
}
