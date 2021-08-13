package ru.mortihead;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWorldImpl implements HelloWorld{

    @WebMethod
    public String printMessage(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
}
