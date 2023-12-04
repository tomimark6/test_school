package Funkcje.cwiczenia;

public class User {


        private String  Name;
        private String  lastName;

        private int age;

        public  User() {}

    public User(String name, String lastName, int age) {
        this.Name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

