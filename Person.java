class Person {
    private String name;
    private int age;
    private double height;

    public Person() {
        name = "";
        age = 0;
        height = 0;
    }

    public Person(String nName, int nAge, double nheight) {
        name = nName;
        age = nAge;
        height = nheight;
    }

    public void setheight(double nheight) {
        height = nheight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String nName) {
        name = nName;
    }

    public void setAge(int nAge) {
        age = nAge;
    }

    public String toString() {
        return "Person(" + name + "," + age + "," + height + ")";
    }
}