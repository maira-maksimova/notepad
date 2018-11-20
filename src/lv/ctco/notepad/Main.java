package lv.ctco.notepad;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Person> records = new ArrayList<>();

    public static void main(String[] args) {
        for (; ; ) {
            String cmd = askString("cmd: ");
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
                case "delete":
                    delete();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong command. Try 'help'");
            }
        }
    }

    private static void delete() {
        int id = askInt("Enter Id of person to delete");
        for (int i=0; i<records.size();i++) {
            if (records.get(i).getId()== id) {
                records.remove(i);
                break;
            }
        }
    }

    private static void showList() {
        if (records.size() > 0) {
//            for (Person p : records) {
//                p.printPersonDetails();
//            }
            records.forEach(person -> System.out.println(person));
        } else {
            System.out.println("No records to show");
        }
    }

    private static void showHelp() {
        System.out.println("Enter 'create' to create new record");
        System.out.println("Enter 'help' to get help");
        System.out.println("Enter 'list' to see list of persons");
        System.out.println("Enter 'exit' to exit the notepad");
    }

    private static void createPerson() {
        Person person = new Person();
        person.setName(askString("Enter name"));
        person.setLastname(askString("Enter lastname"));
        person.setEmail(askString("Enter email"));
        person.setPhone(askPhone());

        records.add(person);
    }

    private static String askPhone() {
        while (true) {
            String result = askString("Enter Phone");
            if (result.length() < 5) {
                System.out.println("Phone must be at least 5 symbols");
                continue;
            } else {
                return result;
            }
        }
    }

    public static String askString(String msg) {
        System.out.println(msg);
        while (true) {
            String result = scanner.next();
            if (result.startsWith("\"")) {
                while (!result.endsWith("\"")) {
                    result = String.join(" ", result, scanner.next());
                }
            }
            return result;
        }

    }

    public static int askInt(String msg) {
        System.out.println(msg);
        return readInt();
    }

    private static int readInt() {
        while (true) {
            try {
                int userNum = scanner.nextInt();
                return userNum;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Please enter a number");
            }
        }
    }
}
