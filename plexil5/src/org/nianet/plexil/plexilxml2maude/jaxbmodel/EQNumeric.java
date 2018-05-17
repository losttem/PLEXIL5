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

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.ArithmeticExpression;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BooleanExpression;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.DataTypeUtils;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.NodeVariable;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.NumericalLiteral;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}NumericExpression" maxOccurs="2" minOccurs="2"/>
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
@XmlRootElement(name = "EQNumeric")
public class EQNumeric implements BooleanExpression{

	
	
    @SuppressWarnings("unchecked")
	@Override
	public String getExpression(Map<String,String> variablesContext) {
    
    	//TODO add LookupOnChange op ArithmeticExpression
    	
    	
    	Object o1=this.getNumericExpression().get(0);
    	Object o2=this.getNumericExpression().get(1);
    	
    	String leftExp=null;
    	String rightExp=null;
    	
    	if (o1 instanceof ArithmeticExpression){
    		leftExp=((ArithmeticExpression)o1).getExpression(variablesContext);
    	}
    	else if (o1 instanceof JAXBElement){
    		leftExp=((JAXBElement)o1).getValue().toString();    		
			if (DataTypeUtils.isNumber(leftExp)){
				leftExp=new NumericalLiteral(leftExp).getExpression(variablesContext);	
			}
			else{
				leftExp=new NodeVariable(leftExp).getExpression(variablesContext);
			}
    	}
    	else if (o1 instanceof LookupOnChange){
    		leftExp=((LookupOnChange)o1).getExpression(variablesContext);
    	}
    	else{
    		throw new RuntimeException("Invalid datatype for boolean expression: numerical equivalence:"+o1.getClass());
    	}

    	
    	if (o2 instanceof ArithmeticExpression){
    		rightExp=((ArithmeticExpression)o2).getExpression(variablesContext);
    	}
    	else if (o2 instanceof JAXBElement){
    		rightExp=((JAXBElement)o2).getValue().toString();
    		
			if (DataTypeUtils.isNumber(rightExp)){
				rightExp=new NumericalLiteral(rightExp).getExpression(variablesContext);	
			}
			else{
				rightExp=new NodeVariable(rightExp).getExpression(variablesContext);
			}
    	}
    	else if (o2 instanceof LookupOnChange){
    		leftExp=((LookupOnChange)o2).getExpression(variablesContext);
    	}
    	else{
    		throw new RuntimeException("Invalid datatype for boolean expression: numerical equivalence:"+o2.getClass());    		
    	}

    	return "("+leftExp+" equ "+rightExp+")";
	}

	@XmlElementRefs({
        @XmlElementRef(name = "DIV", type = DIV.class),
        @XmlElementRef(name = "RealVariable", type = JAXBElement.class),
        @XmlElementRef(name = "ADD", type = ADD.class),
        @XmlElementRef(name = "IntegerVariable", type = JAXBElement.class),
        @XmlElementRef(name = "MUL", type = MUL.class),
        @XmlElementRef(name = "SUB", type = SUB.class),
        @XmlElementRef(name = "LookupOnChange", type = LookupOnChange.class),
        @XmlElementRef(name = "RealValue", type = JAXBElement.class),
        @XmlElementRef(name = "ArraySize", type = JAXBElement.class),
        @XmlElementRef(name = "SQRT", type = SQRT.class),
        @XmlElementRef(name = "IntegerValue", type = JAXBElement.class),
        @XmlElementRef(name = "LookupNow", type = LookupNow.class),
        @XmlElementRef(name = "ABS", type = ABS.class),
        @XmlElementRef(name = "ArrayMaxSize", type = JAXBElement.class),
        @XmlElementRef(name = "ArrayElement", type = ArrayElement.class),
        @XmlElementRef(name = "NodeTimepointValue", type = NodeTimepointValue.class)
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
     * {@link SUB }
     * {@link LookupOnChange }
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link SQRT }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link LookupNow }
     * {@link ABS }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ArrayElement }
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
