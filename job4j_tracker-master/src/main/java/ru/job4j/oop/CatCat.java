package ru.job4j.oop;

public class CatCat {

    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }
    private void giveNick(String nick){
        this.name = nick;

    }


    public void show() {
        System.out.println(this.food + " " + this.name );

    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        CatCat gav = new CatCat();
        gav.eat("cutlet");
        gav.giveNick("Boss");
        gav.show();
        System.out.println("There is black's food.");
        CatCat black = new CatCat();
        black.eat("veal");
        black.giveNick ("Barboss");
        black.show();
    }
}