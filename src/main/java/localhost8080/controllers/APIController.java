/*
 * WaitlistAPIContractsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost8080.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import localhost8080.ApiHelper;
import localhost8080.AuthManager;
import localhost8080.Configuration;
import localhost8080.exceptions.ApiException;
import localhost8080.http.Headers;
import localhost8080.http.client.HttpCallback;
import localhost8080.http.client.HttpClient;
import localhost8080.http.client.HttpContext;
import localhost8080.http.request.HttpRequest;
import localhost8080.http.response.HttpResponse;
import localhost8080.http.response.HttpStringResponse;
import localhost8080.models.ApproveRequest;
import localhost8080.models.FeatureRequest;
import localhost8080.models.PromoteRequest;
import localhost8080.models.WaitlistRequest;
import localhost8080.models.WaitlistResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class APIController extends BaseController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public APIController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public APIController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * Add User to waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse add(
            final WaitlistRequest body) throws ApiException, IOException {
        HttpRequest request = buildAddRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleAddResponse(context);
    }

    /**
     * Add User to waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> addAsync(
            final WaitlistRequest body) {
        return makeHttpCallAsync(() -> buildAddRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleAddResponse(context));
    }

    /**
     * Builds the HttpRequest object for add.
     */
    private HttpRequest buildAddRequest(
            final WaitlistRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/add");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for add.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleAddResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

    /**
     * Check status of the waitlist for the user.
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse check() throws ApiException, IOException {
        HttpRequest request = buildCheckRequest();
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCheckResponse(context);
    }

    /**
     * Check status of the waitlist for the user.
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> checkAsync() {
        return makeHttpCallAsync(() -> buildCheckRequest(),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCheckResponse(context));
    }

    /**
     * Builds the HttpRequest object for check.
     */
    private HttpRequest buildCheckRequest() {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/check");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for check.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleCheckResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

    /**
     * Promote user in the waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse check1(
            final PromoteRequest body) throws ApiException, IOException {
        HttpRequest request = buildCheck1Request(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCheck1Response(context);
    }

    /**
     * Promote user in the waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> check1Async(
            final PromoteRequest body) {
        return makeHttpCallAsync(() -> buildCheck1Request(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleCheck1Response(context));
    }

    /**
     * Builds the HttpRequest object for check1.
     */
    private HttpRequest buildCheck1Request(
            final PromoteRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/promote");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for check1.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleCheck1Response(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

    /**
     * Approve list of users.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse list(
            final List<WaitlistRequest> body) throws ApiException, IOException {
        HttpRequest request = buildListRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleListResponse(context);
    }

    /**
     * Approve list of users.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> listAsync(
            final List<WaitlistRequest> body) {
        return makeHttpCallAsync(() -> buildListRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleListResponse(context));
    }

    /**
     * Builds the HttpRequest object for list.
     */
    private HttpRequest buildListRequest(
            final List<WaitlistRequest> body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/approve/list");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for list.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleListResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

    /**
     * Approve batch of users(Eg. Top n users).
     * @param  body  Required parameter: Example:
     * @return    Returns the List of WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public List<WaitlistResponse> batch(
            final ApproveRequest body) throws ApiException, IOException {
        HttpRequest request = buildBatchRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBatchResponse(context);
    }

    /**
     * Approve batch of users(Eg. Top n users).
     * @param  body  Required parameter: Example:
     * @return    Returns the List of WaitlistResponse response from the API call
     */
    public CompletableFuture<List<WaitlistResponse>> batchAsync(
            final ApproveRequest body) {
        return makeHttpCallAsync(() -> buildBatchRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleBatchResponse(context));
    }

    /**
     * Builds the HttpRequest object for batch.
     */
    private HttpRequest buildBatchRequest(
            final ApproveRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/approve/batch");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for batch.
     * @return An object of type List of WaitlistResponse
     */
    private List<WaitlistResponse> handleBatchResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        List<WaitlistResponse> result = ApiHelper.deserializeArray(responseBody,
                WaitlistResponse[].class);
        return result;
    }

    /**
     * Reject user from the waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse batch1(
            final WaitlistRequest body) throws ApiException, IOException {
        HttpRequest request = buildBatch1Request(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleBatch1Response(context);
    }

    /**
     * Reject user from the waitlist.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> batch1Async(
            final WaitlistRequest body) {
        return makeHttpCallAsync(() -> buildBatch1Request(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleBatch1Response(context));
    }

    /**
     * Builds the HttpRequest object for batch1.
     */
    private HttpRequest buildBatch1Request(
            final WaitlistRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/reject");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for batch1.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleBatch1Response(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

    /**
     * Update the feature configurations.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public WaitlistResponse update(
            final FeatureRequest body) throws ApiException, IOException {
        HttpRequest request = buildUpdateRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdateResponse(context);
    }

    /**
     * Update the feature configurations.
     * @param  body  Required parameter: Example:
     * @return    Returns the WaitlistResponse response from the API call
     */
    public CompletableFuture<WaitlistResponse> updateAsync(
            final FeatureRequest body) {
        return makeHttpCallAsync(() -> buildUpdateRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleUpdateResponse(context));
    }

    /**
     * Builds the HttpRequest object for update.
     */
    private HttpRequest buildUpdateRequest(
            final FeatureRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/waitlist/feature/update");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for update.
     * @return An object of type WaitlistResponse
     */
    private WaitlistResponse handleUpdateResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        WaitlistResponse result = ApiHelper.deserialize(responseBody,
                WaitlistResponse.class);

        return result;
    }

}