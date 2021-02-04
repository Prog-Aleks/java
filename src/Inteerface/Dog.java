package Inteerface;

public class Dog implements Bite{

    private  String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    public Dog(){
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean isTasty() {
        return false;
    }

    public void  bite(Bite biteThing){
        if(biteThing == this){
            System.out.println("I byte myself");
            return;
        }
        System.out.println("I byte "+ biteThing + " it is " +
                (biteThing.isTasty()?"Good":"Bad"));
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
