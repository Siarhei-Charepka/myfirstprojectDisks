package com.project.first.my;

import java.util.Date;

public class Soft extends Disk {

    Soft(DiskType diskType, String name, Date saleDate, boolean existed, int balance) {
        super(diskType, name, saleDate, existed, balance);
    }

    @Override
    public DiskType getDiskType() {
        return DiskType.SOFT;
    }

    @Override
    public String getName() {
        return name;
    }

}
