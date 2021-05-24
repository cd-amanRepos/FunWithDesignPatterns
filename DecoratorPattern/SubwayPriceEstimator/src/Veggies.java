public class Veggies extends SubDecorator{
    private static final int VEGGIES_PRICE = 50;

    Veggies(Sub sub) {
        super(sub);
    }

    @Override
    public void getSub() {
        super.getSub();
        System.out.println("--- Added Some Veggies --- ");
    }

    @Override
    public int getEstimate() {
        return super.getEstimate() + VEGGIES_PRICE;
    }
}
