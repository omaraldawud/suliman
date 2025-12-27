public class RectangleDemo {

    // ===== Inner Class =====
    class Rectangle {
        private int width;
        private int height;

        // Constructor
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        // Getters
        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        // Setters
        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        // Method to compute area
        public int getArea() {
            return width * height;
        }

        @Override
        public String toString() {
            return "Rectangle (width=" + width + ", height=" + height +
                    ", area=" + getArea() + ")";
        }
    }

    // ===== Main Method (Testing the inner class) =====
    public static void main(String[] args) {

        // To access an inner class, you must create an instance of the outer class first:
        RectangleDemo demo = new RectangleDemo();

        // Create rectangle objects
        Rectangle r1 = demo.new Rectangle(5, 10);
        Rectangle r2 = demo.new Rectangle(3, 7);

        // Print them
        System.out.println(r1);
        System.out.println(r2);

        // Modify attributes
        r1.setWidth(8);
        r1.setHeight(12);

        // Print again
        System.out.println("After resizing r1:");
        System.out.println(r1);
    }
}
