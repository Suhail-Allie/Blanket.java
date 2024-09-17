package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Blanket
    public class Blanket {
        private String size;
        private String color;
        private String material;
        private double price;

        // Constructor with default values
        public Blanket() {
            size = "Twin";
            color = "white";
            material = "cotton";
            price = 30.00;
        }

        // Setters
        public void setSize(String newSize) {
            if (newSize.equals("Twin")) {
                price = 30.00;
            } else if (newSize.equals("Double")) {
                price = 40.00;
            } else if (newSize.equals("Queen")) {
                price = 55.00;
            } else if (newSize.equals("King")) {
                price = 70.00;
            } else {
                resetToDefault();
            }
            size = newSize;
        }

        public void setMaterial(String newMaterial) {
            if (newMaterial.equals("cotton")) {
                price += 0;
            } else if (newMaterial.equals("wool")) {
                price += 20.00;
            } else if (newMaterial.equals("cashmere")) {
                price += 45.00;
            } else {
                resetToDefault();
            }
            material = newMaterial;
        }

        public void setColor(String newColor) {
            color = newColor;
        }

        // Getters
        public String getSize() {
            return size;
        }

        public String getColor() {
            return color;
        }

        public String getMaterial() {
            return material;
        }

        public double getPrice() {
            return price;
        }

        // Reset to default values
        private void resetToDefault() {
            size = "Twin";
            color = "white";
            material = "cotton";
            price = 30.00;
        }

        // toString method
        public String toString() {
            return "Blanket [size=" + size + ", color=" + color + ", material=" + material + ", price=" + price + "]";
        }
    }

    //ElectricBlankets
    public class ElectricBlanket extends org.example.Blanket {
        private int heatSettings;
        private boolean hasAutoShutoff;

        // Default constructor
        public ElectricBlanket() {
            super();  // Call the parent class (Blanket) constructor
            this.heatSettings = 1;
            this.hasAutoShutoff = false;
        }

        // Set the number of heat settings
        public void setHeatSettings(int settings) {
            if (settings >= 1 && settings <= 5) {
                this.heatSettings = settings;
            } else {
                this.heatSettings = 1;
            }
        }

        // Get the number of heat settings
        public int getHeatSettings() {
            return heatSettings;
        }

        // Set whether the blanket has automatic shutoff
        public void setAutoShutoff(boolean hasShutoff) {
            this.hasAutoShutoff = hasShutoff;
            if (hasShutoff) {
                // Add premium to price if it has automatic shutoff
                setPrice(getPrice() + 5.75);
            }
        }

        private void setPrice(double v) {
        }

        // Get whether the blanket has automatic shutoff
        public boolean hasAutoShutoff() {
            return hasAutoShutoff;
        }

        // Override toString method to include new features
        @Override
        public String toString() {
            String shutoffInfo = hasAutoShutoff ? "with automatic shutoff" : "without automatic shutoff";
            return super.toString() + ", Heat Settings: " + heatSettings + ", " + shutoffInfo;
        }
    }

    //DemoBlankets
    public class DemoBlankets {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create a Blanket and display starting values
            org.example.Blanket blanket = new org.example.Blanket();
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
            org.example.ElectricBlanket electricBlanket = new org.example.ElectricBlanket();
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

}