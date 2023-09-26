package pc;

public class Main {

    public static void main(String[] args) {
        Dimensions dimension = new Dimensions(19,45,11);
        Resolution resolution = new Resolution(1890,134);
        Case case1 = new Case("xbox","Intel","Genreric",dimension);
        Monitor monitor = new Monitor(resolution, "Genreric", 23232123);
        MotherBoard motherBoard = new MotherBoard("Genreric","Genreric",4,2,"bios");
        PC pc = new PC(case1, motherBoard, monitor);
        pc.description();
        pc.powerUp();
    }
}
