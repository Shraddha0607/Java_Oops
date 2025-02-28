package StreamLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class CollectionsLearning {
    public  static void main (String[] args){
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(23);
        num.add(90);
        num.add(30);
        num.add(89);

        // now here use all Collections method
        System.out.println(num.get(3));
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
        Collections.rotate(num,1);
        System.out.println(num.get(3));
        System.out.println(Collections.binarySearch(num, 23));
        Collections.swap(num, 0, 3);
        System.out.println(num.get(3));

        // stream  learning
        // filter()
        // print the even numbers only
        List<Integer> evenNumber= num.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        // now print
        System.out.println("Even Numbers");
        for(int i : evenNumber){
            System.out.print(i +" ");
        }

        // map()
        System.out.println("\nThis is double number");
        System.out.println(num);
        List<Integer> doubleNum = num.stream().map(x -> x*2).toList();
        System.out.println(doubleNum);
    }
}
