package engine;

import java.util.Objects;

public class Matches {
    private int matches;

    public Matches() {
    }

    public Matches(int matches) {
        this.matches = matches;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Matches matches1 = (Matches) object;
        return matches == matches1.matches;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), matches);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "matches{" +
                "matches=" + matches +
                '}';
    }
}