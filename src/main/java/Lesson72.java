/*
2. Create ENUM and print.
 */

public class Lesson72 {
    public static void main(String[] args) {
        Animals myCat = Animals.CAT;
        System.out.println(myCat);
        Animals myDog = Animals.DOG;
        System.out.println(myDog);
    }

    enum Animals {
        CAT,
        DOG
    }
}
