public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return money.amount == this.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

}
