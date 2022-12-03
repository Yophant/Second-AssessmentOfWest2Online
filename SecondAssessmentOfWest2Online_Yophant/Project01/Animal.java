public abstract class Animal {
    protected String name;
    protected int age;
    protected char sex;
    protected double price;

    public Animal() {
        this.name = "暂无";
        this.age = 0;
        this.sex = '/';
        this.price = 0;
    }

    public Animal(String name, int age, char sex, double price) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.price = price;
    }

    public abstract String toString();

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getPrice() {
        return price;
    }

}
