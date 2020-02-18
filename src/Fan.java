public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSlow() {
        return SLOW;
    }

    public int getMedium() {
        return MEDIUM;
    }

    public int getFast() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on){
            return "This fan speed is " + this.speed + ", color is: " + this.color + ", radius: " + this.radius + ", fan is on.";
        }
        else {
            return "This fan color is: " + this.color + ", radius: " + this.radius + ", fan is off.";
        }
    }
}
