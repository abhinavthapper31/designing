package lowLevelDesign.designPatterns.facade;

class HomeTheaterFacade {

    // complex components which are handled by facade
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Speakers speakers;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Speakers speakers) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.speakers = speakers;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        speakers.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        speakers.off();
        projector.off();
    }
}
