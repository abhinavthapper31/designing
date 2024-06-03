package lowLevelDesign.designPatterns.decorator;

public class ExtraCheeseBurger extends BurgerDecorator {

    private Burger burger;

    ExtraCheeseBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public int getCost() {
        return this.burger.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription() + " with ExtraCheese ";
    }
}
