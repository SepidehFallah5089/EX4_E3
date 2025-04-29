public class Employee {
    private String name;
    private double salary;

    // سازنده با دو آرگومان
    public Employee(String employeeName, double currentSalary) {
        this.name = employeeName;
        this.salary = currentSalary;
    }

    // دریافت نام کارمند
    public String getName() {
        return name;
    }

    // دریافت حقوق کارمند
    public double getSalary() {
        return salary;
    }

    // افزایش حقوق بر اساس درصد مشخص
    public void raiseSalary(double byPercent) {
        double increase = salary * byPercent / 100;
        salary += increase;
    }
}

public class EX4_E3_12 {
    public static void main(String[] args) {
        // ایجاد نمونه‌ای از کلاس Employee
        Employee harry = new Employee("Hacker, Harry", 50000);
        System.out.println("نام: " + harry.getName());
        System.out.println("حقوق اولیه: " + harry.getSalary());

        // افزایش حقوق به میزان 10 درصد
        harry.raiseSalary(10);
        System.out.println("حقوق پس از افزایش: " + harry.getSalary());
    }
}
