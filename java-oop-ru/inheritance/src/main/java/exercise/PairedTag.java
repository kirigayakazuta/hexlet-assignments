package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private final String tagName;
    private final Map<String, String> attributes;
    private final String tail;
    private final List<Tag> list;

    public PairedTag(String tagName, Map<String, String> attributes, String tail, List<Tag> list) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.tail = tail;
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(toOpenTag(tagName, attributes));
        for (var singleTag : list) {
            res.append(singleTag.toString());
        }
        res.append(tail);
        res.append(toCloseTag(tagName));
        return res.toString();
    }
}
// END
