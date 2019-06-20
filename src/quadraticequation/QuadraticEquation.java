package quadraticequation;

public class QuadraticEquation {

    private double a, b, c, detal;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getDiscriminant() {
        return this.detal = this.b * this.b - 4 * this.a * this.c;
    }

    double getRoot1() {
            return (-this.b + Math.sqrt(this.detal)) / (2 * this.a);
    }
    double getRoot2() {
            return (-this.b - Math.sqrt(this.detal)) / (2 * this.a);
    }

}
