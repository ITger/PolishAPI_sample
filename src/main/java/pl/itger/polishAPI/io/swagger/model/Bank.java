package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zawierająca dane banku używana w żądaniach AIS / AIS Bank Data Class
 */
@ApiModel(description = "Klasa zawierająca dane banku używana w żądaniach AIS / AIS Bank Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @JsonProperty("bicOrSwift")
    private String bicOrSwift = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("code")
    private String code = null;

    @JsonProperty("countryCode")
    private String countryCode = null;

    @JsonProperty("address")
    private Address address = null;

    public Bank bicOrSwift(String bicOrSwift) {
        this.bicOrSwift = bicOrSwift;
        return this;
    }

    /**
     * Numer BIC/SWIFT Banku / BIC/SWIFT number
     *
     * @return bicOrSwift
     **/
    @ApiModelProperty(value = "Numer BIC/SWIFT Banku / BIC/SWIFT number")

    @Size(max = 11)
    public String getBicOrSwift() {
        return bicOrSwift;
    }

    public void setBicOrSwift(String bicOrSwift) {
        this.bicOrSwift = bicOrSwift;
    }

    public Bank name(String name) {
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

    public Bank code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Kod Banku, dla przelewów zagranicznych / Bank's code
     *
     * @return code
     **/
    @ApiModelProperty(value = "Kod Banku, dla przelewów zagranicznych / Bank's code")

    @Size(max = 10)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bank countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Kod kraju 3166-1 / Country code
     *
     * @return countryCode
     **/
    @ApiModelProperty(value = "Kod kraju 3166-1 / Country code")

    @Size(max = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Bank address(Address address) {
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
        Bank bank = (Bank) o;
        return Objects.equals(this.bicOrSwift, bank.bicOrSwift) &&
                Objects.equals(this.name, bank.name) &&
                Objects.equals(this.code, bank.code) &&
                Objects.equals(this.countryCode, bank.countryCode) &&
                Objects.equals(this.address, bank.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bicOrSwift, name, code, countryCode, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bank {\n");

        sb.append("    bicOrSwift: ").append(toIndentedString(bicOrSwift)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

