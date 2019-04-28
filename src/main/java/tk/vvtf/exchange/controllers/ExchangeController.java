package tk.vvtf.exchange.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.vvtf.exchange.entity.ExchangeDatabase;
import tk.vvtf.exchange.entity.ExchangeRequest;
import tk.vvtf.exchange.entity.ExchangeResult;

import java.util.ArrayList;
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
     * @param exchangeRequest entity containing information for exchange
     * @return result with original and exchanged data
     */
    @RequestMapping("/exchange")
    public ExchangeResult exchange(@RequestBody ExchangeRequest exchangeRequest) {
        // TODO implement exchange mechanism
        System.out.println("Received request: " + exchangeRequest);

        return new ExchangeResult(
                "",
                "",
                0.0f,
                0.0f,
                0.0f
                );
    }

    /**
     * Available currencies
     *
     * @return list of available currency codes
     */
    @RequestMapping("/currencies")
    public List<String> currencies() {
        return ExchangeDatabase.getSupportedCurrencies().stream().map(Currency::getCurrencyCode).collect(Collectors.toList());
    }

}
