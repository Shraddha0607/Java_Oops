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

        // Add " Singh" which each
        String surname = " Singh";
        List<String> strListWithSingh = Arrays.stream(strList).map(x -> x+surname).toList();
        System.out.println(" List with surname");
        System.out.println(strListWithSingh);

        // add " Group1" with string size 5 or less, add Group2 with more size
        List<String> strListWithGroupInfo = strListWithSingh.stream().map(x ->x.length()<=5 ? x+" Group1" : x+" Group2").toList();
        System.out.println("Group wise categorition done");
        System.out.println(strListWithGroupInfo);

        // this is the way to only get teh first name length in consideration
        List<String> strListWithGroupInfoOnlyFName = strListWithSingh.stream()
                .map(s -> {
                    // Split on whitespace and take the first element as the first name
                    String firstName = s.split("\\s+")[0];
                    // Append Group1 if length is 5 or less, otherwise Group2
                    return firstName + (firstName.length() <= 5 ? " Group1" : " Group2");
                })
                .collect(Collectors.toList());

        // now prepare list by adding 5 in between fname and lname
        List<String> nameWith5 = strListWithSingh.stream().map(
                s-> {
                    String fname = s.split("\\s+")[0];
                    String lname = s.split(("\\s+"))[1];
                    // now need to append 5 b/w them
                    return fname+"5"+lname;
                })
                .toList();
        // print it
        System.out.println("5 added in between");
        System.out.println(nameWith5);


    }
}

//String lastName = s.split("\\s+")[1];