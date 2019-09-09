package com.example.demo.service;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;

import com.example.demo.util.SOAPConnector;
import com.example.demo.wsdl.country.CapitalCity;
import com.example.demo.wsdl.country.CapitalCityResponse;

@Service
public class CapitalCityService {

	@Autowired
	SOAPConnector soapConnector;
	
	public String getCapitalCityResult(String countryISOCode) {
        CapitalCity cc = new CapitalCity();
        cc.setSCountryISOCode(countryISOCode);
        CapitalCityResponse ccResponse = (CapitalCityResponse) soapConnector.callWebService("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso", cc, new WebServiceMessageCallback() {
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {}
		});
        return ccResponse.getCapitalCityResult();
	}
	
}
