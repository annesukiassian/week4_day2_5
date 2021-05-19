package Day2.Exercise3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSideA(9);
        triangle.setSideB(7);
        triangle.setSideC(10);
        triangle.check(triangle);
        Triangle triangle1 = new Triangle();
        triangle1.setSideA(8);
        triangle1.setSideB(8);
        triangle1.setSideC(10);
        triangle1.checkRight(triangle1);
        triangle1.calculate(triangle1);
    }
}
