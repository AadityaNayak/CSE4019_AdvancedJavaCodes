package BeansPackage;
import java.io.Serializable;
import java.util.*;

public class Customer implements Serializable {
    private int id;
    private String name;
    private int age;
    private String subscription;

    public Customer(){

    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public void setSub(String subscription){
        this.subscription = subscription;
    }

    public String getSub(){
        return subscription;
    }

}
