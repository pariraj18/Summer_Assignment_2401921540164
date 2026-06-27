interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

class Outer {
    void display() {
        System.out.println("Outer Display");
    }

    class Inner {
        void display() {
            System.out.println("Inner Display");
        }
    }
}

class Point {
    private int x, y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Point = (" + x + "," + y + ")");
    }
}

class Box {
    double length, breadth;

    Box(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    double height;

    Box3D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class Practical {
    public static void main(String[] args) {

        // Q1
        Arithmetic a = new Arithmetic();
        System.out.println("Square = " + a.square(5));

        // Q2
        Outer o = new Outer();
        o.display();
        Outer.Inner in = o.new Inner();
        in.display();

        // Q3
        Point p = new Point();
        p.setXY(10, 20);
        p.display();

        // Q4
        Box3D b = new Box3D(10, 5, 4);
        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}
