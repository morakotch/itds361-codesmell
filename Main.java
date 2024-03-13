public class Main {
    public static void main(String[] args) {
        // Magic Numbers
        double salary = 50000;
        int hoursWorked = 40;
        int vacationDays = 10;

        // Long Method with Data Clumps
        if (hoursWorked > 40) {
            salary += (hoursWorked - 40) * (salary / 160) * 1.5;
        }
        if (vacationDays < 10) {
            salary -= (10 - vacationDays) * (salary / 240);
        }

        // Unnecessary Temp Field and Magic Numbers
        double taxRate = 0.30; // Magic Number
        double tax = salary * taxRate;
        double netSalary = salary - tax;

        // Directly using System.out instead of a logging framework
        System.out.println("Gross Salary: $" + salary);
        System.out.println("Tax: $" + tax);
        System.out.println("Net Salary: $" + netSalary);

        // Duplicated code for another employee (Data Clumps)
        double salary2 = 60000;
        int hoursWorked2 = 45;
        int vacationDays2 = 12;

        if (hoursWorked2 > 40) {
            salary2 += (hoursWorked2 - 40) * (salary2 / 160) * 1.5;
        }
        if (vacationDays2 < 10) {
            salary2 -= (10 - vacationDays2) * (salary2 / 240);
        }

        double taxRate2 = 0.30;
        double tax2 = salary2 * taxRate2;
        double netSalary2 = salary2 - tax2;

        System.out.println("Gross Salary: $" + salary2);
        System.out.println("Tax: $" + tax2);
        System.out.println("Net Salary: $" + netSalary2);
    }
}
