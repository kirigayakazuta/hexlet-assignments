package exercise;

import java.lang.CharSequence;
import java.lang.StringBuilder;
// BEGIN
public class ReversedSequence implements CharSequence {
    private String string;

    public ReversedSequence(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return new StringBuilder(string).reverse().toString();
    }

    public int length() {
        return string.length();
    }

    public char charAt(int index) {
        return string.charAt(string.length() - 1 - index);
    }

    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(string.substring(string.length() - end, string.length() - start));
    }
}

// END
