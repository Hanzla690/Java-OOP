public class Address {

    private String location;
    private String city;
    private String country;
    
    public Address(String location, String city, String country){
        this.location = location;
        this.city = city;
        this.country = country;
    }
    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    
    public void display_info(){
        System.out.printf("Address: %s %s, %s",location, city, country);
    }
}
