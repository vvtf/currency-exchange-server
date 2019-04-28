package tk.vvtf.exchange.entity;

import java.util.Objects;

/**
 * Simple currency exchange request
 */
public class ExchangeRequest {

    /**
     * Original currency code
     */
    public final String originalCurrency;

    /**
     * Target currency code
     */
    public final String targetCurrency;

    /**
     * Amount to be exchanged
     */
    public final Float sum;

    /**
     * Constructor for the request
     *
     * @param originalCurrency
     * @param targetCurrency
     * @param sum
     */
    public ExchangeRequest(String originalCurrency, String targetCurrency, Float sum) {
        this.originalCurrency = originalCurrency;
        this.targetCurrency = targetCurrency;
        this.sum = sum;
    }

    public String getOriginalCurrency() {
        return originalCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public Float getSum() {
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExchangeRequest)) return false;
        ExchangeRequest that = (ExchangeRequest) o;
        return Objects.equals(getOriginalCurrency(), that.getOriginalCurrency()) &&
                Objects.equals(getTargetCurrency(), that.getTargetCurrency()) &&
                Objects.equals(getSum(), that.getSum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOriginalCurrency(), getTargetCurrency(), getSum());
    }

    @Override
    public String toString() {
        return "ExchangeRequest{" +
                "originalCurrency='" + originalCurrency + '\'' +
                ", targetCurrency='" + targetCurrency + '\'' +
                ", sum=" + sum +
                '}';
    }
}
