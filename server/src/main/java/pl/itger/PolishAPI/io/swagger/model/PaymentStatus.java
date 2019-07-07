package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Słownik statusów płatności
 */
public enum PaymentStatus {

    SUBMITTED("submitted"),

    CANCELLED("cancelled"),

    PENDING("pending"),

    DONE("done"),

    REJECTED("rejected"),

    SCHEDULED("scheduled");

    private String value;

    PaymentStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static PaymentStatus fromValue(String text) {
        for (PaymentStatus b : PaymentStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}

