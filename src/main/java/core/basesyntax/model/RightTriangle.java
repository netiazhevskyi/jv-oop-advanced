package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return ((Math.sqrt(3)) * (firstLeg * secondLeg)) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle: " + getArea() + " sq.units, firstLeg: "
                + getFirstLeg() + " units, secondLeg: " + getSecondLeg()
                + " color: " + getColor());
    }
}
