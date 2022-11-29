public class Main {
    public static void main(String[] args) {

        printDouble(24.4, 23.4);
        System.out.println(pin(50,30));
        System.out.println(sun(40, 30));

        Human human = new Human(20, 10000, "Yan");

        human.printOut();
    }


    static void printDouble(double a, double b) {
        System.out.println(" a = " + a + " b = " + b);
    }

    static int pin(int a, int b) {
        return a-b;
    }

    static int sun(int a, int b){
        return a+b;
    }

}