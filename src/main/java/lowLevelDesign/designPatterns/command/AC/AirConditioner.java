package lowLevelDesign.designPatterns.command.AC;

public class AirConditioner {
    String companyName;
    boolean isTurnedOn;

    AirConditioner(String companyName, boolean isOn) {
        this.companyName = companyName;
        this.isTurnedOn = isOn;
    }

    public void turnOn() {
        this.isTurnedOn = true;
        System.out.println("Ac is turned on.");
    }

    public void turnOff() {
        this.isTurnedOn = false;
        System.out.println("Ac is turned off.");
    }


    public boolean isTurnedOn() {
        return isTurnedOn;
    }


}
