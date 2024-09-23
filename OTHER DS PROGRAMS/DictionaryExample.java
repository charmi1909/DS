import java.util.HashMap;
import java.util.Scanner;

class Dictionary {
    private HashMap<String, String> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    
    public void put(String key, String value) {
        map.put(key, value);
    }

    
    public String get(String key) {
        return map.get(key);
    }

    
    public void remove(String key) {
        map.remove(key);
    }

    
    public void display() {
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}

public class DictionaryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Key-Value Pair");
            System.out.println("2. Get Value by Key");
            System.out.println("3. Remove Key-Value Pair");
            System.out.println("4. Display All Pairs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String keyToAdd = scanner.nextLine();
                    System.out.print("Enter value: ");
                    String valueToAdd = scanner.nextLine();
                    dictionary.put(keyToAdd, valueToAdd);
                    System.out.println("Key-Value pair added.");
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    String keyToGet = scanner.nextLine();
                    String value = dictionary.get(keyToGet);
                    if (value != null) {
                        System.out.println("Value: " + value);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter key to remove: ");
                    String keyToRemove = scanner.nextLine();
                    dictionary.remove(keyToRemove);
                    System.out.println("Key-Value pair removed.");
                    break;
                case 4:
                    System.out.println("All Key-Value Pairs:");
                    dictionary.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
