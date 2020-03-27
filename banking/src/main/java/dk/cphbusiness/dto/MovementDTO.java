package dk.cphbusiness.dto;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Movement;

public class MovementDTO extends Base {

    long amount;
    long timestamp;

    public long getAmount() {
        return amount;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public MovementDTO(Movement movement){
        this.amount = movement.getAmount();
        this.timestamp = movement.getTimestamp();
    }

    public MovementDTO(AccountDTO target, long amount, long timestamp) {
        this.amount = amount;
        this.timestamp = timestamp;
    }
}
