package tk.vvtf.exchange.entity;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Simple in-memory database for exchange
 */
public class ExchangeDatabase {

    /**
     * List of supported currencies
     */
    public static List<Currency> supportedCurrencies = new ArrayList<Currency>() {
        {
            add(Currency.getInstance("CZK"));
            add(Currency.getInstance("EUR"));
            add(Currency.getInstance("USD"));
        }
    };

    /**
     * Pairs with exchange rates
     */
    private static List<CurrencyPair> currencyPairs = new ArrayList<CurrencyPair>() {
        {
            add(new CurrencyPair(Currency.getInstance("EUR"), Currency.getInstance("CZK"), 25.16f));
            add(new CurrencyPair(Currency.getInstance("EUR"), Currency.getInstance("USD"), 1.12f));
            add(new CurrencyPair(Currency.getInstance("USD"), Currency.getInstance("CZK"), 22.88f));
        }
    };

    /**
     * Returns exchange rate for the currency pair
     *
     * @param original original currency
     * @param target   target currency
     * @return exchange rate
     * @throws IllegalArgumentException if no exchange rate was found
     */
    public static Float exchangeRate(Currency original, Currency target) throws IllegalArgumentException {
        List<CurrencyPair> pairs = currencyPairs.stream().filter(pair -> pair.getOriginal().equals(original) && pair.getTarget().equals(target)).collect(Collectors.toList());
        if (!pairs.isEmpty()) {
            return pairs.get(0).getRate();
        }

        pairs = currencyPairs.stream().filter(pair -> pair.getOriginal().equals(target) && pair.getTarget().equals(original)).collect(Collectors.toList());
        if (!pairs.isEmpty()) {
            return 1 / pairs.get(0).getRate();
        } else {
            throw new IllegalArgumentException("exchange rate was not found");
        }
    }

    /**
     * Returns exchanged amount
     *
     * @param original original currency
     * @param target   target currency
     * @param amount   amount to exchange
     * @return exchanged amount
     * @throws IllegalArgumentException if no exchange rate was found
     */
    public static Float exchange(Currency original, Currency target, Float amount) throws IllegalArgumentException {
        return exchangeRate(original, target) * amount;
    }
}
