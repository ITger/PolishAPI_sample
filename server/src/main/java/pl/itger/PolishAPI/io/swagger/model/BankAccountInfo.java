package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zawierająca dane banku / Bank Data Class
 */
@ApiModel(description = "Klasa zawierająca dane banku / Bank Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class BankAccountInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("bicOrSwift")
    private String bicOrSwift = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("address")
    private Address address = null;

    public BankAccountInfo bicOrSwift(String bicOrSwift) {
        this.bicOrSwift = bicOrSwift;
        return this;
    }

    /**
     * Numer BIC/SWIFT Banku / BIC/SWIFT number
     *
     * @return bicOrSwift
     **/
    @ApiModelProperty(value = "Numer BIC/SWIFT Banku / BIC/SWIFT number")

    @Size(max = 8)
    public String getBicOrSwift() {
        return bicOrSwift;
    }

    public void setBicOrSwift(String bicOrSwift) {
        this.bicOrSwift = bicOrSwift;
    }

    public BankAccountInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Nazwa Banku / Bank's name
     *
     * @return name
     **/
    @ApiModelProperty(value = "Nazwa Banku / Bank's name")

    @Size(max = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccountInfo address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankAccountInfo bankAccountInfo = (BankAccountInfo) o;
        return Objects.equals(this.bicOrSwift, bankAccountInfo.bicOrSwift) &&
                Objects.equals(this.name, bankAccountInfo.name) &&
                Objects.equals(this.address, bankAccountInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bicOrSwift, name, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankAccountInfo {\n");

        sb.append("    bicOrSwift: ").append(toIndentedString(bicOrSwift)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

