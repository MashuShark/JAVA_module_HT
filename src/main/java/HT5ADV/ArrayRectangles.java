package HT5ADV;

public class ArrayRectangles {
    public Rectangle[] getRectangleArray() {
        return rectangleArray;
    }

    private Rectangle[] rectangleArray;

    public ArrayRectangles(int size) {
        if (size <= 0 ) throw new IllegalArgumentException();
        else if (size == 1) {rectangleArray = new Rectangle[0];}
        else {
            rectangleArray = new Rectangle[size];
        }
    }

    public ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null || rectangles.length == 0) throw new IllegalArgumentException();
        else {
            rectangleArray = rectangles;
        }
    }

    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; ++i)
        {
            if (rectangleArray[i] == null)
            {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < getRectangleArray().length; ++i) {
            if (getRectangleArray()[i] != null) {
                count += 1;
            }
        }
        return count;
    }

    public int indexMaxArea() {
        double maxArea = 0;
        int maxAreaIndex = -1;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].area() > maxArea) {
                maxArea = rectangleArray[i].area();
                maxAreaIndex = i;
            }
        }
        return maxAreaIndex;
    }

    public int indexMinPerimeter() {
        double minPerimeter = Double.MAX_VALUE;
        int minPerimeterIndex = -1;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].perimeter() < minPerimeter) {
                minPerimeter = rectangleArray[i].perimeter();
                minPerimeterIndex = i;
            }
        }
        return minPerimeterIndex;
    }

    public int numberSquares() {
        int countSquare = 0;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].isSquare())
                countSquare++;
        }
        return countSquare;
    }
}