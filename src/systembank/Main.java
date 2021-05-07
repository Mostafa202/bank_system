package systembank;

public class Main {

    public static void main(String[] args) {
        customer cust=new customer("ahmed","cairo");
        investment inv=new investment(1000);
        stock stk=new stock("holidaymart",300);
        System.out.println("from account parant , the balance is "+inv.getBalance());
        stockorder stod=new stockorder(20,100,200,inv,stk);
    }
}





