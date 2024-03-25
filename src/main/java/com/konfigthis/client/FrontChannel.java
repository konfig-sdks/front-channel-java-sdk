package com.konfigthis.client;

import com.konfigthis.client.api.ChannelsApi;
import com.konfigthis.client.api.MessagesApi;

public class FrontChannel {
    private ApiClient apiClient;
    public final ChannelsApi channels;
    public final MessagesApi messages;

    public FrontChannel() {
        this(null);
    }

    public FrontChannel(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.channels = new ChannelsApi(this.apiClient);
        this.messages = new MessagesApi(this.apiClient);
    }

}
