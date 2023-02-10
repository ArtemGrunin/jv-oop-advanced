package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure {
    public static final double MAX_HIGH = 20;
    public static final double MAX_UPPER_BASE = 20;
    public static final double MAX_LOWER_BASE = 20;
    private double high;
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(Color color, double high, double upperBase, double lowerBase) {
        super(color);
        this.high = high;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder("Figure:")
                .append(" IsoscelesTrapezoid,")
                .append(System.lineSeparator())
                .append("        area: ")
                .append(getArea())
                .append(" sq.units,")
                .append(System.lineSeparator())
                .append("        upperBase: ")
                .append(upperBase)
                .append(" units,")
                .append(System.lineSeparator())
                .append("        lowerBase: ")
                .append(lowerBase)
                .append(" units,")
                .append(System.lineSeparator())
                .append("        color: ")
                .append(getColor()));
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * high / 2.0;
    }
}
