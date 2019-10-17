package com.demo.DemoApplication.Service;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DemoService {

    public String create(){
        Date date=new Date();
        Long epoch=date.getTime()/1000L;

        return "Created";
    }

}
