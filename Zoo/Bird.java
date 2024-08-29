package Zoo;
public class Bird extends Animal {

    private double wingSpan;
    private boolean canFly;
    public Bird(String name, int age, double weigh) {
        super(name, age, weigh);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }
    public double getWingSpan(){
        return wingSpan;
    }
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }
    public boolean canFly(){
        return canFly;
    }
    public void setcanFly(boolean canFly){
        this.canFly = canFly;
    }
    
    
    

    

    
}
