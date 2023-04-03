package daily_videos.day7_ifStatements;

public class NetIncomeCalc {
    public static void main(String[] args) {
        int salary = 100000;
        double taxRate = 0;
        boolean isMarried = true;


        if (salary >= 130000) {//if the salary is 130k or more,then the tax rate should be 35%
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary < 130000) {//if the salary is between 100k to 130k (excluded) then the tax rate should be 30%
            taxRate = 0.30;
        }
        if (salary >= 80_000 && salary < 100_000) {//if the salary is between 80k to 1000k(excluded) then the tax rate 25%
            taxRate = 0.25;
        }
        if (salary < 80_000) {//if the salary is between 80k,then the tax rate 20%
            taxRate = 0.20;
        }

        if (isMarried) {//if the person is married
            taxRate -= 0.05;// tax is reduced by 5%

        }
        double totallTax = salary * taxRate;
        double netIncome = salary * (1 - taxRate);

        System.out.println("salary =" + salary);
        System.out.println("totalTax = " + totallTax);
        System.out.println("netIncome = " + netIncome);

    }
}







