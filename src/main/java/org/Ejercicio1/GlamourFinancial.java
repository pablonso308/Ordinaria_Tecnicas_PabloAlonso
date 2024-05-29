package org.Ejercicio1;

// GlamourFinancial.java
public interface GlamourFinancial {
    double getStockPrice(String market);
    void updateStockPrice(String market, double price);
    double calculateMarketValue();
    double calculatePriceToBookValue();
}
