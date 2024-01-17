package base;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        food.add("pizza");

        food.set(0, "sushi");
        food.remove(2);

        food.clear(); //remove all elements

//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }

//        2D ArrayList
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("tomatoes");
        bakeryList.add("zucchini");
        bakeryList.add("peppers");
        ArrayList<String> produceList = new ArrayList();
        produceList.add("pasta");
        produceList.add("garlic bread");
        produceList.add("donuts");
        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        System.out.println(groceryList);
    }
}
