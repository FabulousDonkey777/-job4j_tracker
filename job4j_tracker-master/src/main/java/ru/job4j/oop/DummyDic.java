package ru.job4j.oop;

public class DummyDic{
    public String engToRus () {
        String eng = "Cat";
        return eng;
    }
    public static void main(String[] args) {
        DummyDic dummydic = new DummyDic();
        String x = dummydic.engToRus();
        System.out.println("Неизвестное слово" + " " + x);
    }
}
