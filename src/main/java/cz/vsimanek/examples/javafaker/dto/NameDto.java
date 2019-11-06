package cz.vsimanek.examples.javafaker.dto;

/**
 * Simple class representation of return object with name attribute.
 */
public class NameDto {

    private String name;

    public NameDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
