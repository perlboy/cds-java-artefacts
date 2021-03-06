/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;

public class BankingInternationalPayeeBankDetailsBankAddress {

    private String address;

    private String name;

    /**
     * Address of the recipient Bank
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Name of the recipient Bank
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingInternationalPayeeBankDetailsBankAddress bankingInternationalPayeeBankDetailsBankAddress = (BankingInternationalPayeeBankDetailsBankAddress) o;
        return Objects.equals(this.address, bankingInternationalPayeeBankDetailsBankAddress.address) &&
            Objects.equals(this.name, bankingInternationalPayeeBankDetailsBankAddress.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            address,
            name);
    }

    @Override
    public String toString() {
        return "class BankingInternationalPayeeBankDetailsBankAddress {\n" +
            "   address: " + toIndentedString(address) + "\n" + 
            "   name: " + toIndentedString(name) + "\n" + 
            "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
