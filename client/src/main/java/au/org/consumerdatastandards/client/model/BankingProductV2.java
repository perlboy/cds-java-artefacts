/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

public class BankingProductV2 implements BankingProduct {

    private String productId;

    private OffsetDateTime effectiveFrom;

    private OffsetDateTime effectiveTo;

    private OffsetDateTime lastUpdated;

    private BankingProductCategory productCategory;

    private String name;

    private String description;

    private String brand;

    private String brandName;

    private String applicationUri;

    private Boolean isTailored;

    private BankingProductAdditionalInformation additionalInformation;

    private List<BankingProductV2CardArt> cardArt;

    /**
     * A data holder specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
     * @return productId
     */
    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
     * @return effectiveFrom
     */
    @Override
    public OffsetDateTime getEffectiveFrom() {
        return effectiveFrom;
    }

    @Override
    public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    /**
     * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
     * @return effectiveTo
     */
    @Override
    public OffsetDateTime getEffectiveTo() {
        return effectiveTo;
    }

    @Override
    public void setEffectiveTo(OffsetDateTime effectiveTo) {
        this.effectiveTo = effectiveTo;
    }

    /**
     * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
     * @return lastUpdated
     */
    @Override
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    @Override
    public void setLastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Get productCategory
     * @return productCategory
     */
    @Override
    public BankingProductCategory getProductCategory() {
        return productCategory;
    }

    @Override
    public void setProductCategory(BankingProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * The display name of the product
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description of the product
     * @return description
     */
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A label of the brand for the product. Able to be used for filtering. For data holders with single brands this value is still required
     * @return brand
     */
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * An optional display name of the brand
     * @return brandName
     */
    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * A link to an application web page where this product can be applied for.
     * @return applicationUri
     */
    @Override
    public String getApplicationUri() {
        return applicationUri;
    }

    @Override
    public void setApplicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
    }

    /**
     * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
     * @return isTailored
     */
    @Override
    public Boolean getIsTailored() {
        return isTailored;
    }

    @Override
    public void setIsTailored(Boolean isTailored) {
        this.isTailored = isTailored;
    }

    /**
     * Get additionalInformation
     * @return additionalInformation
     */
    @Override
    public BankingProductAdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    @Override
    public void setAdditionalInformation(BankingProductAdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * An array of card art images
     * @return cardArt
     */
    public List<BankingProductV2CardArt> getCardArt() {
        return cardArt;
    }

    public void setCardArt(List<BankingProductV2CardArt> cardArt) {
        this.cardArt = cardArt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductV2 bankingProductV2 = (BankingProductV2) o;
        return Objects.equals(this.productId, bankingProductV2.productId) &&
            Objects.equals(this.effectiveFrom, bankingProductV2.effectiveFrom) &&
            Objects.equals(this.effectiveTo, bankingProductV2.effectiveTo) &&
            Objects.equals(this.lastUpdated, bankingProductV2.lastUpdated) &&
            Objects.equals(this.productCategory, bankingProductV2.productCategory) &&
            Objects.equals(this.name, bankingProductV2.name) &&
            Objects.equals(this.description, bankingProductV2.description) &&
            Objects.equals(this.brand, bankingProductV2.brand) &&
            Objects.equals(this.brandName, bankingProductV2.brandName) &&
            Objects.equals(this.applicationUri, bankingProductV2.applicationUri) &&
            Objects.equals(this.isTailored, bankingProductV2.isTailored) &&
            Objects.equals(this.additionalInformation, bankingProductV2.additionalInformation) &&
            Objects.equals(this.cardArt, bankingProductV2.cardArt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            productId,
            effectiveFrom,
            effectiveTo,
            lastUpdated,
            productCategory,
            name,
            description,
            brand,
            brandName,
            applicationUri,
            isTailored,
            additionalInformation,
            cardArt);
    }

    @Override
    public String toString() {
        return "class BankingProductV2 {\n" +
            "   productId: " + toIndentedString(productId) + "\n" +
            "   effectiveFrom: " + toIndentedString(effectiveFrom) + "\n" +
            "   effectiveTo: " + toIndentedString(effectiveTo) + "\n" +
            "   lastUpdated: " + toIndentedString(lastUpdated) + "\n" +
            "   productCategory: " + toIndentedString(productCategory) + "\n" +
            "   name: " + toIndentedString(name) + "\n" +
            "   description: " + toIndentedString(description) + "\n" +
            "   brand: " + toIndentedString(brand) + "\n" +
            "   brandName: " + toIndentedString(brandName) + "\n" +
            "   applicationUri: " + toIndentedString(applicationUri) + "\n" +
            "   isTailored: " + toIndentedString(isTailored) + "\n" +
            "   additionalInformation: " + toIndentedString(additionalInformation) + "\n" +
            "   cardArt: " + toIndentedString(cardArt) + "\n" +
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