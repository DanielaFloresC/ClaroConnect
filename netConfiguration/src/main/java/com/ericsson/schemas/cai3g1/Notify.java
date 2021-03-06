
package com.ericsson.schemas.cai3g1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="notificationHeader" type="{http://schemas.ericsson.com/cai3g1.2/}NotificationHeaderType"/>
 *         &lt;element name="correlatedNotifications" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceIndicator" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="notificationData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "notificationHeader",
    "correlatedNotifications",
    "additionalText",
    "sourceIndicator",
    "notificationData"
})
@XmlRootElement(name = "Notify")
public class Notify {

    @XmlElement(required = true)
    protected NotificationHeaderType notificationHeader;
    @XmlElement(nillable = true)
    protected List<String> correlatedNotifications;
    protected String additionalText;
    @XmlSchemaType(name = "anyURI")
    protected String sourceIndicator;
    @XmlElement(required = true)
    protected Notify.NotificationData notificationData;

    /**
     * Gets the value of the notificationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationHeaderType }
     *     
     */
    public NotificationHeaderType getNotificationHeader() {
        return notificationHeader;
    }

    /**
     * Sets the value of the notificationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationHeaderType }
     *     
     */
    public void setNotificationHeader(NotificationHeaderType value) {
        this.notificationHeader = value;
    }

    /**
     * Gets the value of the correlatedNotifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlatedNotifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelatedNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorrelatedNotifications() {
        if (correlatedNotifications == null) {
            correlatedNotifications = new ArrayList<String>();
        }
        return this.correlatedNotifications;
    }

    /**
     * Gets the value of the additionalText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalText() {
        return additionalText;
    }

    /**
     * Sets the value of the additionalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalText(String value) {
        this.additionalText = value;
    }

    /**
     * Gets the value of the sourceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIndicator() {
        return sourceIndicator;
    }

    /**
     * Sets the value of the sourceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIndicator(String value) {
        this.sourceIndicator = value;
    }

    /**
     * Gets the value of the notificationData property.
     * 
     * @return
     *     possible object is
     *     {@link Notify.NotificationData }
     *     
     */
    public Notify.NotificationData getNotificationData() {
        return notificationData;
    }

    /**
     * Sets the value of the notificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notify.NotificationData }
     *     
     */
    public void setNotificationData(Notify.NotificationData value) {
        this.notificationData = value;
    }


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
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    public static class NotificationData {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
