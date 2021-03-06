/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.model;

import java.time.LocalDate;
import java.util.Objects;

public class BankingAccount {

    public enum OpenStatus {
        CLOSED,
        OPEN
    }

    private String accountId;

    private LocalDate creationDate;

    private String displayName;

    private Boolean isOwned = true;

    private String maskedNumber;

    private String nickname;

    private OpenStatus openStatus;

    private BankingProductCategory productCategory;

    private String productName;

    /**
     * A unique ID of the account adhering to the standards for ID permanence
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Date that the account was created (if known)
     * @return creationDate
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * The display name of the account as defined by the bank. This should not incorporate account numbers or PANs. If it does the values should be masked according to the rules of the MaskedAccountString common type.
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Flag indicating that the customer associated with the authorisation is an owner of the account. Does not indicate sole ownership, however. If not present then &#39;true&#39; is assumed
     * @return isOwned
     */
    public Boolean getIsOwned() {
        return isOwned;
    }

    public void setIsOwned(Boolean isOwned) {
        this.isOwned = isOwned;
    }

    /**
     * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number
     * @return maskedNumber
     */
    public String getMaskedNumber() {
        return maskedNumber;
    }

    public void setMaskedNumber(String maskedNumber) {
        this.maskedNumber = maskedNumber;
    }

    /**
     * A customer supplied nick name for the account
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Get openStatus
     * @return openStatus
     */
    public OpenStatus getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(OpenStatus openStatus) {
        this.openStatus = openStatus;
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
     * The unique identifier of the account as defined by the account holder (akin to model number for the account)
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankingAccount bankingAccount = (BankingAccount) o;
        return Objects.equals(this.accountId, bankingAccount.accountId) &&
            Objects.equals(this.creationDate, bankingAccount.creationDate) &&
            Objects.equals(this.displayName, bankingAccount.displayName) &&
            Objects.equals(this.isOwned, bankingAccount.isOwned) &&
            Objects.equals(this.maskedNumber, bankingAccount.maskedNumber) &&
            Objects.equals(this.nickname, bankingAccount.nickname) &&
            Objects.equals(this.openStatus, bankingAccount.openStatus) &&
            Objects.equals(this.productCategory, bankingAccount.productCategory) &&
            Objects.equals(this.productName, bankingAccount.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountId,
            creationDate,
            displayName,
            isOwned,
            maskedNumber,
            nickname,
            openStatus,
            productCategory,
            productName);
    }

    @Override
    public String toString() {
        return "class BankingAccount {\n" +
            "   accountId: " + toIndentedString(accountId) + "\n" + 
            "   creationDate: " + toIndentedString(creationDate) + "\n" + 
            "   displayName: " + toIndentedString(displayName) + "\n" + 
            "   isOwned: " + toIndentedString(isOwned) + "\n" + 
            "   maskedNumber: " + toIndentedString(maskedNumber) + "\n" + 
            "   nickname: " + toIndentedString(nickname) + "\n" + 
            "   openStatus: " + toIndentedString(openStatus) + "\n" + 
            "   productCategory: " + toIndentedString(productCategory) + "\n" + 
            "   productName: " + toIndentedString(productName) + "\n" + 
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
