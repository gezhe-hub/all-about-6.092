public class FooCorporation {
    public static void calculatePay(double basePay, int hoursWorked) {
      if (basePay < 8.0) {
        System.out.println("错误：时薪低于最低标准 ($8.00)");
        return; 
      }
      if (hoursWorked > 60) {
        System.out.println("错误：工时超过每周最大限制 (60小时)");
        return;
      }
    }

    public static void main(String[] args) {
        System.out.print("Employee 1 (7.50, 35): ");
        calculatePay(7.50, 35);

        System.out.print("Employee 2 (8.20, 47): ");
        calculatePay(8.20, 47);

        System.out.print("Employee 3 (10.00, 73): ");
        calculatePay(10.00, 73);
    }
}
