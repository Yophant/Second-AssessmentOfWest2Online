public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, char sex, double price) {
        super(name, age, sex, price);
        System.out.println("猫猫" + name + "创建成功");
    }

    @Override
    public String toString() {
        return "猫猫名字:" + this.name + " 年龄:" + this.age + " 性别:" + this.sex + " 售价:" + this.price;
    }
}