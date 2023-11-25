package Stocks;

public class Stock {
    protected String shareName;
    protected int sharesCount;
    protected double pricePerShare;

    Stock(String shareName, int sharesCount, double pricePerShare) {
        this.shareName = shareName;
        this.sharesCount = sharesCount;
        this.pricePerShare = pricePerShare;
    }

    double getTotalValue() {
        return sharesCount * pricePerShare;
    }
}
