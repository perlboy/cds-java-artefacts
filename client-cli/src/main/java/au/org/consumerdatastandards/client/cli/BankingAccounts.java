/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.client.api.BankingAccountsAPI;
import au.org.consumerdatastandards.client.cli.support.ApiUtil;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.ParamAccountOpenStatus;
import au.org.consumerdatastandards.client.model.ParamProductCategory;
import au.org.consumerdatastandards.client.model.RequestAccountIds;
import au.org.consumerdatastandards.client.model.RequestAccountIdsData;
import au.org.consumerdatastandards.client.model.ResponseBankingAccountById;
import au.org.consumerdatastandards.client.model.ResponseBankingAccountList;
import au.org.consumerdatastandards.client.model.ResponseBankingAccountsBalanceById;
import au.org.consumerdatastandards.client.model.ResponseBankingAccountsBalanceList;
import au.org.consumerdatastandards.client.model.ResponseBankingTransactionById;
import au.org.consumerdatastandards.client.model.ResponseBankingTransactionList;
import au.org.consumerdatastandards.conformance.ConformanceError;
import au.org.consumerdatastandards.conformance.PayloadValidator;
import au.org.consumerdatastandards.support.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.time.OffsetDateTime;
import java.util.List;

@ShellComponent
@ShellCommandGroup("BankingAccounts")
public class BankingAccounts extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingAccounts.class);

    private PayloadValidator payloadValidator = new PayloadValidator();
    private final BankingAccountsAPI api = new BankingAccountsAPI();

    @ShellMethod("Get account detail")
    public String getAccountDetail(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId) throws Exception {

        LOGGER.info("Get account detail CLI initiated with accountId: {}",
            accountId);

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingAccountById response = api.getAccountDetail(accountId);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getAccountDetailCall(accountId, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getAccountDetail", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get transaction detail")
    public String getTransactionDetail(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = ShellOption.NULL) String transactionId) throws Exception {

        LOGGER.info("Get transaction detail CLI initiated with accountId: {}, transactionId: {}",
            accountId,
            transactionId);

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingTransactionById response = api.getTransactionDetail(accountId, transactionId);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getTransactionDetailCall(accountId, transactionId, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getTransactionDetail", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get transactions")
    public String getTransactions(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId,
        @ShellOption(defaultValue = ShellOption.NULL) String maxAmount,
        @ShellOption(defaultValue = ShellOption.NULL) String minAmount,
        @ShellOption(defaultValue = ShellOption.NULL) OffsetDateTime newestTime,
        @ShellOption(defaultValue = ShellOption.NULL) OffsetDateTime oldestTime,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) String text) throws Exception {

        LOGGER.info("Get transactions CLI initiated with accountId: {}, max-amount: {}, min-amount: {}, newest-time: {}, oldest-time: {}, page: {}, page-size: {}, text: {}",
            accountId,
            maxAmount,
            minAmount,
            newestTime,
            oldestTime,
            page,
            pageSize,
            text);


        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingTransactionList response = api.getTransactions(accountId, maxAmount, minAmount, newestTime, oldestTime, page, pageSize, text);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getTransactionsCall(accountId, maxAmount, minAmount, newestTime, oldestTime, page, pageSize, text, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getTransactions", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List accounts")
    public String listAccounts(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) Boolean isOwned,
        @ShellOption(defaultValue = ShellOption.NULL) ParamAccountOpenStatus openStatus,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) ParamProductCategory productCategory) throws Exception {

        LOGGER.info("List accounts CLI initiated with is-owned: {}, open-status: {}, page: {}, page-size: {}, product-category: {}",
            isOwned,
            openStatus,
            page,
            pageSize,
            productCategory);


        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingAccountList response = api.listAccounts(isOwned, openStatus, page, pageSize, productCategory);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listAccountsCall(isOwned, openStatus, page, pageSize, productCategory, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "listAccounts", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List balance")
    public String listBalance(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String accountId) throws Exception {

        LOGGER.info("List balance CLI initiated with accountId: {}",
            accountId);

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingAccountsBalanceById response = api.listBalance(accountId);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listBalanceCall(accountId, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "listBalance", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Obtain balances for multiple, filtered accounts")
    public String listBalancesBulk(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
                                   @ShellOption(defaultValue = ShellOption.NULL) Boolean isOwned,
                                   @ShellOption(defaultValue = ShellOption.NULL) ParamAccountOpenStatus openStatus,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer page,
                                   @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
                                   @ShellOption(defaultValue = ShellOption.NULL) ParamProductCategory productCategory) throws Exception {
        LOGGER.info("List balances bulk CLI initiated with is-owned: {}, open-status: {}, page: {}, page-size: {}, product-category: {}",
            isOwned,
            openStatus,
            page,
            pageSize,
            productCategory);

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseBankingAccountsBalanceList response =
            api.listBalancesBulk(isOwned, openStatus, page, pageSize, productCategory);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listBalancesBulkCall(isOwned, openStatus, page, pageSize, productCategory, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "listBalancesBulk", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List balances specific accounts")
    public String listBalancesSpecificAccounts(@ShellOption(defaultValue = ShellOption.NULL) Boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) List<String> accountIds,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize) throws Exception {

        LOGGER.info("List balances specific accounts CLI initiated with accountIds: {}, page: {}, page-size: {}",
            accountIds,
            page,
            pageSize);

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        RequestAccountIdsData data = new RequestAccountIdsData();
        data.setAccountIds(accountIds);
        RequestAccountIds requestAccountIds = new RequestAccountIds();
        requestAccountIds.setData(data);
        ResponseBankingAccountsBalanceList response = api.listBalancesSpecificAccounts(requestAccountIds, page, pageSize);
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listBalancesSpecificAccountsCall(requestAccountIds, page, pageSize, null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "listBalancesSpecificAccounts", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
