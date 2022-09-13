package com.main.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StockInvestment {
    String id;
    List<User> userList = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public boolean buyStock(String stock, long qty, long price) {

        if (stock != null && !stock.isEmpty()) {
            float multiplier = qty * price;
            if (multiplier != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean sellStock(String stock, long qty, long price) {

        if (!stock.isEmpty() && stock != null) {
            float multiplier = qty * price;
            if (multiplier != 0) {
                return true;
            }
        }
        return false;
    }

    public long getCustomerDetails(String cust) {
        User user;
        Iterator it = userList.iterator();

        while(it.hasNext()){
           user = (User) it.next();
           if(cust.equals(user.getName()))
           return user.getCashBalance();
        }
        return 0;
    }
}
