package Inteerface;

public class Cat implements Bite, Comparable {

    private String name;
    private int age;
    private  String color;



    public Cat(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(){
        super();
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean isTasty() {
        return this.age <= 2;
    }

    public  int compareTo(Object o){
        Cat anotherCat = (Cat) o;
        if(this.age > anotherCat.age) {
            return 1;
        }
        if(this.age < anotherCat.age) {
            return -1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
