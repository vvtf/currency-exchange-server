package tk.vvtf.exchange.entity;

import java.util.Currency;

/**
 * Currency pairs with exchange rate
 */
public class CurrencyPair {

    /**
     * Original currency
     */
    private final Currency original;

    /**
     * Target currency
     */
    private final Currency target;

    /**
     * Exchange rate for the currencies
     */
    private final Float rate;

    public CurrencyPair(Currency original, Currency target, Float rate) {
        this.original = original;
        this.target = target;
        this.rate = rate;
    }

    public Currency getOriginal() {
        return original;
    }

    public Currency getTarget() {
        return target;
    }

    public Float getRate() {
        return rate;
    }
}
