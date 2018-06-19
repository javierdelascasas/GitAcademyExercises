public class User {
    public String name;
    public String city;
    public String country;
    public int age;

    // Default constructor
    public User(){
        this.name = "";
        this.city = "";
        this.country = "";
        this.age = 0;
    }

    public User(String name, String city, String country, int age){
        this.name = name;
        this.city = city;
        this.country = country;
        this.age = age;
    }

    public User(String name, String city){
        this.name = name;
        this.city = city;
        this.country = "";
        this.age = 0;
    }
}
