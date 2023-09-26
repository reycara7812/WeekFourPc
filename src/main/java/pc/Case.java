package pc;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return "\nCase Information:\n" +
                "Model: " + model +
                "\nManufacturer: " + manufacturer +
                "\nPower Supply: " + powerSupply +
                "\nDimensions: " + dimensions;
    }
    }

