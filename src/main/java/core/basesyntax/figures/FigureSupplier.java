package core.basesyntax.figures;

import core.basesyntax.color.ColorSuplier;
import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final int figures = 5;
    private final int maxSize = 99;

    public Figure getRandomFigure() {
        ColorSuplier colorSuplier = new ColorSuplier();
        int numberFigure = random.nextInt(figures);
        String color = colorSuplier.getRandomColor();
        switch (numberFigure) {
            case 1:
                int radius = random.nextInt(maxSize) + 1;
                return new Circle(color, radius);

            case 2:
                int side = random.nextInt(maxSize) + 1;
                return new Circle(color, side);

            case 3:
                int firstLeg = random.nextInt(maxSize) + 1;
                int secondLeg = random.nextInt(maxSize) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);

            case 4:
                int top = random.nextInt(maxSize) + 1;
                int down = random.nextInt(maxSize) + 1;
                int altitude = random.nextInt(maxSize) + 1;
                return new IsoscelesTrapezoid(color, top, down, altitude);

            default:
                return new Circle(color, random.nextInt(maxSize));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
