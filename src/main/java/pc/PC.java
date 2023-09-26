package pc;

public class PC {
    private Case caseForPC; //case is a special keyword we cant use!
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case caseForPC, MotherBoard motherBoard, Monitor monitor) {
        this.caseForPC = caseForPC;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }
    public Case getCaseForPC() {
        return caseForPC;
    }

    public void setCaseForPC(Case caseForPC) {
        this.caseForPC = caseForPC;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void drawLogo() {
        monitor.drawPixel(10,30,"RED");
    }

    public void description() {
        System.out.println("Welcome to Worst Buy below is the description of the pc on sale today:\n" + caseForPC.toString() + monitor.toString() + motherBoard.toString());

    }

    public void powerUp(){
        caseForPC.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Valorant");
    }

    @Override
    public String toString() {
        return "PC description\n" +
                "Case-> " + caseForPC +
                "\nMotherboard-> " + motherBoard +
                "\nMonitor-> " + monitor;
    }
}
