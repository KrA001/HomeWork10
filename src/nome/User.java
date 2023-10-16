package nome;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20) {
            throw new IllegalNameLengthException("имя не должно быть глинее чем 20 символов");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age  < 1 || age > 100) {
            throw new IllegalAgeException("возраст не должен быть меньше 1 т больше 100");
        }
        this.age = age;
    }
}
