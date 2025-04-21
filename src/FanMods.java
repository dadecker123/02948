public class FanMods {
    //Instantited variables
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
 
    // constructor for fan
    FanMods() {
       speed = SLOW;
       on = false;
       radius = 5;
       color = "blue";
    }
 
    // Section for four accessors/mutators
    int getSpeed() {
       return speed;
    }
 
    void setSpeed(int spd) {
       speed = spd;
    }
 
    boolean getOn() {
       return on;
    }
 
    void setOn(boolean state) {
       on = state;
    }
 
    double getRadius() {
       return radius;
    }
 
    void setRadius(double rad) {
       radius = rad;
    }
 
    String getColor() {
       return color;
    }
 
    void setColor(String clr) {
       color = clr;
    }
 
    //toString for displaying info
 
    public String toString() {
       String string = "";
       // if fan is on
       if (on == true)
          string = "Color: " + color + ", Radius: " + radius + ", Speed: " + speed + ", Fan is ON";
       else
          string = "Color: " + color + ", Radius: " + radius + ", Fan is OFF";
       return string;
    }
 
 }
 
    class FanModsTest {
    public static void main(String[] args) {
 
       //Test objects
       FanMods fan1 = new FanMods();
       FanMods fan2 = new FanMods();
 
       fan1.setSpeed(FanMods.FAST);
       fan1.setRadius(10.0);
       fan1.setColor("yellow");
       fan1.setOn(true);
 
       fan2.setSpeed(FanMods.MEDIUM);
       fan2.setRadius(5.0);
       fan2.setColor("blue");
       fan2.setOn(false);
 
       System.out.println("Test Fan Objects: ");
 
       System.out.println(fan1.toString());
 
       System.out.println(fan2.toString());
    }
 }



