package com.main.classes;

public class Stock {
    String stockName;
    long qty;
    long price;

    public Stock(String stockName, long qty, long price) {
        this.stockName = stockName;
        this.qty = qty;
        this.price = price;
    }

    public Stock() {
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
