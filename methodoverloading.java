public class OverloadingExample {
    public void display(int num) {
        System.out.println("Number: " + num);
    }

    public void display(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display(100);  // Calls first method
        obj.display("Java");  // Calls second method
    }
}
