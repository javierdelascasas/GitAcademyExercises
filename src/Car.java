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
        float totalWeight = this.weight;
        for(Tire tire:this.wheels){
            totalWeight += tire.getWeight();
        }
        for(Door door:this.doors){
            totalWeight += door.getWeight();
        }
        return totalWeight;
    }
}
