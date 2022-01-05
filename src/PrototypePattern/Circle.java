package PrototypePattern;

public class Circle extends Shape{

    private int x,y,r;

    public Circle(int x, int y, int r) {
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Circle copy() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();

        //복사시에 살짝 옆으로 이동시켜서 복사하도록
        circle.x += 1;
        circle.y += 1;
        return circle;
    }
}

