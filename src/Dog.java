import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double weight;
    private transient int lives;

    public Dog(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override public String toString(){
        return this.name + this.age + this.weight;
    }
}
