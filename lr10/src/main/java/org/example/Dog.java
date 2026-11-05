package org.example;
public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private double speed;
    private boolean hungry;

    public Dog(String name, String breed, double speed, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = hungry;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }

    @Override
    public String getSoundType() {
        return "Лай";
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