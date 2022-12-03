import java.util.ArrayList;
import java.time.LocalDate;

public class MyAnimalShop implements AnimalShop {
    private double balance; // 余额
    private double profit = 0;
    private boolean isOn; // 是否正在营业

    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public MyAnimalShop(double balance, boolean isOn) {
        this.balance = balance;
        this.isOn = isOn;
    }

    // 买入新动物，题目没有规定动物买入价格，我这里按售价90%来算买入价格
    @Override
    public void purchaseAnimal(Animal animal) {
        if (balance < animal.getPrice()) {
            throw new InsufficientBalanceException("余额不足以买入" + animal.getName());
        } else {
            balance = balance - animal.price * 0.9;
            animals.add(animal);
        }
        System.out.println("已买入:" + animal.toString());
    }

    // 招待顾客
    @Override
    public void welcomeCustomer(Customer cu, Animal an) {
        System.out.println("Nice to meet you! Welcome to yyh's Animalshop");
        customers.add(cu);
        boolean isExist = animals.contains(an);
        if (animals.size() == 0 || isExist == false) {
            throw new AnimalNotFountException("店内没有该动物出售了");
        } else {
            LocalDate now01 = LocalDate.now();
            // 判断是否属于当天的利润
            if (cu.getRecentArrival().isEqual(now01)) {
                profit += 0.1 * an.price;
            }
            animals.remove(an);
            System.out.println("已卖出:" + an.toString() + " 日期:" + cu.getRecentArrival());
        }
    }

    // 歇业
    @Override
    public void shutDown() {
        this.isOn = false;
        System.out.println("当日到店的顾客名单:");
        // 获取当前日期
        LocalDate now01 = LocalDate.now();
        for (Customer cus : customers) {
            if (cus.getRecentArrival().isEqual(now01)) {
                System.out.println(cus.toString());
            }
        }
        System.out.println("今天的利润是:" + profit + "元");

        // 利润置零
        profit = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
