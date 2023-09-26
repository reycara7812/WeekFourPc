package pc;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String program) {
        System.out.println(program + " is now running...");
    }

    @Override
    public String toString() {
        return "\nMotherboard->\nModel:" + model + "\nManufacturer:" + manufacturer +
                "\nRam slots:" + ramSlots + "\nCard slots:" + cardSlots + "\nBIOS: " + bios;
    }
}
