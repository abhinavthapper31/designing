package lowLevelDesign.designPatterns.decorator;

public abstract class Burger {

    private int cost;
    private  String description;

    public abstract int getCost();

    public abstract String getDescription();
}
