# MessagesApi

All URIs are relative to *https://api2.frontapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importReceivedMessage**](MessagesApi.md#importReceivedMessage) | **POST** /channels/{channel_id}/inbound_messages | Sync inbound message |
| [**importSyncedMessage**](MessagesApi.md#importSyncedMessage) | **POST** /channels/{channel_id}/outbound_messages | Sync outbound message |


<a name="importReceivedMessage"></a>
# **importReceivedMessage**
> MessagesImportReceivedMessageResponse importReceivedMessage(channelId).inboundMessage(inboundMessage).execute();

Sync inbound message

Import a message that was received by the channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontChannel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontChannel client = new FrontChannel(configuration);
    InboundMessageSender sender = new InboundMessageSender();
    String body = "body_example"; // Body of the message
    InboundMessageMetadata metadata = new InboundMessageMetadata();
    String channelId = "cha_123"; // The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String subject = "subject_example"; // Subject of the message
    Integer deliveredAt = 56; // Time in seconds at which message was created in external system
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      MessagesImportReceivedMessageResponse result = client
              .messages
              .importReceivedMessage(sender, body, metadata, channelId)
              .subject(subject)
              .deliveredAt(deliveredAt)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessageUid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importReceivedMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessagesImportReceivedMessageResponse> response = client
              .messages
              .importReceivedMessage(sender, body, metadata, channelId)
              .subject(subject)
              .deliveredAt(deliveredAt)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importReceivedMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to cha_123] |
| **inboundMessage** | [**InboundMessage**](InboundMessage.md)|  | [optional] |

### Return type

[**MessagesImportReceivedMessageResponse**](MessagesImportReceivedMessageResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | An accepted message |  -  |

<a name="importSyncedMessage"></a>
# **importSyncedMessage**
> MessagesImportReceivedMessageResponse importSyncedMessage(channelId).outboundMessage(outboundMessage).execute();

Sync outbound message

Import a message that was sent from the channel.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.FrontChannel;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MessagesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api2.frontapp.com";
    
    // Configure HTTP bearer authorization: http
    configuration.token = "BEARER TOKEN";
    FrontChannel client = new FrontChannel(configuration);
    List<OutboundMessageToInner> to = Arrays.asList(); // Data of the message recipient
    String body = "body_example"; // Body of the message
    InboundMessageMetadata metadata = new InboundMessageMetadata();
    String channelId = "cha_123"; // The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1).
    String senderName = "senderName_example"; // Name of the sender
    String subject = "subject_example"; // Subject of the message
    String authorId = "authorId_example"; // ID of the teammate on behalf of whom the message is sent
    Integer deliveredAt = 56; // Time in seconds at which message was created in external system
    List<File> attachments = Arrays.asList(); // Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
    try {
      MessagesImportReceivedMessageResponse result = client
              .messages
              .importSyncedMessage(to, body, metadata, channelId)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .deliveredAt(deliveredAt)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getStatus());
      System.out.println(result.getMessageUid());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importSyncedMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MessagesImportReceivedMessageResponse> response = client
              .messages
              .importSyncedMessage(to, body, metadata, channelId)
              .senderName(senderName)
              .subject(subject)
              .authorId(authorId)
              .deliveredAt(deliveredAt)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#importSyncedMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelId** | **String**| The channel ID. Alternatively, you can supply the channel address as a [resource alias](https://dev.frontapp.com/docs/resource-aliases-1). | [default to cha_123] |
| **outboundMessage** | [**OutboundMessage**](OutboundMessage.md)|  | [optional] |

### Return type

[**MessagesImportReceivedMessageResponse**](MessagesImportReceivedMessageResponse.md)

### Authorization

[http](../README.md#http)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | An accepted message |  -  |

