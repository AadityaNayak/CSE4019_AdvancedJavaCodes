package BeansPackage;

public class Cust1 {

    public static void main(String[] args) {

        Customer c = new Customer();
        c.setID(1);
        c.setName("Aaditya");
        c.setAge(21);
        c.setSub("Premium");

        System.out.println("Customer id: " + c.getID());
        System.out.println("Customer name: " + c.getName());
        System.out.println("Customer age: " + c.getAge());
        System.out.println("Subscriber: " + c.getSub());
    }
}
