package com.project.first.my;

import java.util.Date;

public class Movie extends Disk {

    Movie(DiskType diskType, String name, Date saleDate, boolean existed, int balance) {
        super(diskType, name, saleDate, existed, balance);
    }

    @Override
    public DiskType getDiskType() {
        return DiskType.MOVIE;
    }

    @Override
    public String getName() {
        return "Disk with movies";
    }
}
