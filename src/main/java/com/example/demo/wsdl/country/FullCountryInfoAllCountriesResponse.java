//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.09.09 às 01:51:54 AM BRT 
//


package com.example.demo.wsdl.country;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullCountryInfoAllCountriesResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fullCountryInfoAllCountriesResult"
})
@XmlRootElement(name = "FullCountryInfoAllCountriesResponse")
public class FullCountryInfoAllCountriesResponse {

    @XmlElement(name = "FullCountryInfoAllCountriesResult", required = true)
    protected ArrayOftCountryInfo fullCountryInfoAllCountriesResult;

    /**
     * Obtém o valor da propriedade fullCountryInfoAllCountriesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public ArrayOftCountryInfo getFullCountryInfoAllCountriesResult() {
        return fullCountryInfoAllCountriesResult;
    }

    /**
     * Define o valor da propriedade fullCountryInfoAllCountriesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public void setFullCountryInfoAllCountriesResult(ArrayOftCountryInfo value) {
        this.fullCountryInfoAllCountriesResult = value;
    }

}
