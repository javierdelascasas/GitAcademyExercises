public class Car {
    private Tire[] wheels;
    private Door[] doors;
    private float weight;

    public Car(float weight, Tire[] wheels, Door[] doors){
        this.weight = weight;
        this.wheels = wheels;
        this.doors = doors;
    }

    public float getWeight() {
        return weight;
    }
}
