

# OutboundMessage

Payload to receive an outbound message from an external system into Front.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**senderName** | **String** | Name of the sender |  [optional] |
|**to** | [**List&lt;OutboundMessageToInner&gt;**](OutboundMessageToInner.md) | Data of the message recipient |  |
|**subject** | **String** | Subject of the message |  [optional] |
|**authorId** | **String** | ID of the teammate on behalf of whom the message is sent |  [optional] |
|**body** | **String** | Body of the message |  |
|**metadata** | [**InboundMessageMetadata**](InboundMessageMetadata.md) |  |  |
|**deliveredAt** | **Integer** | Time in seconds at which message was created in external system |  [optional] |
|**attachments** | **List&lt;File&gt;** | Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB. |  [optional] |



