//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 06:25:41 PM CEST 
//


package ch.so.geo.schema.agi.cadastre._0_9.extract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuildingEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildingEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Edid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://geo.so.ch/schema/AGI/Cadastre/0.9/Extract}AddressType" minOccurs="0"/&gt;
 *         &lt;element name="Egid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildingEntryType", propOrder = {
    "edid",
    "postalAddress",
    "egid"
})
public class BuildingEntryType {

    @XmlElement(name = "Edid")
    protected Integer edid;
    @XmlElement(name = "PostalAddress")
    protected AddressType postalAddress;
    @XmlElement(name = "Egid")
    protected Integer egid;

    /**
     * Gets the value of the edid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdid() {
        return edid;
    }

    /**
     * Sets the value of the edid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdid(Integer value) {
        this.edid = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPostalAddress(AddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the egid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEgid() {
        return egid;
    }

    /**
     * Sets the value of the egid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEgid(Integer value) {
        this.egid = value;
    }

}
