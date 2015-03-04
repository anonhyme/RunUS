package org.anonymus.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 * Created by antoine on 3/3/2015.
 */
public class MyHandler extends TextWebSocketHandler {
    
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        //Handle new connection here
        session.sendMessage();
        
    }

    @Override
    public void handleTextMessage(WebSocketSession session,
                                  TextMessage message) {
        //Handle message.getPayload() here
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session,
                                      CloseStatus status) {
        //Handle closing connection here
    }

    @Override
    public void handleTransportError(WebSocketSession session,
                                     Throwable exception) {
        //Handle error during transport here
    }
}
