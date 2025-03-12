package lattesite.structureddata.schemas;

public class StructuredDataQuantitativeValue {

    private final int minValue;
    private final int maxValue;
    private final UnitCode unitCode;

    public StructuredDataQuantitativeValue(
            int minValue,
            int maxValue,
            UnitCode unitCode
    ) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unitCode = unitCode;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public UnitCode getUnitCode() {
        return this.unitCode;
    }

    public enum UnitCode {
        DAY;

        public String getValue() {
            return this.name();
        }
    }

}
