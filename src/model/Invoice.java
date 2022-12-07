package model;

import java.util.ArrayList;

public class Invoice {
    private int number;
    private String date;
    private String customer;
    private ArrayList<Items> items;
    
    public Invoice() {
    }

    public Invoice(int number, String date, String customer) {
        this.number = number;
        this.date = date;
        this.customer = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Items line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Items> getLines() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNum() {
        return number;
    }

    public void setNum(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + number + ", date=" + date + ", customer=" + customer + '}';
    }
    
    public String getAsCSV() {
        return number + "," + date + "," + customer;
    }
    
}
