package tk.vvtf.exchange.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.vvtf.exchange.entity.ExchangeDatabase;
import tk.vvtf.exchange.entity.ExchangeRequest;
import tk.vvtf.exchange.entity.ExchangeResult;

import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Basic REST controller for the exchange
 */
@RestController
public class ExchangeController {

    /**
     * Exchanges the sum to desired currency
     *
     * @param exchangeRequest entity containing information for exchange
     * @return result with original and exchanged data
     */
    @RequestMapping("/exchange")
    public ExchangeResult exchange(@RequestBody ExchangeRequest exchangeRequest) {
        Currency originalCurrency = Currency.getInstance(exchangeRequest.originalCurrency.toUpperCase());
        Currency targetCurrency = Currency.getInstance(exchangeRequest.targetCurrency.toUpperCase());

        if (!ExchangeDatabase.supportedCurrencies.contains(originalCurrency) || !ExchangeDatabase.supportedCurrencies.contains(targetCurrency)) {
            throw new IllegalArgumentException("Why u do dis? You used unsupported currency");
        }

        return new ExchangeResult(
                originalCurrency.getCurrencyCode(),
                targetCurrency.getCurrencyCode(),
                ExchangeDatabase.exchangeRate(originalCurrency, targetCurrency),
                exchangeRequest.sum,
                ExchangeDatabase.exchange(originalCurrency, targetCurrency, exchangeRequest.sum)
        );
    }

    /**
     * Available currencies
     *
     * @return list of available currency codes
     */
    @RequestMapping("/currencies")
    public List<String> currencies() {
        return ExchangeDatabase.supportedCurrencies.stream().map(Currency::getCurrencyCode).collect(Collectors.toList());
    }

}
