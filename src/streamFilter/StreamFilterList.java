package streamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterList {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                
                .filter(line -> !"mkyong".equals(line))     
                .collect(Collectors.toList());              

        result.forEach(System.out::println);                

    }

}