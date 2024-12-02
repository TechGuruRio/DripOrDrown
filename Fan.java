public class Fan {
    public enum Speed {
        SLOW(1), MEDIUM(2), FAST(3);
        
        private final int value;
        
        Speed(int value) { 
            this.value = value; 
        }
        
        public int getValue() { 
            return value; 
        }
    }

    // Private data fields
    private Speed speed;
    private boolean on;
    private double radius;
    private String color;

    // No-arg constructor that creates a default fan
    public Fan() {
        this.speed = Speed.SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Accessor and mutator methods for speed
    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    // Accessor and mutator methods for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Accessor and mutator methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Accessor and mutator methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to return a string description for the fan
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (on) {
            sb.append("Fan speed: ").append(speed).append(", color: ").append(color).append(", radius: ").append(radius);
        } else {
            sb.append("Fan color: ").append(color).append(", radius: ").append(radius).append(", fan is off");
        }
        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create the first Fan object
        Fan fan1 = new Fan();
        fan1.setSpeed(Speed.FAST); // Maximum speed
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Create the second Fan object
        Fan fan2 = new Fan();
        fan2.setSpeed(Speed.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display the Fan objects
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
