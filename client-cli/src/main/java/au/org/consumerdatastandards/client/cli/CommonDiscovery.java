/*
 * Consumer Data Standards
 * Sample CLI tool to Demonstrate the Consumer Data Right APIs
 *
 * NOTE: This class is auto generated by the codegen artefact
 * https://github.com/ConsumerDataStandardsAustralia/java-artefacts/codegen
 */
package au.org.consumerdatastandards.client.cli;

import au.org.consumerdatastandards.client.api.CommonDiscoveryAPI;
import au.org.consumerdatastandards.client.cli.support.ApiUtil;
import au.org.consumerdatastandards.client.cli.support.JsonPrinter;
import au.org.consumerdatastandards.client.model.CommonDiscoveryStatus;
import au.org.consumerdatastandards.client.model.ResponseDiscoveryOutagesList;
import au.org.consumerdatastandards.conformance.ConformanceError;
import au.org.consumerdatastandards.conformance.PayloadValidator;
import au.org.consumerdatastandards.support.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
@ShellCommandGroup("CommonDiscovery")
public class CommonDiscovery extends ApiCliBase {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonDiscovery.class);

    private PayloadValidator payloadValidator = new PayloadValidator();
    private final CommonDiscoveryAPI api = new CommonDiscoveryAPI();

    @ShellMethod("Get outages")
    public String getOutages(@ShellOption(defaultValue = ShellOption.NULL) Boolean check) throws Exception {

        LOGGER.info("Get outages CLI initiated");

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        ResponseDiscoveryOutagesList response = api.getOutages();
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getOutagesCall(null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getOutages", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }

    @ShellMethod("Get status")
    public String getStatus(@ShellOption(defaultValue = ShellOption.NULL) Boolean check) throws Exception {

        LOGGER.info("Get status CLI initiated");

        api.setApiClient(ApiUtil.createApiClient(apiClientOptions));
        CommonDiscoveryStatus response = api.getStatus();
        if (apiClientOptions.isValidationEnabled() || (check != null && check)) {
            LOGGER.info("Payload validation is enabled");
            okhttp3.Call call = api.getStatusCall(null);
            List<ConformanceError> conformanceErrors = payloadValidator
                .validateResponse(call.request().url().toString(), response, "getStatus", ResponseCode.OK);
            if (!conformanceErrors.isEmpty()) {
                throwConformanceErrors(conformanceErrors);
            }
        }
        return JsonPrinter.toJson(response);
    }
}
