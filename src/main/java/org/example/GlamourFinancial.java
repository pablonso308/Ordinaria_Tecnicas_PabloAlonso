package org.example;

// GlamourFinancial.java
public interface GlamourFinancial {
    double getStockPrice(String market);
    void updateStockPrice(String market, double price);
    double calculateMarketValue();
    double calculatePriceToBookValue();
}
