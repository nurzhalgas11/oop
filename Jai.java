
class Operation extends Thread{
    String OperationName;
    int OperationTime;
    Operation(String operationName,int OperationTime){
        this.OperationName=operationName;
        this.OperationTime=OperationTime;

    }


    public void run() {
        System.out.println("Operation "+ OperationName+" started");
        for (int i =1 ; i <= OperationTime; i++) {
            System.out.println("Operation "+OperationName+" : "+i+" seconds");
        }
        System.out.println("Operation "+ OperationName+" finished");
    }
}
public class Jai {
    public static void main(String[] args) {
        Operation f1=new Operation("login",10);
        Operation f2=new Operation("login",5);
        Operation f3=new Operation("login",4);
        Operation f4=new Operation("login",7);
        Operation f5=new Operation("login",3);
        Operation f6=new Operation("login",9);
        Operation f7=new Operation("login",5);
        Operation f8=new Operation("login",1);
        Operation f9=new Operation("login",14);
        Operation f10=new Operation("login",1);
        f1.start();
    }


}