package edu.icet.Websocket;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

public interface Websocket {


    void registerEndpoints(StompEndpointRegistry register);

    void configureMessageBroker(MessageBrokerRegistry registry);
}
