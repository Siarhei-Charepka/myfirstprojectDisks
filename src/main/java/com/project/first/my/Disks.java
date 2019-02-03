package com.project.first.my;

public class Disks {

    private String diskType;
    private String name;
    private String dateSale;
    private Boolean store;
    private int balance;

    public String getDiskType() {
        return diskType;
    }

    public String getName() {
        return name;
    }

    public String getDateSale() {
        return dateSale;
    }

    public Boolean getStore() {
        return store;
    }

    public int getBalance() {
        return balance;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateSale(String dateSale) {
        this.dateSale = dateSale;
    }

    public void setStore(Boolean store) {
        this.store = store;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
