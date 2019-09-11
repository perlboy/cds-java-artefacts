/*
 * Consumer Data Standards
 * Sample client library to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
*/
package au.org.consumerdatastandards.client.model;

/**
 * Used to filter results on the productCategory field applicable to accounts. Any one of the
 * valid values for this field can be supplied. If absent then all accounts returned.
 */
public enum ParamProductCategory {

  TRANS_AND_SAVINGS_ACCOUNTS,

  TERM_DEPOSITS,

  TRAVEL_CARDS,

  REGULATED_TRUST_ACCOUNTS,

  RESIDENTIAL_MORTGAGES,

  CRED_AND_CHRG_CARDS,

  PERS_LOANS,

  MARGIN_LOANS,

  LEASES,

  TRADE_FINANCE,

  OVERDRAFTS,

  BUSINESS_LOANS
}
