public class V2_ex15 {
    public static void main(String[] args) {
        Tire[] wheels = new Tire[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Tire(100);
        }
//        for(Tire tire:wheels){
//            tire = new Tire(5);
//        }
        Door[] doors = new Door[4];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
        Car volvo = new Car(1000,wheels,doors);
        System.out.println("Din bil väger: " + volvo.getWeight());
    }
}
