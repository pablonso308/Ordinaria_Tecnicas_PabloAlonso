package org.Ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// GlamourFinancialController.java
public class GlamourFinancialController {
    private GlamourFinancial model;
    private GlamourFinancialView view;

    public GlamourFinancialController(GlamourFinancial model, GlamourFinancialView view) {
        this.model = model;
        this.view = view;
        this.view.addUpdateButtonListener(new UpdateButtonListener());
        this.view.addCalculateButtonListener(new CalculateButtonListener());
    }

    class UpdateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String market = view.getMarket();
            double price = view.getPrice();
            model.updateStockPrice(market, price);
            view.setOutput("Updated price for " + market + ": " + price);
        }
    }

    class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double marketValue = model.calculateMarketValue();
            double priceToBookValue = model.calculatePriceToBookValue();
            view.setOutput("Market Value: " + marketValue + "\nPrice-to-Book Value: " + priceToBookValue);
        }
    }
}
