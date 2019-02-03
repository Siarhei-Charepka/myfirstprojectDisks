package com.project.first.my;


import java.util.ArrayList;

public class Storage {

    public static void main(String[] args) {
        Disks films = new Disks();
        Disks games = new Disks();
        Disks music = new Disks();
        Disks soft = new Disks();

        ArrayList<Disks> list = new ArrayList<Disks>();
        list.add(films);
        list.add(games);
        list.add(music);
        list.add(soft);
    }
}
