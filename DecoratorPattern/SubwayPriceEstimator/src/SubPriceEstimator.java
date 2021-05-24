
public class SubPriceEstimator {
    private Menu menu ;
    private IngredientFactory ingredient;
    private Sub sub;

    public SubPriceEstimator() {
        this.ingredient = new IngredientFactory();
        this.menu = new Menu();
    }

    public void placeOrder() {
        while(true) {
            menu.showMenu();
            INGREDIENTS_TYPE choice = menu.getChoice();
            if(choice == INGREDIENTS_TYPE.NONE) break;
            if(sub == null) sub = new SimpleSub();
            sub = ingredient.addIngredient(sub, choice);
        }

    }
    public void clearOrder() {
        this.sub = null;
    }
    public void newOrder() {
        this.sub = null;
    }
    public void printOrderDetails() {
        this.sub.getSub();
    }

    public void totalAmount() {
        System.out.println(sub.getEstimate());
    }

}
