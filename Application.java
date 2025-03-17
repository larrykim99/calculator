public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Hello, World!");
        System.out.println("2 + 2 = " + calculator.addition(2, 2));
        System.out.println("2.5 + 2.5 = " + calculator.addition(2.5, 2.5));
    }
}