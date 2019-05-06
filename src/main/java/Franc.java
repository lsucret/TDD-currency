public class Franc extends Money {

    String currency;

    Franc(int amount, String currency){
        super(amount,currency);
    }

    Money times(int multiplier){
        return new Money(amount * multiplier,currency);
    }

    String currency(){
        System.out.println("Franc 오버라이딩"+currency);
        return currency;
    }
}