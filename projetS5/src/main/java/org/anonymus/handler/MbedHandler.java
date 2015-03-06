package org.anonymus.handler;

import org.anonymus.model.Runner;
import org.anonymus.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession;

import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceClient;
import java.io.IOException;

/**
 * Created by antoine on 3/3/2015.
 */
public class MbedHandler extends TextWebSocketHandler {
//    HttpSession httpSession;

    @Autowired
    RunnerService runnerService;
    
    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        //Handle new connection here
        //TODO find a way to separate different run session data in the db
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Runner runner = new Runner();
        super.handleTextMessage(session, message);
        TextMessage returnMessage = new TextMessage(message.getPayload());
        runner.setName(message.getPayload());
        runnerService.create(runner);
        session.sendMessage(returnMessage);
    }
//    @Override
//    public void afterConnectionClosed(WebSocketSession session,
//                                      CloseStatus status) {
//        //Handle closing connection here
//    }

//    @Override
//    public void handleTransportError(WebSocketSession session,
//                                     Throwable exception) {
//        //Handle error during transport here
//    }
}
