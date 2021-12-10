package HT5ADV;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n){
        rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangle)
    {
        rectangleArray = rectangle;
    }

    public boolean addRectangle(Rectangle rectangle){
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

    public int numberMaxArea(Rectangle[] rectangleArray){
        int maxArea = 0;
        int maxAreaIndex = -1;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].area() > maxArea)
                maxArea = rectangleArray[i].area();
                maxAreaIndex = i;
        }
        return maxAreaIndex;
    }

    public int numberMinPerimeter(Rectangle[] rectangleArray) {
        int minPerimeter = 0;
        int minPerimeterIndex = -1;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].perimeter() < minPerimeter)
                minPerimeter = rectangleArray[i].area();
            minPerimeterIndex = i;
        }
        return minPerimeterIndex;
    }

    public int numberSquares(Rectangle[] rectangleArray){
        int countSquare = 0;
        for (int i = 0; i < rectangleArray.length; ++i) {
            if (rectangleArray[i] != null && rectangleArray[i].isSquare())
                countSquare++;
        }
        return countSquare;
    }

}
