public class Main {

    public static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call the method with two integers
        int ans = p.product(10, 20);
        System.out.println("Product of two integers: " + ans);

        // Task 4: call the overloaded method with three integers
        int ans1 = p.product(1, 2, 3);
        System.out.println("Product of three integers: " + ans1);

        // Task 5: call the overloaded method with two doubles
        double ans2 = p.product(1, 2);
        System.out.println("Product of two doubles: " + ans2);
    }
}
