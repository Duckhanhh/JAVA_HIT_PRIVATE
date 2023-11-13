package TL;

public class Author {
    private String name;
    private String email;
    private String gender;
    private int age;

    public Author() {
    }

    public Author(String name, String email, String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Name: " + name +
                '\n' + " Email: " + email +
                '\n' + "gender: " + gender +
                '\n' + "age: " + age;
    }
}
