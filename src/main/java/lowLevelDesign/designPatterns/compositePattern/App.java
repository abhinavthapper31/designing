package lowLevelDesign.designPatterns.compositePattern;

public class App {

    /*
     * COMPOSITE DESGIN PATTERN
     * Object within an object or when a hierarchy (tree) is created.
     *
     * */
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(new File("hera pheri"));
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
