import java.util.ArrayList;
import java.util.List;

public class IntroArrayList {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();

        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Eggs");

        System.out.println( "Size of the list - " + groceryList.size());

//        for (int i = 0; i < groceryList.size(); i++) {
//            System.out.println(groceryList.get(i));
//        }

        for(String i : groceryList) {
            System.out.println(i);
        }




        //System.out.print(groceryList.get(1));


    }
}
