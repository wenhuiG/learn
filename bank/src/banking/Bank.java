package banking;

/**
 * @author gaowenhui
 * @create 2020-01-27 18:10
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    public Bank(){
        customers=new Customer[5];
    }
    public void addCustomer (String firstName,String lastName){
        customers[numberOfCustomer]=new Customer(firstName,lastName);
        numberOfCustomer++;
    }
    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        return customers[index-1];
    }
}
