package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {

    public static List<String> validate(Address address) {
        List<String> res = new ArrayList<>();
        try {
            for (Field field : address.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
                    res.add(field.getName());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static Map<String, List<String>> advancedValidate(Address address) {
        Map<String, List<String>> res = new HashMap<>();
        try {
            for (Field field : address.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NotNull.class) && field.get(address) == null) {
                    res.put(field.getName(), List.of("can not be null"));
                }
                if (field.isAnnotationPresent(MinLength.class)
                        && ((String)field.get(address)).length() < field.getAnnotation(MinLength.class).minLength()) {
                    res.put(field.getName(), List.of("length less than " + field.getAnnotation(MinLength.class).minLength()));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return res;
    }
}
// END
