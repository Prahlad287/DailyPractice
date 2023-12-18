package com.map.interface1;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<Integer, String> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);

        // Read the number of entries
        int n = in.nextInt();
        in.nextLine();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(phone, name);
        }

        // Look up names based on phone numbers
        while (in.hasNext()) {
            String query = in.nextLine();
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(query + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
            if (phoneBook.containsValue(query)) {
                for (HashMap.Entry<Integer, String> entry : phoneBook.entrySet()) {
                    if (entry.getValue().equals(query)) {
                        System.out.println(entry.getValue() + "=" + entry.getKey());
                        break;  // Stop after the first match
                    }
                }
            } else {
                System.out.println("Not found");
            }
        }
    }
}
