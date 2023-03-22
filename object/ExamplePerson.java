package object;

public class ExamplePerson {
    private String name;
    private String lastName;
    private String age;
    private String phone;

    ExamplePerson(String name, String lastName, String age, String phone){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public static void main(String args[]){
        ExamplePerson person = new ExamplePerson("ezequiel","Sosa","26","2321112");
        System.out.println(person);
   }  
}
