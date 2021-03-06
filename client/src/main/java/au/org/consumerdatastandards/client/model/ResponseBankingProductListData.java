/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.List;
import java.util.Objects;

public class ResponseBankingProductListData {

    private List<BankingProduct> products;

    /**
     * The list of products returned.  If the filter results in an empty set then this array may have no records
     * @return products
     */
    public List<BankingProduct> getProducts() {
        return products;
    }

    public void setProducts(List<BankingProduct> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseBankingProductListData responseBankingProductListData = (ResponseBankingProductListData) o;
        return Objects.equals(this.products, responseBankingProductListData.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            products);
    }

    @Override
    public String toString() {
        return "class ResponseBankingProductListData {\n" +
            "   products: " + toIndentedString(products) + "\n" + 
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
