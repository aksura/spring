/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsel.co.id;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author AkxProject
 */
@Controller
public class HelloController {
    
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String begin(Map<String, Object> model) {

        logger.debug("index() is executed!");

        return "index";
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Map<String, Object> model) {

        logger.debug("hello() is executed!");

        return "hello";
    }
}
