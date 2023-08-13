public class Paycheck {
    private String Name;
    private double hour_pay;
    private double hour_work;


    public Paycheck(String name, double pay, double hours) {
        Name = name;
        hour_pay =pay;
        hour_work = hours;
    }


    public void printPaycheck() {
        double regularPay;
        double overtimePay = 0.0;


        if (hour_work <= 40) {
            regularPay = hour_work * hour_pay;
        } else {
            regularPay = 40 * hour_work;
            overtimePay = (hour_work - 40) * hour_pay* 1.5;
        }

        double totalPay = regularPay + overtimePay;


        System.out.println("check for " +Name);
        System.out.println("Regular hours: " + hour_work + " hours");
        if (hour_work > 40) {
            System.out.println("Overtime hours: " + (hour_work - 40) + " hours");
        }
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + totalPay);
    }
}

