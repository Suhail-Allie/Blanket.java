package org.example;

    public class ElectricBlanket extends Blanket {
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


