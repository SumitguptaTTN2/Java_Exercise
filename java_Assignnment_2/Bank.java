//Exercise
//        Implement a banking system using java.
//
//        Create 3 sub class of Bank : SBI,BOI,ICICI
//
//        All 4 should have following methods:
//
//        getDetails which provide their specific details like rateofinterest etc
//        printDetails of every bank.
//        Every bank account should have a type (enum): SAVINGS, CURRENT
//        Implement a feature to deduct amount from account. Throw InsufficientAmountException if amount being deducted is less than the current balance.
//        Every banking transaction should be saved in a file of each bank's transaction log which would have all details of the transaction like (time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,transaction status (can also be enum), failure reason if any)
//


package AssignmnetJava_Tuesday;

class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String message) {
        super(message);
    }
}

public class Bank {
    long AccounNo;
    String Accountname;

    enum AccountType {
        Saving, Current
    }

    int ROI;
    long Amount;

    void setAccountname(String Accname) {
        this.Accountname = Accname;
    }

    void getROI() {
        System.out.println(this.ROI);
    }

    void getAccName() {
        System.out.println(this.Accountname);
    }


    String withrdaw(int wd) {

        try {
            if (this.Amount >= wd) {
                this.Amount = this.Amount - wd;
                return ("sucess check_log.txt \n");
            } else {
                throw new InsufficientAmountException("Exception");
            }
        } catch (InsufficientAmountException e) {
            return ("InsufficientAmountException Can't Deduct ");
        }

    }

    Bank(long accounNo, String accountname, long amount) {
        this.AccounNo = accounNo;
        this.Accountname = accountname;
        this.Amount = amount;
    }


    String get_Details(int c) {
        String Actype = "";
        if (c == 1)
            Actype = String.valueOf(AccountType.Saving);
        else {
            Actype = String.valueOf(AccountType.Current);
        }
        return ("AccountName:" + this.Accountname + "\n" + "AccountNo :" + this.AccounNo + "\n" + "Amount:" + this.Amount + "\n" + "AccountType:" + Actype + "\n" + "Rate of Interest :" + ROI + "\n");
    }
}

class BOI extends Bank {
    BOI(long accounNo, String accountname, long amount) {
        super(accounNo, accountname, amount);
        this.ROI = 12;
        System.out.println("BOI");
    }

}

class ICICI extends Bank {

    ICICI(long accounNo, String accountname, long amount) {
        super(accounNo, accountname, amount);
        this.ROI = 10;
        System.out.println("ICICI");
    }

}

class SBI extends Bank {
    SBI(long accounNo, String accountname, long amount) {
        super(accounNo, accountname, amount);
        this.ROI = 15;
        System.out.println("SBI");
    }

}






