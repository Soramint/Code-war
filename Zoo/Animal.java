package Zoo;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name,int age,double weigh){
        this.name = name;
        this.age = age;
        this.weight = weigh;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public double Weight(){
        return weight;
    }
    public void setWame(double weight){
        this.weight = weight;
    }
    
    
}
