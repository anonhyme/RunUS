package org.anonymus.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by antoine on 3/2/2015.
 */
@Controller
@RequestMapping(value="/" )
public class HomeController {
    
    @RequestMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
//        mav.addObject("enterWorld", "Enter World!");
        return mav;
    }

    @RequestMapping("/websocket/SockJsExample")
    public ModelAndView webSocketExample() {
        ModelAndView mav = new ModelAndView("SockJsExample");
//        mav.addObject("enterWorld", "Enter World!");
        return mav;
    }
}
