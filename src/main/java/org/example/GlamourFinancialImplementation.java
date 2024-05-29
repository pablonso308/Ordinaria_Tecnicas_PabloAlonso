package org.example;

// GlamourFinancialImplementation.java
import java.util.HashMap;
import java.util.Map;

public class GlamourFinancialImplementation implements GlamourFinancial {
    private Map<String, Double> stockPrices;
    private double bookValue;
    private double totalShares;

    public GlamourFinancialImplementation(double bookValue, double totalShares) {
        this.stockPrices = new HashMap<>();
        this.bookValue = bookValue;
        this.totalShares = totalShares;
    }

    @Override
    public double getStockPrice(String market) {
        return stockPrices.getOrDefault(market, 0.0);
    }

    @Override
    public void updateStockPrice(String market, double price) {
        stockPrices.put(market, price);
    }

    @Override
    public double calculateMarketValue() {
        return stockPrices.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0) * totalShares;
    }

    @Override
    public double calculatePriceToBookValue() {
        return calculateMarketValue() / bookValue;
    }
}
