public class Person {
    // Class 변수들 
    private String name;
    private int phone;
    private String address;
    // Class의 생성자들
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    public Person(String name, int phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    // Getter 메소드들
    public String getName() { return this.name; }
    public int getPhone() { return this.phone; }
    public String getAddress() { return this.address; }
    // Setter 메소드들
    public void setName(String name) { this.name = name; }
    public void setPhone(int phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}
