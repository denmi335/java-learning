class Student {
    String name;
    int age;
    double gpa;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    String getName() { return name; }
    int getAge() { return age; }
    double getGpa() { return gpa; }

    @Override
    public String toString() {
        return name + " (" + age + " лет, GPA: " + gpa + ")";
    }
}