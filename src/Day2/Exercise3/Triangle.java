package Day2.Exercise3;

public class Triangle {
    private int sideA;
    private double sideB;
    private int sideC;

    Triangle() {
    }

    ;

//    Triangle(int sideA, int sideB, int sideC) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//    }

    public void setSideA(int sideA) {
        if (sideA >= 0 && sideA <= 20) {
            this.sideA = sideA;
        }
    }

    public void setSideB(double sideB) {
        if (sideB >= 0 && sideB <= 20) {
            this.sideB = sideB;
        }
    }

    public void setSideC(int sideC) {
        if (sideC >= 0 && sideC <= 20) {
            this.sideC = sideC;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    private boolean isTriangleValid(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            return true;
        }
        return false;
    }

    public void check(Triangle triangle) {
        if (isTriangleValid(sideA, (int) sideB, sideC)) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }

    private boolean isTriangleRight(int sideA, double sideB, int sideC) {
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
            return true;
        } else if (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)) {
            return true;
        } else if (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) {
            return true;
        }
        return false;
    }

    public void checkRight(Triangle triangle1) {
        if (isTriangleRight(sideA, sideB, sideC)) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }
    }

    public void calculate(Triangle triangle1) {
        if (isTriangleRight(sideA, sideB, sideC)) {
            if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
                System.out.println(sideA * sideB / 2);
            } else if (Math.pow(sideB, 2) + Math.pow(sideC, 2) == Math.pow(sideA, 2)) {
                System.out.println(sideB * sideC / 2);
            } else if (Math.pow(sideA, 2) + Math.pow(sideC, 2) == Math.pow(sideB, 2)) {
                System.out.println(sideA * sideC / 2);
            }
        } else {
            System.out.println("Perimeter is " + calculate(triangle1, 5));
        }
    }

    public double calculate(Triangle triangle1, int a) {
        return sideA + sideB + sideC;
    }

}
