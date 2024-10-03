package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String value;
    private TagInterface tagInterface;

    public LabelTag(String tag, TagInterface tagInterface) {
        this.value = tag;
        this.tagInterface = tagInterface;
    }

    @Override
    public String render() {
        return String.format("<label>Press Submit%s</label>", tagInterface.render());
    }
}
// END
