public class SubClient {
    public static void main(String[] args) {
        SubPriceEstimator subway = new SubPriceEstimator();
        subway.placeOrder();
        subway.printOrderDetails();
        subway.totalAmount();
    }
}
