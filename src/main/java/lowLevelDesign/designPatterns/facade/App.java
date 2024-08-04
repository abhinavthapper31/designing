package lowLevelDesign.designPatterns.facade;

public class App {

    /*
     * Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a
     * high-level interface that makes the subsystem easier to use.
     * We only expose functions which are needed by client.
     *
     * */
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Speakers speakers = new Speakers();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, speakers);

        homeTheater.watchMovie("Inception");
        // After some time
        homeTheater.endMovie();
    }
}
