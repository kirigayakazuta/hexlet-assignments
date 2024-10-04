package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private final String tagName;
    private final Map<String, String> attributes;

    public SingleTag(String tagName, Map<String, String> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return toOpenTag(tagName, attributes);
    }
}
// END
