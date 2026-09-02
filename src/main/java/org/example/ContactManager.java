package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContactManager {
    private List <Contact> contacts = new ArrayList<>();

    public void add(Contact c) {
        contacts.add(c);
        System.out.println("Added: " + c);
    }

    public void remove(String name) {
        boolean removed = contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
        System.out.println(removed ? "Removed "+ name : "Not found: " + name);
    }

    public void searchByPrefix(String prefix) {
        System.out.println("Result for name prefix: " + prefix);
        for (Contact c : contacts) {
            if(c.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
                System.out.println(c.getName() + " | " + c.getPhone() +  " | " + c.getEmail());
            }

        }
    }

    public void listAll() {
        if(contacts.isEmpty()) {
            System.out.println("No contacts yet");
        }

        for(Contact c : contacts)
        {
            System.out.println(c);
        }
    }
}
