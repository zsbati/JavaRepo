
class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}