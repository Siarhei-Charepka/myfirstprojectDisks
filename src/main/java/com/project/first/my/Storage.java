package com.project.first.my;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Storage implements IStorage {

    private List<IDisk> diskStorage = new ArrayList<>();

    public List<IDisk> getDiskStorage() {
        return diskStorage;
    }


    @Override
    public IDisk getByName(String name) {
        for (int i = 0; i < diskStorage.size(); i++) {
            if (diskStorage.get(i).getName().equals(name)) {
                return diskStorage.get(i);
            }
        }
        return null;
    }

    @Override
    public void addToStorage(IDisk disk) {
        diskStorage.add(disk);
    }

    @Override
    public List<IDisk> getByType(DiskType type) {
        List<IDisk> typeDisks = new ArrayList();
        for (int i = 0; i < diskStorage.size(); i++) {
            if (diskStorage.get(i).getDiskType().equals(type)) {
                typeDisks.add(diskStorage.get(i));
            }
        }
        return typeDisks;
    }


    @Override
    public List<IDisk> getByYear(String year) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        List<IDisk> sortDate = new ArrayList();
        Date startDate = format.parse("01.01." + year);
        Date endDate = format.parse("31.12." + year);
        for (int i = 0; i < diskStorage.size(); i++) {
            Date saleDate = diskStorage.get(i).getSaleDate();
            if (saleDate.after(startDate) && saleDate.before(endDate)) {
                sortDate.add(diskStorage.get(i));
            }
        }
        return sortDate;
    }
}
