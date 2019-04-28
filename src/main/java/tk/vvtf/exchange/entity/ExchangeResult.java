package tk.vvtf.exchange.entity;

import java.util.Objects;

/**
 * Simple exchange result
 */
public class ExchangeResult {

    /**
     * Original currency code
     */
    public final String originalCurrency;

    /**
     * Target currency code
     */
    public final String targetCurrency;

    /**
     * Exchange rate between the two currencies
     */
    public final Float exchangeRate;

    /**
     * Original amount
     */
    public final Float originalAmount;

    /**
     * New amount
     */
    public final Float exchangedAmount;

    /**
     * Constructor
     *
     * @param originalCurrency
     * @param targetCurrency
     * @param exchangeRate
     * @param originalAmount
     * @param exchangedAmount
     */
    public ExchangeResult(String originalCurrency, String targetCurrency, Float exchangeRate, Float originalAmount, Float exchangedAmount) {
        this.originalCurrency = originalCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
        this.originalAmount = originalAmount;
        this.exchangedAmount = exchangedAmount;
    }

    public String getOriginalCurrency() {
        return originalCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public Float getExchangeRate() {
        return exchangeRate;
    }

    public Float getOriginalAmount() {
        return originalAmount;
    }

    public Float getExchangedAmount() {
        return exchangedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExchangeResult)) return false;
        ExchangeResult that = (ExchangeResult) o;
        return Objects.equals(getOriginalCurrency(), that.getOriginalCurrency()) &&
                Objects.equals(getTargetCurrency(), that.getTargetCurrency()) &&
                Objects.equals(getExchangeRate(), that.getExchangeRate()) &&
                Objects.equals(getOriginalAmount(), that.getOriginalAmount()) &&
                Objects.equals(getExchangedAmount(), that.getExchangedAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOriginalCurrency(), getTargetCurrency(), getExchangeRate(), getOriginalAmount(), getExchangedAmount());
    }

    @Override
    public String toString() {
        return "ExchangeResult{" +
                "originalCurrency='" + originalCurrency + '\'' +
                ", desiredCurrency='" + targetCurrency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", originalAmount=" + originalAmount +
                ", exchangedAmount=" + exchangedAmount +
                '}';
    }
}
