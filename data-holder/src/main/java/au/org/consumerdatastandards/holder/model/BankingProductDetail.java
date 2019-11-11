package au.org.consumerdatastandards.holder.model;

import javax.persistence.*;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "BankingProduct")
public class BankingProductDetail extends BankingProduct {

    @OneToOne(cascade = CascadeType.ALL)
    private BankingProductAdditionalInformation additionalInformation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_bundles",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "bundle_id"))
    @Valid
    private List<BankingProductBundle> bundles = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_constraints",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "constraint_id"))
    @Valid
    private List<BankingProductConstraint> constraints = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_deposit_rates",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "deposit_rate_id"))
    @Valid
    private List<BankingProductDepositRate> depositRates = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_eligibility",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "eligibility_id"))
    @Valid
    private List<BankingProductEligibility> eligibility = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_features",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "feature_id"))
    @Valid
    private List<BankingProductFeature> features = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_fees",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "fee_id"))
    @Valid
    private List<BankingProductFee> fees = null;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "product_lending_rates",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "lending_rate_id"))
    @Valid
    private List<BankingProductLendingRate> lendingRates = null;

    public BankingProductDetail additionalInformation(BankingProductAdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Get additionalInformation
     *
     * @return additionalInformation
     */
    @Valid
    public BankingProductAdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(BankingProductAdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public BankingProductDetail applicationUri(String applicationUri) {
        this.applicationUri = applicationUri;
        return this;
    }

    public BankingProductDetail brand(String brand) {
        this.brand = brand;
        return this;
    }

    public BankingProductDetail brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public BankingProductDetail description(String description) {
        this.description = description;
        return this;
    }

    public BankingProductDetail effectiveFrom(OffsetDateTime effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    public BankingProductDetail effectiveTo(OffsetDateTime effectiveTo) {
        this.effectiveTo = effectiveTo;
        return this;
    }

    public BankingProductDetail isTailored(Boolean isTailored) {
        this.isTailored = isTailored;
        return this;
    }

    public BankingProductDetail lastUpdated(OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public BankingProductDetail name(String name) {
        this.name = name;
        return this;
    }

    public BankingProductDetail productCategory(BankingProductCategory productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public BankingProductDetail productId(String productId) {
        this.productId = productId;
        return this;
    }

    public BankingProductDetail bundles(List<BankingProductBundle> bundles) {
        this.bundles = bundles;
        return this;
    }

    public BankingProductDetail addBundlesItem(BankingProductBundle bundlesItem) {
        if (this.bundles == null) {
            this.bundles = new ArrayList<>();
        }
        this.bundles.add(bundlesItem);
        return this;
    }

    /**
     * An array of bundles that this product participates in.  Each bundle is described by free form information but also by a list of product IDs of the other products that are included in the bundle.  It is assumed that the current product is included in the bundle also
     *
     * @return bundles
     */
    @Valid
    public List<BankingProductBundle> getBundles() {
        return bundles;
    }

    public void setBundles(List<BankingProductBundle> bundles) {
        this.bundles = bundles;
    }

    public BankingProductDetail constraints(List<BankingProductConstraint> constraints) {
        this.constraints = constraints;
        return this;
    }

    public BankingProductDetail addConstraintsItem(BankingProductConstraint constraintsItem) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<>();
        }
        this.constraints.add(constraintsItem);
        return this;
    }

    /**
     * Constraints on the application for or operation of the product such as minimum balances or limit thresholds
     *
     * @return constraints
     */
    @Valid
    public List<BankingProductConstraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<BankingProductConstraint> constraints) {
        this.constraints = constraints;
    }

    public BankingProductDetail depositRates(List<BankingProductDepositRate> depositRates) {
        this.depositRates = depositRates;
        return this;
    }

    public BankingProductDetail addDepositRatesItem(BankingProductDepositRate depositRatesItem) {
        if (this.depositRates == null) {
            this.depositRates = new ArrayList<>();
        }
        this.depositRates.add(depositRatesItem);
        return this;
    }

    /**
     * Interest rates available for deposits
     *
     * @return depositRates
     */
    @Valid
    public List<BankingProductDepositRate> getDepositRates() {
        return depositRates;
    }

    public void setDepositRates(List<BankingProductDepositRate> depositRates) {
        this.depositRates = depositRates;
    }

    public BankingProductDetail eligibility(List<BankingProductEligibility> eligibility) {
        this.eligibility = eligibility;
        return this;
    }

    public BankingProductDetail addEligibilityItem(BankingProductEligibility eligibilityItem) {
        if (this.eligibility == null) {
            this.eligibility = new ArrayList<>();
        }
        this.eligibility.add(eligibilityItem);
        return this;
    }

    /**
     * Eligibility criteria for the product
     *
     * @return eligibility
     */
    @Valid
    public List<BankingProductEligibility> getEligibility() {
        return eligibility;
    }

    public void setEligibility(List<BankingProductEligibility> eligibility) {
        this.eligibility = eligibility;
    }

    public BankingProductDetail features(List<BankingProductFeature> features) {
        this.features = features;
        return this;
    }

    public BankingProductDetail addFeaturesItem(BankingProductFeature featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    /**
     * Array of features available for the product
     *
     * @return features
     */
    @Valid
    public List<BankingProductFeature> getFeatures() {
        return features;
    }

    public void setFeatures(List<BankingProductFeature> features) {
        this.features = features;
    }

    public BankingProductDetail fees(List<BankingProductFee> fees) {
        this.fees = fees;
        return this;
    }

    public BankingProductDetail addFeesItem(BankingProductFee feesItem) {
        if (this.fees == null) {
            this.fees = new ArrayList<>();
        }
        this.fees.add(feesItem);
        return this;
    }

    /**
     * Fees applicable for the product
     *
     * @return fees
     */
    @Valid
    public List<BankingProductFee> getFees() {
        return fees;
    }

    public void setFees(List<BankingProductFee> fees) {
        this.fees = fees;
    }

    public BankingProductDetail lendingRates(List<BankingProductLendingRate> lendingRates) {
        this.lendingRates = lendingRates;
        return this;
    }

    public BankingProductDetail addLendingRatesItem(BankingProductLendingRate lendingRatesItem) {
        if (this.lendingRates == null) {
            this.lendingRates = new ArrayList<>();
        }
        this.lendingRates.add(lendingRatesItem);
        return this;
    }

    /**
     * Interest rates charged against lending balances
     *
     * @return lendingRates
     */
    @Valid
    public List<BankingProductLendingRate> getLendingRates() {
        return lendingRates;
    }

    public void setLendingRates(List<BankingProductLendingRate> lendingRates) {
        this.lendingRates = lendingRates;
    }

    @Override
    public String toString() {
        return "BankingProductDetail{" +
            "productId='" + productId + '\'' +
            ", additionalInformation=" + additionalInformation +
            ", applicationUri='" + applicationUri + '\'' +
            ", brand='" + brand + '\'' +
            ", brandName='" + brandName + '\'' +
            ", description='" + description + '\'' +
            ", effectiveFrom=" + effectiveFrom +
            ", effectiveTo=" + effectiveTo +
            ", isTailored=" + isTailored +
            ", lastUpdated=" + lastUpdated +
            ", name='" + name + '\'' +
            ", productCategory=" + productCategory +
            ", bundles=" + bundles +
            ", constraints=" + constraints +
            ", depositRates=" + depositRates +
            ", eligibility=" + eligibility +
            ", features=" + features +
            ", fees=" + fees +
            ", lendingRates=" + lendingRates +
            '}';
    }
}

