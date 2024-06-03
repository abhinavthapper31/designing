package lowLevelDesign.designPatterns.decorator;

public class ExtraPattyBurger extends BurgerDecorator {
    private Burger burger;

    ExtraPattyBurger(Burger burger) {
        this.burger = burger;
    }


    @Override
    public int getCost() {
        return this.burger.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription() + " with ExtraPatty ";
    }
}
