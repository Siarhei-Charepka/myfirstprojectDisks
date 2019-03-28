package com.project.first.my;


import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Disk implements IDisk {
    protected DiskType diskType;
    protected String name;
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date = simpleDateFormat.format(saleDate);
        System.out.println("Название диска: " + name);
        System.out.println("Тип диска: " + diskType);
        System.out.println("Дата продажи:" + date);
        System.out.println("Наличие на складе: " + existed);
        System.out.println("Остаток: " + balance);

    }

}
