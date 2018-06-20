public class Car {
    private Tire[] wheels;
    private Door[] doors;
    private float weight;

    public Car(float weight, Tire[] wheels, Door[] doors){
        this.weight = weight;
        this.wheels = wheels;
        this.doors = doors;
    }

    public Car(Car car){
        Tire[] wheels = new Tire[car.wheels.length];
        for (int i = 0; i < car.wheels.length; i++) {
            wheels[i] = new Tire(car.wheels[i].getWeight());
        }
        Door[] doors = new Door[car.doors.length];
        for (int i = 0; i < car.doors.length; i++) {
            doors[i] = new Door(car.doors[i].getWeight());
        }
        new Car(car.getChassiWeight(),wheels,doors);
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

    public float getChassiWeight(){
        return weight;
    }
}
