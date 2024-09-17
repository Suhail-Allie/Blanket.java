package org.example;
import java.util.Scanner;

public class DemoBlankets {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create a Blanket and display starting values
            Blanket blanket = new Blanket();
            System.out.println("Initial Blanket values:");
            System.out.println(blanket);

            // Prompt the user to enter Blanket material and size
            String material;
            String size;
            do {
                System.out.print("Enter Blanket material (cotton, wool, cashmere) or QUIT to stop: ");
                material = scanner.nextLine();
                if (material.equalsIgnoreCase("QUIT")) {
                    break;
                }
                blanket.setMaterial(material);

                System.out.print("Enter Blanket size (Twin, Double, Queen, King): ");
                size = scanner.nextLine();
                blanket.setSize(size);

                System.out.println("Updated Blanket values:");
                System.out.println(blanket);

            } while (!material.equalsIgnoreCase("QUIT"));

            // Create an ElectricBlanket and display starting values
            ElectricBlanket electricBlanket = new ElectricBlanket();
            System.out.println("\nInitial ElectricBlanket values:");
            System.out.println(electricBlanket);

            // Prompt the user to enter ElectricBlanket material, size, heat settings, and shutoff feature
            do {
                System.out.print("Enter ElectricBlanket material (cotton, wool, cashmere) or QUIT to stop: ");
                material = scanner.nextLine();
                if (material.equalsIgnoreCase("QUIT")) {
                    break;
                }
                electricBlanket.setMaterial(material);

                System.out.print("Enter ElectricBlanket size (Twin, Double, Queen, King): ");
                size = scanner.nextLine();
                electricBlanket.setSize(size);

                System.out.print("Enter number of heat settings (1 to 5): ");
                int settings = Integer.parseInt(scanner.nextLine());
                electricBlanket.setHeatSettings(settings);

                System.out.print("Does the ElectricBlanket have automatic shutoff? (yes or no): ");
                String shutoff = scanner.nextLine();
                electricBlanket.setAutoShutoff(shutoff.equalsIgnoreCase("yes"));

                System.out.println("Updated ElectricBlanket values:");
                System.out.println(electricBlanket);

            } while (!material.equalsIgnoreCase("QUIT"));

            scanner.close();
        }
    }


