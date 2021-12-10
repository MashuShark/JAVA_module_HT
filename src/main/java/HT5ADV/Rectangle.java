package HT5ADV;

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(int a) {
        this.sideA = a;
        this.sideB = 5;
    }
    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int area(){
        return sideA*sideB;
    }

    public int perimeter(){
        return 2 * (sideA + sideB);
    }

    public boolean isSquare(){
        if (sideA == sideB) {
            return true;
        } else {
            return false;
        }
    }

    public void replaceSides(){
        int temp = sideA;
        sideA = sideB;
        sideB = temp;
    }
}
