public class ChineseRuralDog extends Animal {
    private boolean isVaccineInjected;

    public ChineseRuralDog() {
        isVaccineInjected = false;
    }

    public ChineseRuralDog(String name, int age, char sex, double price, boolean isVaccineInjected) {
        super(name, age, sex, price);
        setIsVaccineInjected(isVaccineInjected);
        System.out.println("中华田园犬" + name + "创建成功");
    }

    public void setIsVaccineInjected(boolean isVaccineInjected) {
        this.isVaccineInjected = isVaccineInjected;
    }

    public boolean getIsVaccineInjected() {
        return isVaccineInjected;
    }

    @Override
    public String toString() {
        return "狗狗名字:" + name + " 年龄:" + age + " 性别:" + this.sex + " 售价:" + price;
    }
}