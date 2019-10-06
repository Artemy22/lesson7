/*
"7. Create HashMap<String, String> and add 10 pairs:
 watermelon, berry;
 banana, fruit;
 cherry, berry;
 pineapple, fruit;
 melon, vegetable;
 cranberry, berry;
 apple, fruit;
 iris, flower;
 potato, vegetable;
 carrot, vegetable;

Print the content of the map, each pair from a new line.
Example:
watermelon - berry;
cherry - berry;
*/

import java.util.HashMap;

public class Lesson77 {
    public static void main(String[] args) {

        HashMap<String, String> myMorningSalad = new HashMap<>();

        myMorningSalad.put("watermelon", "berry");
        myMorningSalad.put("banana", "fruit");
        myMorningSalad.put("cherry", "berry");
        myMorningSalad.put("pineapple", "fruit");
        myMorningSalad.put("melon", "vegetable");
        myMorningSalad.put("cranberry", "berry");
        myMorningSalad.put("apple", "fruit");
        myMorningSalad.put("iris", "flower");
        myMorningSalad.put("potato", "vegetable");
        myMorningSalad.put("carrot", "vegetable");

        myMorningSalad.forEach((k, v) -> {
            System.out.println(k + " -  " + v);
        });
    }
}