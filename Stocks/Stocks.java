package Stocks;

import java.util.Scanner;

public class Stocks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the stocks: ");
        int stockCount = scanner.nextInt();
        scanner.nextLine();

        StockPortfolio stockPortfolio = new StockPortfolio();

        for (int i = 0; i < stockCount; i++) {
            System.out.println("Enter stock name: ");
            String shareName = scanner.next();

            System.out.println("Enter share count: ");
            int sharesCount = scanner.nextInt();

            System.out.println("Enter price per share: ");
            double pricePerShare = scanner.nextDouble();

            Stock stock = new Stock(shareName, sharesCount, pricePerShare);
            stockPortfolio.addStock(stock);
        }

        stockPortfolio.generateReport();
        scanner.close();
    }
}