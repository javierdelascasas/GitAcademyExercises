public class Tire {
    private float weight;

    public Tire(float weight){
        this.weight = weight;
    }

    public Tire(Tire tire){
        this.weight = tire.weight;
    }

    public float getWeight(){
        return weight;
    }
}
