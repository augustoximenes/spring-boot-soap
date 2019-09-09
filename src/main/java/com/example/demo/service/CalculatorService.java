package com.example.demo.service;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapMessage;

import com.example.demo.util.SOAPConnector;
import com.example.demo.wsdl.calculator.Add;
import com.example.demo.wsdl.calculator.AddResponse;

@Service
public class CalculatorService {

	@Autowired
	SOAPConnector soapConnector;
		
	public int getAddResult(int a, int b) {
		Add add =  new Add();
		add.setIntA(a);
		add.setIntB(b);
        AddResponse response = (AddResponse) soapConnector.callWebService("http://www.dneonline.com/calculator.asmx", add, new WebServiceMessageCallback() {

			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				((SoapMessage) message).setSoapAction("http://tempuri.org/Add");
				
			}
		});
        
        return response.getAddResult();
	}
	
}
