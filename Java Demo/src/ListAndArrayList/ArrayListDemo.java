package ListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList objectList = new ArrayList();

//        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(0, new GroceryItem("apples", "PRODUCE", 6));

        System.out.println(groceryList);

        groceryList.set(1, new GroceryItem("orange", "PRODUCE", 3));

        System.out.println(groceryList);

        groceryList.remove(1);

        System.out.println(groceryList);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));

        nextList.addAll(nextList);
        System.out.println(nextList);

        System.out.println("Third item = " + nextList.get(2));

        System.out.println(nextList);
        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList);

        var groceryArray = nextList.toArray(new String[nextList.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
