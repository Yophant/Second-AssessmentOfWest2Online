
/*
 * 过程中遇到的一些问题和做的不好的地方
 * - 对于LocalDate掌握还不够细致，需要多家巩固，对于LocalDate的加减不够了解
 * - 相同品种动物price售价确定，但题目规定price在抽象类中声明，好像子类没法对其再声明静态成员变量，
 *   而且java好像不支持方法参数设置默认值，除非进行方法重载，导致每次new新对象都要对price进行相同赋值，会更加麻烦一些
 * - 编译过程中出现的5个警告都是变量未使用，在此之前我已经删除完全没有用到的变量，其中2个我作为例子写在了注释里。剩下3个是我用了this指针调用赋值不知道为什么还会报这个警告
 */
public class Test {
    public static void main(String[] args) {

        MyAnimalShop ms = new MyAnimalShop(1200, true);

        ChineseRuralDog crd = new ChineseRuralDog("大黄", 5, 'm', 100, true);
        ChineseRuralDog crd2 = new ChineseRuralDog("小黄", 3, 'f', 100, true);

        Cat ct = new Cat("Kitty", 2, 'f', 200);
        Cat ct2 = new Cat("Feather", 1, 'm', 200);
        Cat ct3 = new Cat("Cleo", 3, 'f', 200);

        Pig pg = new Pig("Wilbur", 8, 'm', 300);
        Pig pg2 = new Pig("PeppaPig", 5, 'm', 300);
        // 买入动物
        ms.purchaseAnimal(crd);
        ms.purchaseAnimal(crd2);
        ms.purchaseAnimal(ct);
        ms.purchaseAnimal(ct2);
        ms.purchaseAnimal(ct3);
        ms.purchaseAnimal(pg);
        // *ms.purchaseAnimal(pg2); 报错:InsufficientBalanceException,显示余额不足

        System.out.println();
        Customer cu1 = new Customer("yyh", 1, 2022, 12, 1);
        Customer cu2 = new Customer("ljy", 2, 2022, 12, 3);
        Customer cu3 = new Customer("ylp", 1, 2023, 1, 1);
        Customer cu4 = new Customer("wzz", 3, 2023, 1, 8);
        Customer cu5 = new Customer("wxx", 3, 2022, 12, 20);
        Customer cu6 = new Customer("lmx", 3, 2022, 12, 3);
        Customer cu7 = new Customer("hx", 3, 2022, 12, 3);
        Customer cu8 = new Customer("yophan", 3, 2022, 12, 26);
        // 卖出动物
        ms.welcomeCustomer(cu1, pg);
        ms.welcomeCustomer(cu2, ct2);
        ms.welcomeCustomer(cu3, ct);
        ms.welcomeCustomer(cu4, crd);
        // *ms.welcomeCustomer(cu5, pg2); 报错:AnimalNotFountException,显示店内没有该动物出售
        ms.welcomeCustomer(cu6, crd2);
        ms.welcomeCustomer(cu7, ct3);
        // *ms.welcomeCustomer(cu8, ct2); 报错:AnimalNotFountException,动物售罄,显示店内没有该动物出售
        System.out.println();
        // *输出当日到店顾客名单以及当日利润，若名单为空,利润为0，可修改上列顾客初始化日期与现实日期一致以检验
        ms.shutDown();

    }
}
