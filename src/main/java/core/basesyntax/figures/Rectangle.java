package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "This is a "
                + this.getColor()
                + " rectangle with width = " + width + " cm "
                + " rectangle with height = " + height + " cm "
                + " and area " + this.getArea() + " square cm"
        );
    }
}
