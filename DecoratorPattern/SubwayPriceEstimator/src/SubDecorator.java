public abstract class SubDecorator implements Sub {
    private Sub sub;

    SubDecorator(Sub sub) {
        this.sub = sub;
    }

    @Override
    public int getEstimate() {
        return this.sub.getEstimate();
    }
    @Override
    public void getSub() {
        this.sub.getSub();
    }
}
