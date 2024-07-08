package lowLevelDesign.designPatterns.command.AC;

public class App {

    /*
     * When commands are given :P
     * copy paste
     *
     * Used when : Multiple commands are there and a series of
     * these commands leads to an action .
     *
     * Also when we need undo or redo a specific command. (Take control away from user.)
     * Like for AC, Client needs to do everything, create AC, call ac on / off
     * In commnand patter we split the above into invokers (like ac turned ON via REMOTE),
     *   Recevier (AC) and command.
     * Client is  only concerned  with initializing or giving "Command" not actual execution
     *
     * */
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner("Daikin", false);

        Command turnOn = new TurnOnCommand(ac);

        Remote remote = new Remote(turnOn);
        remote.pressButton();

        Command turnOff = new TurnOffCommand(ac);

        remote = new Remote(turnOff);
        remote.pressButton();


    }
}
