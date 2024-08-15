package app;

public class Main {
    static double taxRate;
    static double preTaxIncome;
    static double incomeTax;

    public static void main(String[] args) {
        preTaxIncome = 10000;
        taxRate = getTaxRateValue(preTaxIncome);
        incomeTax = calcIncomeTax(taxRate, preTaxIncome);

        printTaxIncomeInfo(taxRate, preTaxIncome, incomeTax);

        preTaxIncome = 25000;
        taxRate = getTaxRateValue(preTaxIncome);
        incomeTax = calcIncomeTax(taxRate, preTaxIncome);

        printTaxIncomeInfo(taxRate, preTaxIncome, incomeTax);

        preTaxIncome = 44000;
        taxRate = getTaxRateValue(preTaxIncome);
        incomeTax = calcIncomeTax(taxRate, preTaxIncome);

        printTaxIncomeInfo(taxRate, preTaxIncome, incomeTax);
    }

    public static double getTaxRateValue (double income) {
        if (income <= 10000) {
            return 2.5;
        }

        if (income <= 25000) {
            return 4.3;
        }

        return 6.7;
    }

    public static double calcIncomeTax (double tax, double preTaxIncome) {
        return (tax * preTaxIncome) / 100;
    }

    public static void printTaxIncomeInfo (double taxRate, double preTaxIncome, double incomeTax) {
        System.out.println(
            "With an income of " + preTaxIncome +
            ", the tax rate is " + taxRate +
            "%, and the tax amount is " + incomeTax + "."
        );
    }
}
