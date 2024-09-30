package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> copy = storage.toMap();
        var keys = copy.keySet();
        for (var key : keys) {
            storage.unset(key);
            storage.set(copy.get(key), key);
        }
    }
}
// END
