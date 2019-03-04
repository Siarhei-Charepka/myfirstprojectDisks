package com.project.first.my;

import java.util.List;

public interface IStorage {
    IDisk getByName(String name);
    void addToStorage(IDisk disk);
     List<IDisk> getByType(DiskType type);




}
