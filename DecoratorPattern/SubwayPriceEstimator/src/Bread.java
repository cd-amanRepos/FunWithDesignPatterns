public class Bread extends SubDecorator{

    private static final int BREAD_PRICE = 50;

    Bread(Sub sub) {
        super(sub);
    }

    @Override
    public int getEstimate() {
        return super.getEstimate() + BREAD_PRICE;
    }
    @Override
    public void getSub() {
        super.getSub();
        System.out.println("--- Added Bread ---");
    }
}
