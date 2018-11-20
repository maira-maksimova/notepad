package lv.ctco.notepad;

public class Person {
    private static int counter = 0;
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person() {
        counter ++;
        id = counter;
    }

    public void printPersonDetails() {
        System.out.printf("Name: %s, Lastname: %s, Email: %s\n", this.name, this.lastname, this.email);
    }

    //alt+insert - generate getter/setter/constructor/toString


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
