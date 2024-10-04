package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    protected String toOpenTag(String tagName, Map<String, String> attributes) {
        StringBuilder res = new StringBuilder();
        res.append("<");
        res.append(tagName);
        for (var entry : attributes.entrySet()) {
            res.append(String.format(" %s=\"%s\"", entry.getKey(), entry.getValue()));
        }
        res.append(">");
        return res.toString();
    }

    protected String toCloseTag(String tagName) {
        return String.format("</%s>", tagName);
    }
}
// END
