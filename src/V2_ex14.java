public class V2_ex14 {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Javier","Gatan 12",
                "15289","Stockholm","min.email@domän.com");
        System.out.println(customer);
    }

}

class Customer{
    private String id;
    private String name;
    private String address;
    private String zipcode;
    private String city;
    private String email;

    public Customer(int id, String name, String address, String zipcode, String city, String email){
        setId(id);
        setName(name);
        setAddress(address);
        setZipcode(zipcode);
        setCity(city);
        setEmail(email);
    }

    public int getId(){
        return Integer.parseInt(id);
    }

    public void setId(int id){
        if(id<0){
            this.id = "0";
        } else {
            this.id = Integer.toString(id);
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() == 0){
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.length()>20){
            this.address = address.substring(0,20);
        } else {
            this.address = address;
        }
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        boolean isDigit = true;
        boolean isFiveLong = false;
        if(zipcode.length() == 5) {
            for (int i = 0; i < zipcode.length(); i++) {
                if (!Character.isDigit(zipcode.charAt(i))) {
                    isDigit = false;
                    break;
                }
            }
            isFiveLong = true;
        }
        if(isFiveLong && isDigit){
            this.zipcode = zipcode;
        } else {
            this.zipcode = "00000";
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isValidEmail(email)){
            this.email = email;
        } else {
            this.email = "";
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean isValidEmail(String email){
        boolean isValid = false;
        if(email.length()>5){
            if(email.indexOf('@')>0 && email.lastIndexOf('.')>0){
                if(email.lastIndexOf('.')-email.indexOf('@') > 1){
                    isValid = true;
                }
            }
        }
        return isValid;
    }
}
