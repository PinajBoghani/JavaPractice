package inheritance;

public class classA {
    String name;
    int id;
    classA(){                     // execute when obj create
        System.out.println("This the details of student");
    }
    classA(String nm,int no){     //execute when pass parameter in obj
        name=nm;
        id=no;

    }
    public void getPercent(int marks1,int marks2){
        System.out.println("Name- "+name);
        System.out.println("Id- "+id);
        float percent=(float) ((marks1+marks2)*100) / 200;
        System.out.println("percent - " +percent +"%");
    }
   public static void getAddrress(String Add){

        System.out.println("Address "+Add);
   }
   public static void main(String[] args) {
        classA classA=new classA();
        classA classb=new classA("Pinaj",23);
        getAddrress("WD195AP");
        classb.getPercent(98,90);
        classb.getPercent(34,80);


    }
    }
