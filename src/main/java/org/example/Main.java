package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n 1. Add 2. Search 3. Remove 4. List 5. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1" :
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("email: ");
                    String email = sc.nextLine();

                    manager.add(new Contact(name, phone , email));
                    break;

                case "2" :
                    System.out.print("Search prefix: ");
                    manager.searchByPrefix(sc.nextLine());
                    break;

                case "3":
                    System.out.print("Name to remove: ");
                    manager.remove(sc.nextLine());
                    break;
                case "4":
                    manager.listAll();
                    break;
                case "5":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Invalid choice.");

            }
        }

    }
}
