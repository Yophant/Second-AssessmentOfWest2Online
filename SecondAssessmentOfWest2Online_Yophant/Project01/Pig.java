public class Pig extends Animal {
    public Pig() {
    }

    public Pig(String name, int age, char sex, double price) {
        super(name, age, sex, price);
        System.out.println("猪猪" + name + "创建成功");
    }

    @Override
    public String toString() {
        return "猪猪名字:" + this.name + " 年龄:" + this.age + " 性别:" + this.sex + " 售价:" + this.price;
    }
}