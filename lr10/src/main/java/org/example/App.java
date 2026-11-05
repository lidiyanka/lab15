package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
                Dog dog1 = new Dog("Собака", "Овчарка", 20, true);
                Dog dog2 = new Dog("Бобик", "Хаски", 25, false);
                Dog dog3 = new Dog("Рекс", "Лабрадор", 18, true);
                Cat cat1 = new Cat("Кошка", "Белая", 10, true);
                Cat cat2 = new Cat("Барсик", "Рыжий", 12, false);

                SoundMaker[] animals = {
                        dog1, dog2, dog3, cat1, cat2
                };

                System.out.println("ЗВУКИ");
                for (SoundMaker animal : animals) {
                    animal.makeSound();
                    System.out.println("Тип звука: " + animal.getSoundType());
                }

                // мит
                Movable[] movers = {
                        dog1, dog2, dog3, cat1, cat2
                };

        System.out.println();
                System.out.println("ДВИЖЕНИЕ ");
                for (Movable animal : movers) {
                    animal.move();
                    System.out.println("Скорость: " + animal.getSpeed() + " км/ч");
                }

                Feedable[] animalsToFeed = {
                        dog1, dog2, dog3, cat1, cat2
                };

        System.out.println();
        System.out.println("КОРМЛЕНИЕ");
                for (Feedable animal : animalsToFeed) {
                    System.out.println("Голоден: " + animal.isHungry());
                    animal.feed();
                    System.out.println("Голоден после кормления: " + animal.isHungry());
                    System.out.println();
                }
            }
        }