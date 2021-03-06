
package com.ericsson.schemas.cai3g1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MOType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOId" type="{http://schemas.ericsson.com/cai3g1.2/}AnyMOIdType" minOccurs="0"/>
 *         &lt;element name="MOAttributes" type="{http://schemas.ericsson.com/cai3g1.2/}CreateMODefinition" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://schemas.ericsson.com/cai3g1.2/}AnySequenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moType",
    "moId",
    "moAttributes",
    "extension"
})
@XmlRootElement(name = "Create")
public class Create {

    @XmlElement(name = "MOType", required = true)
    protected String moType;
    @XmlElement(name = "MOId")
    protected AnyMOIdType moId;
    @XmlElement(name = "MOAttributes")
    protected CreateMODefinition moAttributes;
    protected AnySequenceType extension;

    /**
     * Gets the value of the moType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOType() {
        return moType;
    }

    /**
     * Sets the value of the moType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOType(String value) {
        this.moType = value;
    }

    /**
     * Gets the value of the moId property.
     * 
     * @return
     *     possible object is
     *     {@link AnyMOIdType }
     *     
     */
    public AnyMOIdType getMOId() {
        return moId;
    }

    /**
     * Sets the value of the moId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyMOIdType }
     *     
     */
    public void setMOId(AnyMOIdType value) {
        this.moId = value;
    }

    /**
     * Gets the value of the moAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CreateMODefinition }
     *     
     */
    public CreateMODefinition getMOAttributes() {
        return moAttributes;
    }

    /**
     * Sets the value of the moAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateMODefinition }
     *     
     */
    public void setMOAttributes(CreateMODefinition value) {
        this.moAttributes = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link AnySequenceType }
     *     
     */
    public AnySequenceType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnySequenceType }
     *     
     */
    public void setExtension(AnySequenceType value) {
        this.extension = value;
    }

}
