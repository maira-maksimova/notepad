package lv.ctco.notepad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> records = new ArrayList<>();

    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("cmd: ");
            String cmd = scanner.next();
            switch (cmd) {
                case "create":
                    createPerson();
                    break;
                case "help":
                    showHelp();
                    break;
                case "list":
                    showList();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong command. Try 'help'");
            }
        }
    }

    private static void showList() {
        if (records.size()==0){
            System.out.println("No records to show");
            return;
        }
        for (Person p: records) {
            p.printPersonDetails();
        }
    }

    private static void showHelp() {
        System.out.println("Enter 'create' to create new record");
        System.out.println("Enter 'help' to get help");
        System.out.println("Enter 'list' to see list of persons");
        System.out.println("Enter 'exit' to exit the notepad");
    }

    private static void createPerson() {
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter lastname");
        String lastname = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();

        Person person = new Person(name,lastname,email);
        records.add(person);

    }

}
