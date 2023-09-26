package pc;

public class Monitor {
    private Resolution resolution;
    private String manufacturerName;
    private int modelNumber;


    public Monitor(Resolution resolution, String manufacturerName, int modelNumber){
        this.resolution = resolution;
        this.manufacturerName = manufacturerName;
        this.modelNumber = modelNumber;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void drawPixel(int x,int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    @Override
    public String toString() {
        return "\nMonitor->\nResolution:" + resolution +
                "\nManufacturer Name: " + manufacturerName + "\nModel Number: " + modelNumber ;
    }
}
