package allOperators;

public class LogicalOp {
    public static void main(String[] args) {


       String userName = "pinaj";
       String password = "LiveAndLetLive";
        System.out.println(userName=="pinaj" && password=="LiveAndLetLive");
        System.out.println(userName=="adf"&&password=="LiveAndLetLive");
        System.out.println(userName=="djh"&&password=="djg");

    }
}