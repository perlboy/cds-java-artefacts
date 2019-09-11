/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
*/package au.org.consumerdatastandards.client.model;

import java.util.List;
import java.util.Objects;

/**
 * BankingProductLendingRate
 */
public class BankingProductLendingRate {

  public enum InterestPaymentDueEnum {

    IN_ADVANCE,

    IN_ARREARS
  }

  public enum LendingRateTypeEnum {

    BUNDLE_DISCOUNT_FIXED,

    BUNDLE_DISCOUNT_VARIABLE,

    CASH_ADVANCE,

    DISCOUNT,

    FIXED,

    FLOATING,

    INTRODUCTORY,

    MARKET_LINKED,

    PENALTY,

    PURCHASE,

    VARIABLE
  }

  private String additionalInfo;

  private String additionalInfoUri;

  private String additionalValue;

  private String applicationFrequency;

  private String calculationFrequency;

  private String comparisonRate;


  private InterestPaymentDueEnum interestPaymentDue;

  private LendingRateTypeEnum lendingRateType;

  private String rate;

  private List<BankingProductRateTier> tiers;

  /**
   * Display text providing more information on the rate.
   * @return additionalInfo
   */
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  /**
   * Link to a web page with more information on this rate
   * @return additionalInfoUri
   */
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  /**
   * Generic field containing additional information relevant to the [lendingRateType](#tocSproductlendingratetypedoc) specified. Whether mandatory or not is dependent on the value of [lendingRateType](#tocSproductlendingratetypedoc)
   * @return additionalValue
   */
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  /**
   * The period after which the calculated amount(s) (see calculationFrequency) are &#39;applied&#39; (i.e. debited or credited) to the account. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
   * @return applicationFrequency
   */
  public String getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(String applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  /**
   * The period after which the rate is applied to the balance to calculate the amount due for the period. Calculation of the amount is often daily (as balances may change) but accumulated until the total amount is &#39;applied&#39; to the account (see applicationFrequency). Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
   * @return calculationFrequency
   */
  public String getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(String calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  /**
   * A comparison rate equivalent for this rate
   * @return comparisonRate
   */
  public String getComparisonRate() {
    return comparisonRate;
  }

  public void setComparisonRate(String comparisonRate) {
    this.comparisonRate = comparisonRate;
  }

  /**
   * Get interestPaymentDue
   * @return interestPaymentDue
   */
  public InterestPaymentDueEnum getInterestPaymentDue() {
    return interestPaymentDue;
  }

  public void setInterestPaymentDue(InterestPaymentDueEnum interestPaymentDue) {
    this.interestPaymentDue = interestPaymentDue;
  }

  /**
   * Get lendingRateType
   * @return lendingRateType
   */
  public LendingRateTypeEnum getLendingRateType() {
    return lendingRateType;
  }

  public void setLendingRateType(LendingRateTypeEnum lendingRateType) {
    this.lendingRateType = lendingRateType;
  }

  /**
   * The rate to be applied
   * @return rate
   */
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * Rate tiers applicable for this rate
   * @return tiers
   */
  public List<BankingProductRateTier> getTiers() {
    return tiers;
  }

  public void setTiers(List<BankingProductRateTier> tiers) {
    this.tiers = tiers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductLendingRate bankingProductLendingRate = (BankingProductLendingRate) o;
    return Objects.equals(this.additionalInfo, bankingProductLendingRate.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, bankingProductLendingRate.additionalInfoUri) &&
        Objects.equals(this.additionalValue, bankingProductLendingRate.additionalValue) &&
        Objects.equals(this.applicationFrequency, bankingProductLendingRate.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, bankingProductLendingRate.calculationFrequency) &&
        Objects.equals(this.comparisonRate, bankingProductLendingRate.comparisonRate) &&
        Objects.equals(this.interestPaymentDue, bankingProductLendingRate.interestPaymentDue) &&
        Objects.equals(this.lendingRateType, bankingProductLendingRate.lendingRateType) &&
        Objects.equals(this.rate, bankingProductLendingRate.rate) &&
        Objects.equals(this.tiers, bankingProductLendingRate.tiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalInfo,
        additionalInfoUri,
        additionalValue,
        applicationFrequency,
        calculationFrequency,
        comparisonRate,
        interestPaymentDue,
        lendingRateType,
        rate,
        tiers);
  }

  @Override
  public String toString() {
    return "class BankingProductLendingRate {\n" +
        "    additionalInfo: " + toIndentedString(additionalInfo) + "\n" +
        "    additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" +
        "    additionalValue: " + toIndentedString(additionalValue) + "\n" +
        "    applicationFrequency: " + toIndentedString(applicationFrequency) + "\n" +
        "    calculationFrequency: " + toIndentedString(calculationFrequency) + "\n" +
        "    comparisonRate: " + toIndentedString(comparisonRate) + "\n" +
        "    interestPaymentDue: " + toIndentedString(interestPaymentDue) + "\n" +
        "    lendingRateType: " + toIndentedString(lendingRateType) + "\n" +
        "    rate: " + toIndentedString(rate) + "\n" +
        "    tiers: " + toIndentedString(tiers) + "\n" +
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
