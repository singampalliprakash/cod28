public class RecursionExample {
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        RecursionExample obj = new RecursionExample();
        int result = obj.factorial(5);
        System.out.println("Factorial: " + result);
    }
}
