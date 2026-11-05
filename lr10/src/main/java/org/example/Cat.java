package org.example;
public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private double speed;
    private boolean hungry;

    public Cat(String name, String color, double speed, boolean hungry) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = hungry;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу-мяу!");
    }

    @Override
    public String getSoundType() {
        return "Мяуканье";
    }

    @Override
    public void move() {
        System.out.println(name + " бежит со скоростью " + speed + " км/ч");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        hungry = false;
        System.out.println(name + " покушал");
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }
}