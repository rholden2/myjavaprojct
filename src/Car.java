public class Car {


    private String colour;
    private int wheels;

    public Car(String colour, int wheels) {
        this.setColour(colour);
        this.wheels = wheels;
    }

    public void printDetails(){

        System.out.println("The car has " + this.wheels + " wheels. And the colour is " + this.getColour());

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
