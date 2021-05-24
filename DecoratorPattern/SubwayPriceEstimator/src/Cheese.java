public class Cheese extends SubDecorator{
    private static final int CHEESE_PRICE = 60;

    Cheese(Sub sub) {
        super(sub);
    }

    @Override
    public int getEstimate() {
        return super.getEstimate() + CHEESE_PRICE;
    }

    @Override
    public void getSub() {
        super.getSub();
        System.out.println("--- Added some yummy cheese ---");
    }
}
