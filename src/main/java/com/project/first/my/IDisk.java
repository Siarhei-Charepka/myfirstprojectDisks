package com.project.first.my;

import java.util.Date;

public interface IDisk {
    DiskType getDiskType();

    String getName();

    Date getSaleDate();

    boolean isExisted();

    int getBalance();

    void print();
}
