package Stocks;

import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stockData = new ArrayList<Stock>();

    void addStock(Stock st) {
        stockData.add(st);
    }

    void generateReport() {
        for (Stock st : stockData) {
            System.out.println("Share Name: " + st.shareName);
            System.out.println("Shares Count: " + st.sharesCount);
            System.out.println("Price per share: " + st.pricePerShare);
            System.out.println("Total Value: " + st.getTotalValue());
            System.out.println("");
        }
        System.out.println("Total value of stocks is " + totalStockValue());
    }

    double totalStockValue() {
        double total = 0;
        for (Stock st : stockData) {
            total += st.getTotalValue();
        }
        return total;
    }
}
