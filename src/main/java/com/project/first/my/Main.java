package com.project.first.my;


import java.util.Date;


public class Main {
    public static void main(String[] args) {


        IDisk rap = new Music(DiskType.MUSIC, "Децл", new Date(1 - 10 - 2019), true, 2);
        IDisk hobbit = new Movie(DiskType.MOVIE, "Хоббит", new Date(0), true, 5);
        IDisk pointer = new Soft(DiskType.SOFT, "Указатель мышки", new Date(22 - 12 - 18), false, 0);
        IDisk nfs = new Game(DiskType.GAME, "Need for speed", new Date(11 - 10 - 2017), true, 1);
        IDisk porno = new Movie(DiskType.MOVIE, "Good morning", new Date(30 - 12 - 2018), true, 999);

        Storage storage = new Storage();

        storage.addToStorage(rap);
        storage.addToStorage(hobbit);
        storage.addToStorage(pointer);
        storage.addToStorage(nfs);
        storage.addToStorage(porno);

        storage.addToStorage(new Music(DiskType.MUSIC, "Цой", new Date(10 - 10 - 2019), true, 2));
        storage.addToStorage(new Movie(DiskType.MOVIE, "Лоси в кукурузе", new Date(10 / 2 / 2018), true, 2));
        storage.addToStorage(new Movie(DiskType.MOVIE, "Маугли 3019", new Date(10 - 1 - 2018), true, 11));
        storage.addToStorage(new Music(DiskType.MUSIC, "Сектор газа", new Date(1 - 2 - 2019), true, 2));
        storage.addToStorage(new Music(DiskType.MUSIC, "Сливки", new Date(1 - 2 - 2019), true, 5));
        storage.addToStorage(new Soft(DiskType.SOFT, "ip-cam", new Date(1 - 11 - 18), false, 0));

        storage.getByType(DiskType.SOFT).forEach(disk -> disk.print());

        //storage.getByName("Цой").print();



    }
}
