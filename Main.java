public class Main {

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call method with int parameters
        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3 is: " + result1);

        // Task 4: Call overloaded method with int parameters
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        // Task 5: Call overloaded method with double parameters
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 is: " + result3);
    }

    // Task 1: Create a class Product inside Main class
    static class Product {
        
        // Task 3: Create a method with int parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with int parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method with double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }
}
