/*
 * Channel API
 * Front is a customer operations platform that enables support, sales, and account management teams to deliver exceptional service at scale. Front streamlines customer communication by combining the efficiency of a help desk and the familiarity of email, with automated workflows and real-time collaboration behind the scenes.  With Front, teams can centralize messages across channels, route them to the right person, and unlock visibility and insights across all of their customer operations. More than 8000 businesses use Front to drive operational efficiency that prevents churn, improves retention, and propels customer growth.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client;

import java.util.List;
import java.util.Map;

import okhttp3.Request;

/**
 * API response returned by API call.
 */
public class ApiResponse<T> {
    final private int statusCode;
    final private Map<String, List<String>> headers;
    final private T data;
    final private Request request;
    final private long roundTripTime;

    /**
     * <p>Constructor for ApiResponse.</p>
     *
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     * @param data The object deserialized from response bod
     */
    public ApiResponse(Request request, int statusCode, Map<String, List<String>> headers, T data, long roundTripTime) {
        this.request = request;
        this.statusCode = statusCode;
        this.headers = headers;
        this.data = data;
        this.roundTripTime = roundTripTime;
    }

    /**
     * <p>Get the <code>status code</code>.</p>
     *
     * @return the status code
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * <p>Get the <code>headers</code>.</p>
     *
     * @return a {@link java.util.Map} of headers 
     */
    public Map<String, List<String>> getResponseHeaders() {
        return headers;
    }

    /**
     * <p>Get the <code>data</code>.</p>
     *
     * @return the data
     */
    public T getResponseBody() {
        return data;
    }

    /**
     * <p>Get the <code>request</code>.</p>
     *
     * @return the request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * <p>Get the <code>roundTripTime</code>.</p>
     *
     * @return the round trip time
     */
    public long getRoundTripTime() {
        return roundTripTime;
    }
}
