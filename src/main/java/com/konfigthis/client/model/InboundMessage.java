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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.InboundMessageMetadata;
import com.konfigthis.client.model.InboundMessageSender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * InboundMessage
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InboundMessage {
  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private InboundMessageSender sender;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private InboundMessageMetadata metadata;

  public static final String SERIALIZED_NAME_DELIVERED_AT = "delivered_at";
  @SerializedName(SERIALIZED_NAME_DELIVERED_AT)
  private Integer deliveredAt;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<File> attachments = null;

  public InboundMessage() {
  }

  public InboundMessage sender(InboundMessageSender sender) {
    
    
    
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InboundMessageSender getSender() {
    return sender;
  }


  public void setSender(InboundMessageSender sender) {
    
    
    
    this.sender = sender;
  }


  public InboundMessage subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of the message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public InboundMessage body(String body) {
    
    
    
    
    this.body = body;
    return this;
  }

   /**
   * Body of the message
   * @return body
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Body of the message")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    
    
    
    this.body = body;
  }


  public InboundMessage metadata(InboundMessageMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InboundMessageMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(InboundMessageMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public InboundMessage deliveredAt(Integer deliveredAt) {
    
    
    
    
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Time in seconds at which message was created in external system
   * @return deliveredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time in seconds at which message was created in external system")

  public Integer getDeliveredAt() {
    return deliveredAt;
  }


  public void setDeliveredAt(Integer deliveredAt) {
    
    
    
    this.deliveredAt = deliveredAt;
  }


  public InboundMessage attachments(List<File> attachments) {
    
    
    
    
    this.attachments = attachments;
    return this;
  }

  public InboundMessage addAttachmentsItem(File attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Binary data of attached files. Must use &#x60;Content-Type: multipart/form-data&#x60; if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Binary data of attached files. Must use `Content-Type: multipart/form-data` if specified. See [example](https://gist.github.com/hdornier/e04d04921032e98271f46ff8a539a4cb) or read more about [Attachments](https://dev.frontapp.com/docs/attachments-1).  Max 25 MB.")

  public List<File> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<File> attachments) {
    
    
    
    this.attachments = attachments;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the InboundMessage instance itself
   */
  public InboundMessage putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessage inboundMessage = (InboundMessage) o;
    return Objects.equals(this.sender, inboundMessage.sender) &&
        Objects.equals(this.subject, inboundMessage.subject) &&
        Objects.equals(this.body, inboundMessage.body) &&
        Objects.equals(this.metadata, inboundMessage.metadata) &&
        Objects.equals(this.deliveredAt, inboundMessage.deliveredAt) &&
        Objects.equals(this.attachments, inboundMessage.attachments)&&
        Objects.equals(this.additionalProperties, inboundMessage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, subject, body, metadata, deliveredAt, attachments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessage {\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("sender");
    openapiFields.add("subject");
    openapiFields.add("body");
    openapiFields.add("metadata");
    openapiFields.add("delivered_at");
    openapiFields.add("attachments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sender");
    openapiRequiredFields.add("body");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InboundMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InboundMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InboundMessage is not found in the empty JSON string", InboundMessage.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InboundMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `sender`
      InboundMessageSender.validateJsonObject(jsonObj.getAsJsonObject("sender"));
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (!jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      // validate the required field `metadata`
      InboundMessageMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InboundMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InboundMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InboundMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InboundMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<InboundMessage>() {
           @Override
           public void write(JsonWriter out, InboundMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public InboundMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InboundMessage instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InboundMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InboundMessage
  * @throws IOException if the JSON string is invalid with respect to InboundMessage
  */
  public static InboundMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InboundMessage.class);
  }

 /**
  * Convert an instance of InboundMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

