package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Słownik statusów płatności / Dictionary of payment statuses
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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
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
}

