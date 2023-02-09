package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure implements Printer {
    public static double MAX_HIGH = 20;
    public static double MAX_UPPER_BASE = 20;
    public static double MAX_LOWER_BASE = 20;

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
                .append(" IsoscelesTrapezoid, area: ")
                .append((upperBase + lowerBase) * high / 2)
                .append(" sq.units,")
                .append(" upperBase: ")
                .append(upperBase)
                .append(" units")
                .append(" lowerBase: ")
                .append(lowerBase)
                .append(" units, color: ")
                .append(getColor()));
    }
}
