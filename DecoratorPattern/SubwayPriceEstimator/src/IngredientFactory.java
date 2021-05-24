public class IngredientFactory {
    public Sub addIngredient(Sub sub, INGREDIENTS_TYPE choice) {
        switch (choice) {
            case BREAD: return new Bread(sub);
            case CHEESE: return new Cheese(sub);
            case TOPPING: return new Toppings(sub);
            case VEGGIES: return new Veggies(sub);
        }

        return sub;
    }

}
