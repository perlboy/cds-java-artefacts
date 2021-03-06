/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.util.Objects;

public class BankingProductEligibility {

    public enum EligibilityType {
        BUSINESS,
        EMPLOYMENT_STATUS,
        MAX_AGE,
        MIN_AGE,
        MIN_INCOME,
        MIN_TURNOVER,
        NATURAL_PERSON,
        OTHER,
        PENSION_RECIPIENT,
        RESIDENCY_STATUS,
        STAFF,
        STUDENT
    }

    private String additionalInfo;

    private String additionalInfoUri;

    private String additionalValue;

    private EligibilityType eligibilityType;

    /**
     * Display text providing more information on the eligibility criteria. Mandatory if the [eligibilityType](#tocSproducteligibilitytypedoc) field is set to OTHER
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * Link to a web page with more information on this eligibility criteria
     * @return additionalInfoUri
     */
    public String getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(String additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }

    /**
     * Generic field containing additional information relevant to the [eligibilityType](#tocSproducteligibilitytypedoc) specified.  Whether mandatory or not is dependent on the value of [eligibilityType](#tocSproducteligibilitytypedoc)
     * @return additionalValue
     */
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }

    /**
     * Get eligibilityType
     * @return eligibilityType
     */
    public EligibilityType getEligibilityType() {
        return eligibilityType;
    }

    public void setEligibilityType(EligibilityType eligibilityType) {
        this.eligibilityType = eligibilityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingProductEligibility bankingProductEligibility = (BankingProductEligibility) o;
        return Objects.equals(this.additionalInfo, bankingProductEligibility.additionalInfo) &&
            Objects.equals(this.additionalInfoUri, bankingProductEligibility.additionalInfoUri) &&
            Objects.equals(this.additionalValue, bankingProductEligibility.additionalValue) &&
            Objects.equals(this.eligibilityType, bankingProductEligibility.eligibilityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additionalInfo,
            additionalInfoUri,
            additionalValue,
            eligibilityType);
    }

    @Override
    public String toString() {
        return "class BankingProductEligibility {\n" +
            "   additionalInfo: " + toIndentedString(additionalInfo) + "\n" + 
            "   additionalInfoUri: " + toIndentedString(additionalInfoUri) + "\n" + 
            "   additionalValue: " + toIndentedString(additionalValue) + "\n" + 
            "   eligibilityType: " + toIndentedString(eligibilityType) + "\n" + 
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
