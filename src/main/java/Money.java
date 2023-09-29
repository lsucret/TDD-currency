public class Money implements Expression {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    
    Money times(int multiplier){
        return new Money(amount * multiplier,currency);
    }

    String currency(){
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return money.amount == this.amount && currency().equals(money.currency());
    }

    public Sum plus(Money addend) {
        return new Sum(this, addend);
    }

    @Override
    public Money reduce(String to) {
        return this;
    }
}