package StreamLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionsLearning {
    public  static void main (String[] args){
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(23);
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
    }
}
