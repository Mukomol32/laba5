package odessa;

/** Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
вывода сведений о фигуре – площади, длины окружности. Создать производный класс – конус с высотой
h, добавить в класс метод определения объема фигуры, перегрузить методы расчета площади и вывода
сведений о фигуре. Написать программу, демонстрирующую работу с классом: дано N окружностей и M
конусов, найти количество окружностей, у которых площадь меньше средней площади всех окружностей **/

public class Main {

    public static void main(String[] args) {
        Circle circle;

        double side = -1;
        while (Circle.CheckCorrectRadius("" + (side = Math.random() * 29 - 5)) < 0) {
        }

        circle = new Circle(side);

        CirclesTest circlesTest = new CirclesTest(1);
        circlesTest.setCircleAt(0, circle);


        for (int i = 0; i < circlesTest.getCircles().length; i++)
            System.out.println(circlesTest.getCircles()[i]);

        circlesTest.add(new Circle(12));
        circlesTest.add(new Circle(19));

        System.out.println("\nAfter add new circles:");
        for (int i = 0; i < circlesTest.getCircles().length; i++)
            System.out.println(circlesTest.getCircles()[i]);

        System.out.println("\nCircles with square < average:" + circlesTest.getAverageSquare());
        for (int i = 0; i < circlesTest.getCircles().length; i++)
            if (circlesTest.getCircles()[i].getSquare() < circlesTest.getAverageSquare())
                System.out.println(circlesTest.getCircles()[i]);

        Cone cone = new Cone(5, 4);
        System.out.println("\n" + cone);

        Cones cones = new Cones();
        cones.list.add(cone);
        cones.list.add(new Cone(10, 6));
        cones.list.add(new Cone(3, 7));
        cones.list.add(new Cone(9, 5));

        System.out.println("\nList of cones:");
        for (int i = 0; i < cones.list.size(); i++)
            System.out.println(cones.list.get(i));
    }
}

