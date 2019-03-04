package com.project.first.my;

import java.util.ArrayList;
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
}
