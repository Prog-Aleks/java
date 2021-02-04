package Inteerface;

public class Ball implements Bite{

    private int size;
    private String color;

    public Ball(int size, String color) {
        super();
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isTasty() {
         return  this.size < 15 ; // если больше 15 собака не укусит
    }
}
