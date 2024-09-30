package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;

    public FileKV(String path, Map<String, String> map) {
        this.path = path;
        Utils.writeFile(path, Utils.serialize(map));
    }

    public void set(String key, String value) {
        Map<String, String> map = Utils.deserialize(Utils.readFile(path));
        map.put(key, value);
        Utils.writeFile(path, Utils.serialize(map));
    }

    public String get(String key, String defaultValue) {
        Map<String, String> map = Utils.deserialize(Utils.readFile(path));
        String res = map.get(key);
        if (res == null) return defaultValue;
        return res;
    }

    public void unset(String key) {
        Map<String, String> map = Utils.deserialize(Utils.readFile(path));
        map.remove(key);
        Utils.writeFile(path, Utils.serialize(map));
    }

    public Map<String, String> toMap() {
        return Utils.deserialize(Utils.readFile(path));
    }
}
// END
