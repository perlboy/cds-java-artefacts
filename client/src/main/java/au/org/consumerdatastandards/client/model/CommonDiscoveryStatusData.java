/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.time.OffsetDateTime;
import java.util.Objects;

public class CommonDiscoveryStatusData {

    public enum Status {
        OK,
        PARTIAL_FAILURE,
        SCHEDULED_OUTAGE,
        UNAVAILABLE
    }

    private OffsetDateTime detectionTime;

    private OffsetDateTime expectedResolutionTime;

    private String explanation;

    private Status status;

    private OffsetDateTime updateTime;

    /**
     * The date and time that the current outage was detected. Should only be present if the status property is PARTIAL_FAILURE or UNAVAILABLE
     * @return detectionTime
     */
    public OffsetDateTime getDetectionTime() {
        return detectionTime;
    }

    public void setDetectionTime(OffsetDateTime detectionTime) {
        this.detectionTime = detectionTime;
    }

    /**
     * The date and time that full service is expected to resume (if known). Should not be present if the status property has a value of OK.
     * @return expectedResolutionTime
     */
    public OffsetDateTime getExpectedResolutionTime() {
        return expectedResolutionTime;
    }

    public void setExpectedResolutionTime(OffsetDateTime expectedResolutionTime) {
        this.expectedResolutionTime = expectedResolutionTime;
    }

    /**
     * Provides an explanation of the current outage that can be displayed to an end customer. Mandatory if the status property is any value other than OK
     * @return explanation
     */
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The date and time that this status was last updated by the Data Holder.
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonDiscoveryStatusData commonDiscoveryStatusData = (CommonDiscoveryStatusData) o;
        return Objects.equals(this.detectionTime, commonDiscoveryStatusData.detectionTime) &&
            Objects.equals(this.expectedResolutionTime, commonDiscoveryStatusData.expectedResolutionTime) &&
            Objects.equals(this.explanation, commonDiscoveryStatusData.explanation) &&
            Objects.equals(this.status, commonDiscoveryStatusData.status) &&
            Objects.equals(this.updateTime, commonDiscoveryStatusData.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            detectionTime,
            expectedResolutionTime,
            explanation,
            status,
            updateTime);
    }

    @Override
    public String toString() {
        return "class CommonDiscoveryStatusData {\n" +
            "   detectionTime: " + toIndentedString(detectionTime) + "\n" + 
            "   expectedResolutionTime: " + toIndentedString(expectedResolutionTime) + "\n" + 
            "   explanation: " + toIndentedString(explanation) + "\n" + 
            "   status: " + toIndentedString(status) + "\n" + 
            "   updateTime: " + toIndentedString(updateTime) + "\n" + 
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
