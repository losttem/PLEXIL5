//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.math.BigInteger;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BooleanLiteral;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.NodeVariable;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.NumericalLiteral;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.StringLiteral;


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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="Type" type="{}TypeValues"/>
 *         &lt;element name="InitialValue" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{}Value"/>
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
    "name",
    "type",
    "initialValue"
})
@XmlRootElement(name = "DeclareVariable")
public class DeclareVariable {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlElement(name = "Type", required = true)
    protected TypeValues type;
    @XmlElement(name = "InitialValue")
    protected DeclareVariable.InitialValue initialValue;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param variablesContext
     * @return
     */
    public String getNameExpression(Map<String,String> variablesContext){
    	return new NodeVariable(name).getExpression(variablesContext);
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeValues }
     *     
     */
    public TypeValues getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeValues }
     *     
     */
    public void setType(TypeValues value) {
        this.type = value;
    }

    /**
     * Gets the value of the initialValue property.
     * 
     * @return
     *     possible object is
     *     {@link DeclareVariable.InitialValue }
     *     
     */
    public DeclareVariable.InitialValue getInitialValue() {
        return initialValue;
    }

    /**
     * 
     * @param variablesContext
     * @return
     */
    public String getInitialValueExpression(Map<String,String> variablesContext){
    	return initialValue.getInitialValueExpression(variablesContext);
    }
    
    /**
     * Sets the value of the initialValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareVariable.InitialValue }
     *     
     */
    public void setInitialValue(DeclareVariable.InitialValue value) {
        this.initialValue = value;
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
     *       &lt;group ref="{}Value"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "integerValue",
        "realValue",
        "booleanValue",
        "stringValue"
    })
    public static class InitialValue {

        @XmlElement(name = "IntegerValue")
        protected BigInteger integerValue;
        @XmlElement(name = "RealValue")
        protected Double realValue;
        @XmlElement(name = "BooleanValue")
        protected Boolean booleanValue;
        @XmlElement(name = "StringValue")
        protected String stringValue;

        /**
         * Gets the value of the integerValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIntegerValue() {
            return integerValue;
        }

        /**
         * Sets the value of the integerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIntegerValue(BigInteger value) {
            this.integerValue = value;
        }

        /**
         * Gets the value of the realValue property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getRealValue() {
            return realValue;
        }

        /**
         * Sets the value of the realValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setRealValue(Double value) {
            this.realValue = value;
        }

        /**
         * Gets the value of the booleanValue property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBooleanValue() {
            return booleanValue;
        }

        /**
         * Sets the value of the booleanValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBooleanValue(Boolean value) {
            this.booleanValue = value;
        }

        /**
         * Gets the value of the stringValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStringValue() {
            return stringValue;
        }

        /**
         * Sets the value of the stringValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStringValue(String value) {
            this.stringValue = value;
        }
        
        public String getInitialValueExpression(Map<String,String> variablesContext){
        	if (this.getIntegerValue()!=null){
        		return new NumericalLiteral(this.getIntegerValue().toString()).getExpression(variablesContext);        		
        	}
        	else if (this.getRealValue()!=null){
        		return new NumericalLiteral(this.getRealValue().toString()).getExpression(variablesContext);
        	}
        	else if (this.isBooleanValue()!=null){
        		return new BooleanLiteral(this.isBooleanValue()).getExpression(variablesContext);
        	}
        	else if (this.getStringValue()!=null){
        		//TODO define string literal in maude
        		return new StringLiteral(this.getStringValue()).getExpression(variablesContext);
        		//throw new RuntimeException("String literals not suported yet."+this.getStringValue());
        	}
        	else{
        		throw new RuntimeException("Initial variable value data type not supported.");
        	}
        }
        
        
    }

}
