/*
 * Consumer Data Standards
 * Sample Data Holder to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the cds-codegen package
 * https://github.com/ConsumerDataStandardsAustralia/cds-codegen
 * Do not edit the class manually.
 */
package au.org.consumerdatastandards.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/** BankingProductFee */
public class BankingProductFee {
  // Name of the fee
  @SerializedName("name")
  private String name;
  // The type of fee
  @SerializedName("feeType")
  private FeeType feeType;
  // The amount charged for the fee. One of amount, balanceRate,
  // transactionRate and accruedRate is mandatory
  @SerializedName("amount")
  private BigDecimal amount;
  // A fee rate calculated based on a proportion of the balance.
  // One of amount, balanceRate, transactionRate and accruedRate
  // is mandatory
  @SerializedName("balanceRate")
  private BigDecimal balanceRate;
  // A fee rate calculated based on a proportion of a
  // transaction. One of amount, balanceRate, transactionRate and
  // accruedRate is mandatory
  @SerializedName("transactionRate")
  private BigDecimal transactionRate;
  // A fee rate calculated based on a proportion of the
  // calculated interest accrued on the account. One of amount,
  // balanceRate, transactionRate and accruedRate is mandatory
  @SerializedName("accruedRate")
  private BigDecimal accruedRate;
  // The indicative frequency with which the fee is calculated on
  // the account. Only applies if balanceRate or accruedRate is
  // also present. Formatted according to [ISO 8601
  // Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
  @SerializedName("accrualFrequency")
  private String accrualFrequency;
  // The currency the fee will be charged in. Assumes AUD if
  // absent
  @SerializedName("currency")
  private String currency;
  // Generic field containing additional information relevant to
  // the feeType specified. Whether mandatory or not is dependent
  // on the value of feeType
  @SerializedName("additionalValue")
  private String additionalValue;
  // Display text providing more information on the fee
  @SerializedName("additionalInfo")
  private String additionalInfo;
  // Link to a web page with more information on this fee
  @SerializedName("additionalInfoUri")
  private String additionalInfoUri;
  // An optional list of discounts to this fee that may be
  // available
  @SerializedName("discounts")
  private List<BankingProductDiscount> discounts;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductFee name(String name) {
    this.name = name;
    return this;
  }

  public FeeType getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeType feeType) {
    this.feeType = feeType;
  }

  public BankingProductFee feeType(FeeType feeType) {
    this.feeType = feeType;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BankingProductFee amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public BigDecimal getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(BigDecimal balanceRate) {
    this.balanceRate = balanceRate;
  }

  public BankingProductFee balanceRate(BigDecimal balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

  public BigDecimal getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(BigDecimal transactionRate) {
    this.transactionRate = transactionRate;
  }

  public BankingProductFee transactionRate(BigDecimal transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

  public BigDecimal getAccruedRate() {
    return accruedRate;
  }

  public void setAccruedRate(BigDecimal accruedRate) {
    this.accruedRate = accruedRate;
  }

  public BankingProductFee accruedRate(BigDecimal accruedRate) {
    this.accruedRate = accruedRate;
    return this;
  }

  public String getAccrualFrequency() {
    return accrualFrequency;
  }

  public void setAccrualFrequency(String accrualFrequency) {
    this.accrualFrequency = accrualFrequency;
  }

  public BankingProductFee accrualFrequency(String accrualFrequency) {
    this.accrualFrequency = accrualFrequency;
    return this;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BankingProductFee currency(String currency) {
    this.currency = currency;
    return this;
  }

  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public BankingProductFee additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductFee additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductFee additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  public List<BankingProductDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<BankingProductDiscount> discounts) {
    this.discounts = discounts;
  }

  public BankingProductFee discounts(List<BankingProductDiscount> discounts) {
    this.discounts = discounts;
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

    BankingProductFee inputModel = (BankingProductFee) o;
    if (!(name.equals(inputModel.getName()))) {
      return false;
    }
    if (!(feeType.equals(inputModel.getFeeType()))) {
      return false;
    }
    if (!(amount.equals(inputModel.getAmount()))) {
      return false;
    }
    if (!(balanceRate.equals(inputModel.getBalanceRate()))) {
      return false;
    }
    if (!(transactionRate.equals(inputModel.getTransactionRate()))) {
      return false;
    }
    if (!(accruedRate.equals(inputModel.getAccruedRate()))) {
      return false;
    }
    if (!(accrualFrequency.equals(inputModel.getAccrualFrequency()))) {
      return false;
    }
    if (!(currency.equals(inputModel.getCurrency()))) {
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
    if (!(discounts.equals(inputModel.getDiscounts()))) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        discounts, discounts, discounts, discounts, discounts, discounts, discounts, discounts,
        discounts, discounts, discounts, discounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("class %s {\n", getClass()));
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceRate: ").append(toIndentedString(balanceRate)).append("\n");
    sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
    sb.append("    accruedRate: ").append(toIndentedString(accruedRate)).append("\n");
    sb.append("    accrualFrequency: ").append(toIndentedString(accrualFrequency)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /** FeeType */
  @JsonAdapter(FeeType.Adapter.class)
  public enum FeeType {
    PERIODIC("PERIODIC"),
    TRANSACTION("TRANSACTION"),
    WITHDRAWAL("WITHDRAWAL"),
    DEPOSIT("DEPOSIT"),
    PAYMENT("PAYMENT"),
    PURCHASE("PURCHASE"),
    EVENT("EVENT"),
    UPFRONT("UPFRONT"),
    EXIT("EXIT");

    private String value;

    FeeType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public String getValue() {
      return value;
    }

    public static FeeType fromValue(String value) {
      for (FeeType b : FeeType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeType> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeType enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeType read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeeType.fromValue(value);
      }
    }
  }
}
