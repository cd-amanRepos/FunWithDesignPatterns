public class SimpleSub implements Sub{
    private int price = 50;
    @Override
    public int getEstimate() {
        return price;
    }

    @Override
    public void getSub() {
        System.out.println("Making your Sub !");
    }
}
