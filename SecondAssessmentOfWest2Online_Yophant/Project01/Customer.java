import java.time.LocalDate;

public class Customer {
    private String cName;
    private int arrivalCounts;
    private LocalDate recentArrival;

    public Customer() {
        this.cName = "暂无";
        this.arrivalCounts = 0;
        this.recentArrival = LocalDate.of(0, 0, 0);
    }

    public Customer(String cName, int arrivalCounts, int year, int month, int day) {
        this.cName = cName;
        this.arrivalCounts = arrivalCounts;
        this.recentArrival = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "顾客姓名:" + cName + " 到店次数:" + arrivalCounts + " 最新到达时间:" + recentArrival;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getArrivalCounts() {
        return arrivalCounts;
    }

    public void setArrivalCounts(int arrivalCounts) {
        this.arrivalCounts = arrivalCounts;
    }

    public LocalDate getRecentArrival() {
        return recentArrival;
    }

    public void setRecentArrival(int year, int month, int day) {
        this.recentArrival = LocalDate.of(year, month, day);
    }
}
