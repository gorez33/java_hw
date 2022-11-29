public class Human {
    private int fingers;
    private double haar;
    private String name;

    public Human(int fingers, double haar, String name) {
        this.fingers = fingers;
        this.haar = haar;
        this.name = name;
    }

    public int getFingers() {
        return fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public double getHaar() {
        return haar;
    }

    public void setHaar(double haar) {
        this.haar = haar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printOut(){System.out.println("fingers: " + fingers + "haar: " + haar + "name: "+ name);}
}

