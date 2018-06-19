public class V2_ex12 {
    public static void main(String[] args) {
        User[] users = new User[3];

        User u1 = new User("Kalle","Stockholm","Sweden",25);
        users[0] = u1;

        User u2 = new User("Joel","Malmö","Sweden",55);
        users[1] = u2;

        User u3 = new User("Adam","Helsingborg","Sweden",45);
        users[2] = u3;

        SearchUsers susers = new SearchUsers();
        int maxage = susers.getMaxAgedUser(users);
        System.out.println("max age= " + maxage);

        Car car = new Car("Volvo",20);
        System.out.println(car.model);
        System.out.println(car.age);

        Adress adress1 = new Adress("Javier D.","Tomgatan 13","c/o ingen",
                "15624", "Stockholm", "Sverige");
        Adress adress2 = new Adress("Hugo W.","Storaveny 243","c/o ingen",
                "18926", "Stockholm", "Sverige");
        Adress adress3 = new Adress("Rosa T.","Ballong allé 14","c/o ingen",
                "12783", "Stockholm", "Sverige");

        Order order = new Order(13,"Pokemon",adress1,adress2,adress3);

        System.out.println(order.invoice.adressline1);

        Test.testar("mina nummer är ",1);
        Test.testar("mina nummer är ",1,56,18,23,99);
    }
}

class Test{
    public static void testar(String s, int ...i){
        for (int a:i) {
            System.out.println(s+a);
        }
    }
}

class Car{
    public String model;
    public int age;

    public Car(String model, int age){
        this.model = model;
        this.age = age;
    }
}

class Order{
    public int id;
    public String product;
    public Adress home;
    public Adress delivery;
    public Adress invoice;

    public Order(int id, String product, Adress home, Adress delivery, Adress invoice){
        this.id = id;
        this.product = product;
        this.home = home;
        this.delivery = delivery;
        this.invoice = invoice;
    }
}

class Adress{
    public String name;
    public String adressline1;
    public String adressline2;
    public String zipcode;
    public String city;
    public String country;

    public Adress(){
    }

    public Adress(String name, String adressline1, String adressline2, String zipcode, String city, String country){
        this.name = name;
        this.adressline1 = adressline1;
        this.adressline2 = adressline2;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
    }
}