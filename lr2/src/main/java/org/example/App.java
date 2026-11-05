package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
                Shape[] shapes = new Shape[5];

                shapes[0] = new Circle("Красный", 1, 2, 5);
                shapes[1] = new Circle("Синий", 3, 4, 3);
                shapes[2] = new Circle("Зеленый", 5, 6, 7);

                shapes[3] = new Rectangle("Желтый", 2, 3, 4, 4);
                shapes[4] = new Rectangle("Черный", 6, 7, 5, 8);

                for (int i = 0; i < shapes.length; i++) {
                    System.out.println("\nФигура " + (i + 1));

                    shapes[i].displayInfo();
                    shapes[i].draw();

                    System.out.println("Площадь: "
                            + shapes[i].calculateArea());

                    if (shapes[i] instanceof Circle) {
                        Circle circle = (Circle) shapes[i];

                        System.out.println("Диаметр: "
                                + circle.getDiameter());
                    }

                    if (shapes[i] instanceof Rectangle) {
                        Rectangle rectangle = (Rectangle) shapes[i];

                        if (rectangle.isSquare()) {
                            System.out.println("Это квадрат");
                        } else {
                            System.out.println("Это не квадрат");
                        }
                    }
                }
            }
        }

