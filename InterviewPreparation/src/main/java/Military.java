import java.util.Comparator;

public class Military implements Comparable<Military>, Comparator<Military> {

    int age;
    String name;

    public Military(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Military() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Military other){
        return this.age-other.age;
    }

    public  int compare(Military m1,Military m2){
        return m1.getName().compareTo(m2.getName());
    }
}
