package task4;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

     @Override
    public int area() {
        return super.width * super.width;
    }

}
