package BeansPackage;

public class Emp1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setID(101);
        e.setName("Ram");
        System.out.println(e.getID());
        System.out.println(e.getName());
    }
}