package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import lombok.SneakyThrows;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {

    @SneakyThrows
    public static void save(Path path, Car car) {
        Files.writeString(path, car.serialize());
    }

    @SneakyThrows
    public static Car extract(Path path) {
        return Car.deserialize(Files.readString(path));
    }
}
// END
