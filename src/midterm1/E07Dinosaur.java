package midterm1;

public class E07Dinosaur {

    // This height is in meters
    private double height;
    private boolean isAlive;
    private String name;
    private String favoriteFood;

    // No return type, same name as the class
    public E07Dinosaur() {
        height = 22.0;
        isAlive = false;
        name = "Brachysauraus";
        favoriteFood = "Leaves";
    }

    public E07Dinosaur(double height, boolean isAlive, String name,
            String favoriteFood) {
        this.height = height;
        this.isAlive = isAlive;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public static void dinoRoar() {
        System.out.println("Roar, I am dino.");
    }

    public String toString() {
        return this.name + " is " + this.height + " meters tall.";
    }

}
