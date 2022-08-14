package dto;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

@Slf4j
public class Expense {

    private int expenseId;
    private long amount;
    private String currency;

    public static Logger getLog() {
        return log;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
