public class Sum implements Expression {
    /**
     * 피가산수
     */
    Money augend;
    /**
     * 가산수
     */
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }

}
