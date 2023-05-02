package BeansPackage;
import java.io.Serializable;
import java.util.*;

public class Employee implements Serializable {

    private int id;
    private String name;

    public Employee(){

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
}
