package com.project.first.my;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy");


        IDisk rap = new Music(DiskType.MUSIC, "Децл", format.parse("10.12.2019"), true, 2);
        IDisk hobbit = new Movie(DiskType.MOVIE, "Хоббит", format.parse("10.12.2019"), true, 5);
        IDisk pointer = new Soft(DiskType.SOFT, "Указатель мышки", format.parse("10.12.2019"), false, 0);
        IDisk nfs = new Game(DiskType.GAME, "Need for speed", format.parse("10.12.2019"), true, 1);
        IDisk porno = new Movie(DiskType.MOVIE, "Good morning", format.parse("10.12.2007"), true, 999);

        Storage storage = new Storage();

        storage.addToStorage(rap);
        storage.addToStorage(hobbit);
        storage.addToStorage(pointer);
        storage.addToStorage(nfs);
        storage.addToStorage(porno);

        storage.addToStorage(new Music(DiskType.MUSIC, "Цой", format.parse("01.11.2019"), true, 2));
        storage.addToStorage(new Movie(DiskType.MOVIE, "Лоси в кукурузе", format.parse("10.12.2010"), true, 2));
        storage.addToStorage(new Movie(DiskType.MOVIE, "Маугли 3019", format.parse("10.12.2013"), true, 11));
        storage.addToStorage(new Music(DiskType.MUSIC, "Сектор газа", format.parse("10.12.2012"), true, 2));
        storage.addToStorage(new Music(DiskType.MUSIC, "Сливки", format.parse("10.12.2018"), true, 5));
        storage.addToStorage(new Soft(DiskType.SOFT, "ip-cam", format.parse("10.02.2017"), false, 0));

        //storage.getByType(DiskType.SOFT).forEach(disk -> disk.print());

        //storage.getByName("Сливки").print();

        //storage.getByYear("2012").forEach(IDisk::print);

        for (int i = 0; i < storage.getByYear("2012").size(); i++) {
            storage.getByYear("2012").get(i).print();
        }

    }
}
