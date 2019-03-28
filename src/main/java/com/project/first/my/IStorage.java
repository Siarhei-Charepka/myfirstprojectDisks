package com.project.first.my;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface IStorage {
    IDisk getByName(String name);

    void addToStorage(IDisk disk);

    List<IDisk> getByType(DiskType type);

    List<IDisk> getByYear(String saleDate) throws ParseException;


}
