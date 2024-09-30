package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    public Map<String, String> map;

    public InMemoryKV(Map<String, String> map) {
        this.map = new HashMap<>(map);
    }

    public void set(String key, String value) {
        map.put(key, value);
    }

    public String get(String key, String defaultValue) {
        String res = map.get(key);
        if (res == null) return defaultValue;
        return res;
    }

    public void unset(String key) {
        map.remove(key);
    }

    public Map<String, String> toMap() {
        // Если возвращать просто само содержимое базы return map,
        // то при его изменении будет меняться и сама база,
        // туда тоже добавится новое значение.
        // А если возвращать новый словарь,
        // то при его изменении сама база останется неизменной
        // Таким образом сохраняется имутабельность!!!
        // Пользователь получит копию коллекции
        return new HashMap<>(map);
    }

    public Map<String, String> getMap() {
        return map;
    }
}
// END
