package ru.job4j.oop;

public class StoryBall {
    public static void main(String[] args ){
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Ball ball = new Ball();
        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);

    }
}
