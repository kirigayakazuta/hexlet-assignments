package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int n) {
        return list.stream()
                   .sorted(Home::compareTo)
                   .map(Objects::toString)
                   .collect(Collectors.toList())
                   .subList(0, Math.min(n, list.size()));
    }
}
// END
