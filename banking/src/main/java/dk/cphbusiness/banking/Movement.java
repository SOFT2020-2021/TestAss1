package dk.cphbusiness.banking;

public class Movement {
    Account target;
    Account source;
    long amount;
    long timestamp;

    public Account getTarget() {
        return target;
    }

    public long getAmount() {
        return amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Movement(Account target, long amount, long timestamp) {
        this.target = target;
              this.amount = amount;
        this.timestamp = timestamp;


    }
}