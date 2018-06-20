public class V2_ex15 {
    public static void main(String[] args) {
        Tire[] wheels = new Tire[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Tire(100);
        }
        Door[] doors = new Door[4];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
        Car volvo = new Car(1000,wheels,doors);
        Car volvo2 = new Car(volvo);
        System.out.println("Din bil väger: " + volvo.getWeight());
        System.out.println("Din andra bil väger: " + volvo2.getWeight());
    }
}
