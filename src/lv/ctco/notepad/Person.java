package lv.ctco.notepad;

public class Person {
    String name;
    String lastname;
    String email;

    public Person (String name, String lastName, String email){
        this.name = name;
        this.lastname = lastName;
        this.email = email;
    }

    public void printPersonDetails(){
        System.out.printf("Name: %s, Lastname: %s, Email: %s\n", this.name,this.lastname, this.email);
    }
}
