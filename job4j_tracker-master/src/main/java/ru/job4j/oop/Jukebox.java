package ru.job4j.oop;

public class Jukebox {
    public void music(int position){
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
        else if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        else {
            System.out.println("Песня не найдена");
        }

    }
    public static void main(String[] args) {
        Jukebox sing = new Jukebox();
        sing.music(1);
        sing.music(2);
        sing.music(0);


    }
}
