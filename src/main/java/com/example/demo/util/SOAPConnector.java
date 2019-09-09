package com.example.demo.util;

import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
 
public class SOAPConnector extends WebServiceGatewaySupport {
 
    public Object callWebService(String url, Object request, WebServiceMessageCallback cb){
        return getWebServiceTemplate().marshalSendAndReceive(url, request, cb);
    }

}
