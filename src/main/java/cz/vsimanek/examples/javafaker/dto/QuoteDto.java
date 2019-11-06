package cz.vsimanek.examples.javafaker.dto;

/**
 * Simple class representation of return object with quote attribute.
 */
public class QuoteDto {

    private String quote;

    public QuoteDto(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
