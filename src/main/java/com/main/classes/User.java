package com.main.classes;

import java.util.HashMap;

public class User {
    String name;
    long cashBalance;
    HashMap<String, Stock> stockPosition = new HashMap<String, Stock>();

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, long cashBalance) {
        this.name = name;
        this.cashBalance = cashBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(long cashBalance) {
        this.cashBalance = cashBalance;
    }

    public void addInventory(String stock, long qty, long price) {

        Stock ticker = new Stock(stock, qty, price);
        stockPosition.putIfAbsent(stock, ticker);
    }

    public HashMap<String, Stock> getStockPosition() {
        return stockPosition;
    }

    public void setStockPosition(HashMap<String, Stock> stockPosition) {
        this.stockPosition = stockPosition;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cashBalance=" + cashBalance +
                ", stockPosition=" + stockPosition.toString() +
                '}';
    }

    public void updateInventory(String stock, long qty, long price) {

        Stock tickerDetails = stockPosition.get(stock);
        tickerDetails.setQty(tickerDetails.getQty() - qty);
        tickerDetails.setPrice(tickerDetails.getPrice());
        stockPosition.put(stock, tickerDetails);

    }

}
