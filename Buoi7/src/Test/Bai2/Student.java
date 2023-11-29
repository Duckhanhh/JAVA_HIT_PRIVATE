package Test.Bai2;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    String getCapacity() {
        if (score >= 9.0) return "Xuat sac";
        else if (score >= 8.0)
            return "Gioi";
        else if (score >= 6.5)
            return "Kha";
        else return "Trung binh yeu";
    }

    @Override
    public String toString() {
        return super.toString() + "score: " + score;
    }
}
