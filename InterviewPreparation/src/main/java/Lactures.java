import java.util.Comparator;

public class Lactures implements Comparator<Lactures> {
    int score;
    String name;

    public Lactures(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public Lactures() {

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compare(Lactures L1, Lactures L2) {
        return L1.getName().compareTo(L2.getName());
    }
}
