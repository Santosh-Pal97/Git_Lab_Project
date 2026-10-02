import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args){

        String input = "Java is the most popular";

  Map<Character,Long> findFreq =input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(findFreq);
    }
}
