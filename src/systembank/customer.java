package systembank;

public class customer {
    String name,address;
    public customer(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void open_account(account acc){
        System.out.println("customer."+name+" Address."+address+acc.getBalance());


    }
}
