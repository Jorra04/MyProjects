package Easy;

public class debtRecord {
	String borrower = "";
    String lender = "";
    int amount = 0;
    debtRecord()
    {
        // empty constructor
    }
    debtRecord(String borrower, String lender, int amount)
    {
        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
    }
}
