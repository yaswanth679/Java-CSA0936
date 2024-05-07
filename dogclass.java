import java.util.Scanner;
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to see Animal eating or '2' to see Dog barking:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Animal animal = new Animal();
            animal.eat(); 
        } else if (choice == 2) {
            Dog dog = new Dog();
            dog.bark(); 
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
