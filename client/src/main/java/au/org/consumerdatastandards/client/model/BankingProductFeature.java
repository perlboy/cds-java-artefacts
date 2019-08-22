/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** BankingProductFeature */
public class BankingProductFeature {
  // The type of feature described
  @SerializedName("featureType")
  private FeatureType featureType;
  // Generic field containing additional information relevant to
  // the featureType specified. Whether mandatory or not is
  // dependent on the value of featureType
  @SerializedName("additionalValue")
  private String additionalValue;
  // Display text providing more information on the feature.
  // Mandatory if the feature type is set to OTHER
  @SerializedName("additionalInfo")
  private String additionalInfo;
  // Link to a web page with more information on this feature
  @SerializedName("additionalInfoUri")
  private String additionalInfoUri;

  @ApiModelProperty(value = "The type of feature described", required = true)
  public FeatureType getFeatureType() {
    return featureType;
  }

  public void setFeatureType(FeatureType featureType) {
    this.featureType = featureType;
  }

  public BankingProductFeature featureType(FeatureType featureType) {
    this.featureType = featureType;
    return this;
  }

  @ApiModelProperty(
      value =
          "Generic field containing additional information relevant to the featureType specified. Whether mandatory or not is dependent on the value of featureType",
      required = false)
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public BankingProductFeature additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  @ApiModelProperty(
      value =
          "Display text providing more information on the feature. Mandatory if the feature type is set to OTHER",
      required = false)
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductFeature additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  @ApiModelProperty(
      value = "Link to a web page with more information on this feature",
      required = false)
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductFeature additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BankingProductFeature inputModel = (BankingProductFeature) o;
    if (!(featureType.equals(inputModel.getFeatureType()))) {
      return false;
    }
    if (!(additionalValue.equals(inputModel.getAdditionalValue()))) {
      return false;
    }
    if (!(additionalInfo.equals(inputModel.getAdditionalInfo()))) {
      return false;
    }
    if (!(additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfoUri, additionalInfoUri, additionalInfoUri, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    featureType: ").append(toIndentedString(featureType)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /** FeatureType */
  @JsonAdapter(FeatureType.Adapter.class)
  public enum FeatureType {
    CARD_ACCESS("CARD_ACCESS"),
    ADDITIONAL_CARDS("ADDITIONAL_CARDS"),
    UNLIMITED_TXNS("UNLIMITED_TXNS"),
    FREE_TXNS("FREE_TXNS"),
    FREE_TXNS_ALLOWANCE("FREE_TXNS_ALLOWANCE"),
    LOYALTY_PROGRAM("LOYALTY_PROGRAM"),
    OFFSET("OFFSET"),
    OVERDRAFT("OVERDRAFT"),
    REDRAW("REDRAW"),
    INSURANCE("INSURANCE"),
    BALANCE_TRANSFERS("BALANCE_TRANSFERS"),
    INTEREST_FREE("INTEREST_FREE"),
    INTEREST_FREE_TRANSFERS("INTEREST_FREE_TRANSFERS"),
    DIGITAL_WALLET("DIGITAL_WALLET"),
    DIGITAL_BANKING("DIGITAL_BANKING"),
    NPP_PAYID("NPP_PAYID"),
    NPP_ENABLED("NPP_ENABLED"),
    DONATE_INTEREST("DONATE_INTEREST"),
    BILL_PAYMENT("BILL_PAYMENT"),
    COMPLEMENTARY_PRODUCT_DISCOUNTS("COMPLEMENTARY_PRODUCT_DISCOUNTS"),
    BONUS_REWARDS("BONUS_REWARDS"),
    NOTIFICATIONS("NOTIFICATIONS"),
    OTHER("OTHER");

    private String value;

    FeatureType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public String getValue() {
      return value;
    }

    public static FeatureType fromValue(String value) {
      for (FeatureType b : FeatureType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeatureType> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeatureType enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeatureType read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeatureType.fromValue(value);
      }
    }
  }
}