import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_duplicate {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,6);

        Set<Integer> set = new HashSet<>();

    Set<Integer> findDuplicate =     list.stream()
                .filter(s->!set.add(s))
                .collect(Collectors.toSet());

    System.out.println(findDuplicate);
    }
}
