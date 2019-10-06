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

public class Lesson78 {
    public static void main(String[] args) {

        HashMap<String, String> myMorningSaladNew = new HashMap<>();

        myMorningSaladNew.put("watermelon", "berry");
        myMorningSaladNew.put("banana", "fruit");
        myMorningSaladNew.put("cherry", "berry");
        myMorningSaladNew.put("pineapple", "fruit");
        myMorningSaladNew.put("melon", "vegetable");
        myMorningSaladNew.put("cranberry", "berry");
        myMorningSaladNew.put("apple", "fruit");
        myMorningSaladNew.put("iris", "flower");
        myMorningSaladNew.put("potato", "vegetable");
        myMorningSaladNew.put("carrot", "vegetable");

        myMorningSaladNew.forEach((k, v) -> {
            if (v.equals("vegetable")) {
                System.out.println(k + " -  " + v);
            }
        });
    }
}