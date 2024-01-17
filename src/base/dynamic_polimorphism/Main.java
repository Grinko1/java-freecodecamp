package base.dynamic_polimorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.println("(1 = dog) or (2=cat)");
        int choice = scanner.nextInt();

        Animal animal;
        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            System.out.println("That choice was incorrect");
        }
        scanner.close();
    }
}
