/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.client.ApiResponse;
import au.org.consumerdatastandards.client.ConformanceError;
import au.org.consumerdatastandards.client.api.BankingPayeesAPI;
import au.org.consumerdatastandards.client.api.BankingPayeesAPI.ParamType;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.ResponseBankingPayeeById;
import au.org.consumerdatastandards.client.model.ResponseBankingPayeeList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
@ShellCommandGroup("BankingPayees")
public class BankingPayees extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(BankingPayees.class);

    private final BankingPayeesAPI api = new BankingPayeesAPI();

    @ShellMethod("Get payee detail")
    public String getPayeeDetail(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) String payeeId) throws Exception {

        LOGGER.info("Get payee detail CLI initiated with payeeId: {}",
            payeeId);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingPayeeById> response = api.getPayeeDetailWithHttpInfo(payeeId);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getPayeeDetailCall(payeeId, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("List payees")
    public String listPayees(@ShellOption(defaultValue = "false") boolean check,
        @ShellOption(defaultValue = ShellOption.NULL) Integer page,
        @ShellOption(defaultValue = ShellOption.NULL) Integer pageSize,
        @ShellOption(defaultValue = ShellOption.NULL) ParamType type) throws Exception {

        LOGGER.info("List payees CLI initiated with page: {}, page-size: {}, type: {}",
            page,
            pageSize,
            type);

        api.setApiClient(clientFactory.create(true, check));
        ApiResponse<ResponseBankingPayeeList> response = api.listPayeesWithHttpInfo(type, page, pageSize);
        if (clientFactory.isValidationEnabled() || check) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.listPayeesCall(type, page, pageSize, null);
            String requestUrl = call.request().url().toString();
            List<ConformanceError> conformanceErrors = validateMetadata(requestUrl, response);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
