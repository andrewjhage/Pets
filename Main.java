import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Enum for Color
enum Color {
    RED, BLUE, GREEN, YELLOW, PURPLE, ORANGE
}
// Pet interface
interface Pet {
    void play();
    void feed();
    void makeSound();
    Attribute getAttribute1();
    Attribute getAttribute2();
}


// Attribute interface
interface Attribute {
    void incrementValue();
    void decrementValue();
    String getValue(Integer key);
    Integer getCurrentValue();

    String getColor();
}










//Runs the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creates the pets
        Attribute fishHunger = new HungerAttribute();
        Attribute fishHappiness = new HappinessAttribute();
        Pet fish = new Fish(fishHunger, fishHappiness, Color.BLUE);

        Attribute birdHunger = new HungerAttribute();
        Attribute birdHappiness = new HappinessAttribute();
        Pet bird = new Bird(birdHunger, birdHappiness, Color.YELLOW);

        // Prompts for user interaction
        System.out.println("Choose a Pet to interact with:");
        System.out.println("1- Fish");
        System.out.println("2- Bird");

        int choice = scanner.nextInt();
        Pet selectedPet = (choice == 1) ? fish : bird;

        while (true) {
            System.out.println("Choose from the following:");
            System.out.println("1- play");
            System.out.println("2- feed");
            System.out.println("3- make sound");
            System.out.println("4- view color");
            System.out.println("5- view hunger value");
            System.out.println("6- view happiness value");

            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    selectedPet.play();
                    break;
                case 2:
                    selectedPet.feed();
                    break;
                case 3:
                    selectedPet.makeSound();
                    break;
                case 4:
                    System.out.println("Color: " + selectedPet.getAttribute1().getColor());
                    break;
                case 5:
                case 6:
                    System.out.println(selectedPet.getAttribute1().getValue(action));
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            scanner.nextLine();
        }
    }
}
