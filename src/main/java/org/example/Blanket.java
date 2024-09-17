package org.example;

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


