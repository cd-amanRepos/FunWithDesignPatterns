public class Toppings extends SubDecorator{
    private static final int TOPPINGS_PRICE = 20;

    Toppings(Sub sub) {
        super(sub);
    }

    @Override
    public int getEstimate() {
        return super.getEstimate() + TOPPINGS_PRICE;
    }

    @Override
    public void getSub() {
        super.getSub();
        System.out.println("--- Added some Toppings ---");
    }
}
