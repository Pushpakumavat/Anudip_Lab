/*  A phone directory holds a list of names with a phone number for each name.
It is possible to find the number associated with a given name, and to specify the phone number for a given name. 
[Hint:use a HashMap to store names as keys and phone numbers as values. 
 The user can choose to find a number by providing a name or add a new name with a phone number.
                                                                                                                                                                                              The program runs in a loop until the user chooses to exit.]
*/


package Demo;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String, String> directory = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Phone Directory ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Find Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String number = sc.nextLine();
                    directory.put(name, number);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter name to find: ");
                    String searchName = sc.nextLine();
                    if (directory.containsKey(searchName)) {
                        System.out.println("Phone Number: " + directory.get(searchName));
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}



/* output :

--- Phone Directory ---
1. Add Contact
2. Find Contact
3. Exit
Enter your choice: 1
Enter name: Pushpa
Enter phone number: 3456789123
Contact added successfully!

--- Phone Directory ---
1. Add Contact
2. Find Contact
3. Exit
Enter your choice: 1
Enter name: sakshi
Enter phone number: 4865194782
Contact added successfully!

--- Phone Directory ---
1. Add Contact
2. Find Contact
3. Exit
Enter your choice: 2
Enter name to find: rashi
Contact not found!

--- Phone Directory ---
1. Add Contact
2. Find Contact
3. Exit
Enter your choice: 2
Enter name to find: Pushpa
Phone Number: 3456789123

--- Phone Directory ---
1. Add Contact
2. Find Contact
3. Exit
Enter your choice: 3
Exiting... Goodbye!

 */
