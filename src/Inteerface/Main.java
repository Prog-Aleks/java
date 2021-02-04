package Inteerface;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Bobik");
        Ball ball = new Ball(12,"red");

        Cat catOne = new Cat(   "Vaska",2, " White");
        Cat catTwo = new Cat(   "Kolia",3, " gren");
        Cat catThree = new Cat("Barsik",4, " black");
        Cat catFour = new Cat( "Marsik",1, "Orang");

        Cat [] catArray = new Cat[]{catOne,catFour,catThree,catTwo};

        for (Object cat : catArray){
            System.out.println(cat);
        }

        Arrays.sort(catArray);//сортировка

        System.out.println();
        for (Object cat : catArray){

            System.out.println(cat);

        }

//        int[] array = new int[]{3, 1, 5, 6, 8};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

//        dogOne.bite(dogOne);
//        dogOne.bite(ball);
//        dogOne.bite(dogTwo);



    }
}
