class BalexCompany {
    public static void calculatePay(double basePay, int hoursWorked) {
        if (basePay < 8.00) {
            System.out.println("Error: Base pay must be at least $8.00 an hour.");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: An employee cannot work more than 60 hours in a week.");
            return;
        }
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else {
            totalPay = basePay * 40 + basePay * 1.5 * (hoursWorked - 40);
        }
        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        calculatePay(7.50, 35);  // Employee 1
        calculatePay(8.20, 47);  // Employee 2
        calculatePay(10.00, 73); // Employee 3
    }
}
