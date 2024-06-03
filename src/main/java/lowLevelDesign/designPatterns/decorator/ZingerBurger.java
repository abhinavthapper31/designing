package lowLevelDesign.designPatterns.decorator;

// No Decorator, just an extension.
public class ZingerBurger extends Burger {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "This is a Zinger Burger";
    }
}
