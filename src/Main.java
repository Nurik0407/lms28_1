import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Stream.of(integers).filter(s -> s % 2 == 0).map(s -> s * s).max(
                Comparator.comparing(s -> s)).stream().toList().forEach(System.out::println);


    }
}