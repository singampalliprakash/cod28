public class Rectangle {
    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        int area = obj.calculateArea(10, 5);
        System.out.println("Area: " + area);
    }
}
