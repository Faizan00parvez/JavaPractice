import java.util.ArrayList;
import java.util.List;

public class practiceArrayList2 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();

        alist.add(1);
        alist.add(2);
        alist.add(3);

        System.out.println("The element got replaced = " + alist.set(1,100));

        List<Integer> alist2 = new ArrayList<>();

        alist2.add(4);
        alist2.add(5);
        alist2.add(6);

        alist2.addAll(alist); // add all the elements of different arraylist
        System.out.println(alist.indexOf(1)); // for finding the index

        List<Integer> alist3 = alist2.subList(1,4); // it adds the element of the indexes, we have written
        alist3.set(0,250); // it doesn't copy. it gives the overview.
        System.out.println(alist2);
        System.out.println(alist3); 

//        System.out.println(alist);
//        System.out.println(alist2);

    }
}
