package com.project.first.my;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public abstract class Disk implements IDisk {
    private DiskType diskType;
    private String name;
    protected Date saleDate;
    protected boolean existed;
    protected int balance;

    public Disk(DiskType diskType, String name, Date saleDate, boolean existed, int balance) {
        this.diskType = diskType;
        this.name = name;
        this.saleDate = saleDate;
        this.existed = existed;
        this.balance = balance;
    }

    @Override
    public Date getSaleDate() {
        return saleDate;
    }

    @Override
    public boolean isExisted() {
        return existed;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public void print() {

        System.out.println("Название диска: " + name);
        System.out.println("Тип диска: " + diskType);
        System.out.println("Дата продажи:" + saleDate);
        System.out.println("Наличие на складе: " + existed);
        System.out.println("Остаток: " + balance);

    }

}
