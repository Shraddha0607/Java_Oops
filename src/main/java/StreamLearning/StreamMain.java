package StreamLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main (String[] args){

        String[] strList = {"Vinod", "Babulal", "Kusum", "Kranti", "Rishabh"};
        // now use stream to get name which length only 5
        List<String> strFilteredList = Arrays.stream(strList).filter((String s) -> s.length()<=5).collect(Collectors.toList());
        System.out.println(strFilteredList.size() + " is the ccount , we got");

        // use of map function
        List<String> strList2 = Arrays.asList(strList);
        List<String> strMappedList = Stream.of(strList).map((String s ) -> s.toLowerCase()).collect(Collectors.toList());

    }
}
