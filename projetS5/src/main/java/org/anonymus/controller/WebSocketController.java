//package org.anonymus.controller;
//
//import org.anonymus.webSocketMsg.Mbed;
//import org.anonymus.webSocketMsg.MbedMessage;
//import org.springframework.stereotype.Controller;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
///**
//* Created by antoine on 3/3/2015.
//*/
//@Controller
//public class WebSocketController {
//
//    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
//    public Mbed mbed(MbedMessage message)throws Exception {
////        Thread.sleep(3000); // simulated delay
//        return new Mbed("Hello, " + message.getName() + "!");
//    }
//
//}
