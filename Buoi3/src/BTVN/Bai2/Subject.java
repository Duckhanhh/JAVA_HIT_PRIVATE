package BTVN.Bai2;
import java.util.Scanner;

public class Subject {
    private String id;
    private String subjectName;
    private int studentCount;
    private String timeStart;
    private String timeEnd;

    public Subject() {
    }

    public void display() {
        System.out.printf("%-3s%-15s%-15d%s - %s\n", id, subjectName, studentCount, timeStart, timeEnd);
    }

    public int timeStart() {
        int res = 0, h = 0, m = 0;
        if (timeStart.length() <= 4) {
            h = 60 * ((int) timeStart.charAt(0) - 48) + ((int) timeStart.charAt(2) - 48) * 10 + ((int) timeStart.charAt(3) - 48);
        } else {
            h = 600 * ((int) timeStart.charAt(0) - 48) + 60 * ((int) timeStart.charAt(1) - 48) + ((int) timeStart.charAt(3) - 48) * 10 + ((int) timeStart.charAt(4) - 48);
        }
        return h;
    }

    public int timeEnd() {
        int res = 0, h = 0, m = 0;
        if (timeEnd.length() <= 4) {
            h = 60 * ((int) timeEnd.charAt(0) - 48) + ((int) timeEnd.charAt(2) - 48) * 10 + ((int) timeEnd.charAt(3) - 48);
        } else {
            h = 600 * ((int) timeEnd.charAt(0) - 48) + 60 * ((int) timeEnd.charAt(1) - 48) + ((int) timeEnd.charAt(3) - 48) * 10 + ((int) timeEnd.charAt(4) - 48);
        }
        return h;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input subject!");
        System.out.print("Input id: ");
        String id = sc.nextLine();
        System.out.print("Input subject name: ");
        String subjectName = sc.nextLine();
        System.out.print("Input student count: ");
        int studentCount = sc.nextInt();
        sc.nextLine();
        System.out.print("Input time start: ");
        String timeStart = sc.nextLine();
        System.out.print("Input time end: ");
        String timeEnd = sc.nextLine();
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}

