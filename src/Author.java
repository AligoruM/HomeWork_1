public class Author {
    private String name;
    private String email;
    private char sex;

    public Author(String name, String email, char sex) {
        this.name = name;
        this.email = email;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                '}';
    }
}
