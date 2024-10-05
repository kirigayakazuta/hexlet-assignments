package exercise;

import lombok.Value;
import lombok.SneakyThrows;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this);
    }

    @SneakyThrows
    public static Car deserialize(String json) {
        return new ObjectMapper().readValue(json, Car.class);
    }
    // END
}
