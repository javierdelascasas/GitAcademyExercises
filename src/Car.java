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
        Tire[] copyWheels = new Tire[car.wheels.length];
        for (int i = 0; i < car.wheels.length; i++) {
            copyWheels[i] = new Tire(car.wheels[i].getWeight());
        }
        Door[] copyDoors = new Door[car.doors.length];
        for (int i = 0; i < car.doors.length; i++) {
            copyDoors[i] = new Door(car.doors[i].getWeight());
        }
        this.weight = car.getChassisWeight();
        this.wheels = copyWheels;
        this.doors = copyDoors;
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

    public float getChassisWeight(){
        return weight;
    }
}
