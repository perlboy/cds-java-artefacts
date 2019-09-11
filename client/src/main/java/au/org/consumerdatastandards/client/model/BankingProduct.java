/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public class BankingProduct {

  private BankingProductAdditionalInformation additionalInformation = null;

  private String applicationUri;

  private String brand;

  private String brandName;

  private String description;

  private OffsetDateTime effectiveFrom;

  private OffsetDateTime effectiveTo;

  private Boolean isTailored;

  private OffsetDateTime lastUpdated;

  private String name;

  private BankingProductCategory productCategory;

  private String productId;

  /**
   * Get additionalInformation
   * @return additionalInformation
   */
  public BankingProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(BankingProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   * A link to an application web page where this product can be applied for.
   * @return applicationUri
   */
  public String getApplicationUri() {
    return applicationUri;
  }

  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   * @return brand
   */
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * An optional display name of the brand
   * @return brandName
   */
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  /**
   * A description of the product
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   * @return effectiveFrom
   */
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   * @return effectiveTo
   */
  public OffsetDateTime getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(OffsetDateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   * @return isTailored
   */
  public Boolean getIsTailored() {
    return isTailored;
  }

  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   * @return lastUpdated
   */
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * The display name of the product
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get productCategory
   * @return productCategory
   */
  public BankingProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(BankingProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   * @return productId
   */
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProduct bankingProduct = (BankingProduct) o;
    return Objects.equals(this.additionalInformation, bankingProduct.additionalInformation) &&
        Objects.equals(this.applicationUri, bankingProduct.applicationUri) &&
        Objects.equals(this.brand, bankingProduct.brand) &&
        Objects.equals(this.brandName, bankingProduct.brandName) &&
        Objects.equals(this.description, bankingProduct.description) &&
        Objects.equals(this.effectiveFrom, bankingProduct.effectiveFrom) &&
        Objects.equals(this.effectiveTo, bankingProduct.effectiveTo) &&
        Objects.equals(this.isTailored, bankingProduct.isTailored) &&
        Objects.equals(this.lastUpdated, bankingProduct.lastUpdated) &&
        Objects.equals(this.name, bankingProduct.name) &&
        Objects.equals(this.productCategory, bankingProduct.productCategory) &&
        Objects.equals(this.productId, bankingProduct.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalInformation,
        applicationUri,
        brand,
        brandName,
        description,
        effectiveFrom,
        effectiveTo,
        isTailored,
        lastUpdated,
        name,
        productCategory,
        productId);
  }


  @Override
  public String toString() {
    return "class BankingProduct {\n" +
        "    additionalInformation: " + toIndentedString(additionalInformation) + "\n" +
        "    applicationUri: " + toIndentedString(applicationUri) + "\n" +
        "    brand: " + toIndentedString(brand) + "\n" +
        "    brandName: " + toIndentedString(brandName) + "\n" +
        "    description: " + toIndentedString(description) + "\n" +
        "    effectiveFrom: " + toIndentedString(effectiveFrom) + "\n" +
        "    effectiveTo: " + toIndentedString(effectiveTo) + "\n" +
        "    isTailored: " + toIndentedString(isTailored) + "\n" +
        "    lastUpdated: " + toIndentedString(lastUpdated) + "\n" +
        "    name: " + toIndentedString(name) + "\n" +
        "    productCategory: " + toIndentedString(productCategory) + "\n" +
        "    productId: " + toIndentedString(productId) + "\n" +
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
