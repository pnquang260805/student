public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private float score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return String.valueOf(this.id) + " " + this.name + " " + String.valueOf(this.score);
    }

    @Override
    public int compareTo(Student other){
        return Float.compare(this.score, other.score);
    }
}
