package tk.vvtf.exchange.entity;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Simple in-memory database for exchange
 */
public class ExchangeDatabase {

    /**
     * List of supported currencies
     * @return list of currencies
     */
    public static List<Currency> getSupportedCurrencies() {
        List<Currency> supportedCurrencies = new ArrayList<>();
        supportedCurrencies.add(Currency.getInstance("CZK"));
        supportedCurrencies.add(Currency.getInstance("EUR"));
        supportedCurrencies.add(Currency.getInstance("USD"));
        supportedCurrencies.add(Currency.getInstance("VND"));
        supportedCurrencies.add(Currency.getInstance("PLN"));
        return supportedCurrencies;
    }

}
