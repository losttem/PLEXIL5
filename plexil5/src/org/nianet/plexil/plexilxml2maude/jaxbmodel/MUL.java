//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BinaryArithmeticExpression;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}NumericExpression" maxOccurs="unbounded" minOccurs="2"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numericExpression"
})
@XmlRootElement(name = "MUL")
public class MUL extends BinaryArithmeticExpression{
	
    @Override
	public String getExpression(Map<String,String> variablesContext) {
		return "("+this.getLeftExpression().getExpression(variablesContext)+" * "+this.getRighExpression().getExpression(variablesContext)+")"; 
	}


    @XmlElementRefs({
        @XmlElementRef(name = "DIV", type = DIV.class),
        @XmlElementRef(name = "RealVariable", type = JAXBElement.class),
        @XmlElementRef(name = "ADD", type = ADD.class),
        @XmlElementRef(name = "IntegerVariable", type = JAXBElement.class),
        @XmlElementRef(name = "MUL", type = MUL.class),
        @XmlElementRef(name = "ArrayMaxSize", type = JAXBElement.class),
        @XmlElementRef(name = "SUB", type = SUB.class),
        @XmlElementRef(name = "LookupOnChange", type = LookupOnChange.class),
        @XmlElementRef(name = "RealValue", type = JAXBElement.class),
        @XmlElementRef(name = "SQRT", type = SQRT.class),
        @XmlElementRef(name = "IntegerValue", type = JAXBElement.class),
        @XmlElementRef(name = "LookupNow", type = LookupNow.class),
        @XmlElementRef(name = "ABS", type = ABS.class),
        @XmlElementRef(name = "ArrayElement", type = ArrayElement.class),
        @XmlElementRef(name = "NodeTimepointValue", type = NodeTimepointValue.class),
        @XmlElementRef(name = "ArraySize", type = JAXBElement.class)
    })
    protected List<Object> numericExpression;

    /**
     * Gets the value of the numericExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numericExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumericExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DIV }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ADD }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link MUL }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link SUB }
     * {@link LookupOnChange }
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link SQRT }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link LookupNow }
     * {@link ABS }
     * {@link ArrayElement }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link NodeTimepointValue }
     * 
     * 
     */
    public List<Object> getNumericExpression() {
        if (numericExpression == null) {
            numericExpression = new ArrayList<Object>();
        }
        return this.numericExpression;
    }

}
