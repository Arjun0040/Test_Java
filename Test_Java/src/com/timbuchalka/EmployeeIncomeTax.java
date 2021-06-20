package com.timbuchalka;

public class EmployeeIncomeTax {
    public static void main(String[] args) {

    }

    static int calculateIncomeTax(int sal) {
        if (sal < 50_000) {
            return 0;
        } else if (sal >50_000 && sal <60_000) {
            return sal * (110/100);
        } else if (sal > 60_000 && sal < 1_50_000) {
            return sal * (120/100);
        } else if (sal > 1_50_000) {
            return sal *  (130/100);
        }
        return -1;
    }
}
