import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRep {

    public static void main(String[] args){

        String input = "java is the most popular";


      Map<String,Long> findFirst =   Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));


  String findResult = findFirst.entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                . orElse("No non-repeating character found");

System.out.println(findResult);

    }
}
