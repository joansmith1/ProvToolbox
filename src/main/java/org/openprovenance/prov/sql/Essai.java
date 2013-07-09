//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.16 at 10:17:34 PM GMT 
//


package org.openprovenance.prov.sql;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.JAXBContextUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.QNameAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Essai complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Essai">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mytype" type="{http://www.w3.org/ns/prov#}AValue" minOccurs="0"/>
 *         &lt;element name="any" type="{http://www.w3.org/ns/prov#}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/ns/prov#}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Essai", propOrder = {
    "startTime",
    "endTime",
    "label",
    "type",
    "location",
    "mytype",
    "any"
})
@Entity(name = "Essai")
@Table(name = "ESSAI")
@Inheritance(strategy = InheritanceType.JOINED)
public class Essai implements  org.openprovenance.prov.xml.Element, Equals, HashCode
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    protected List<InternationalizedString> label;
    protected List<Object> type;
    protected List<Object> location;
    protected List<AValue> mytype;
    @XmlAnyElement(lax = true)
    protected List<org.openprovenance.prov.xml.Attribute> any;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/ns/prov#")
    protected QName id;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<Essai.EssaiTypeItem> typeItems;
    protected transient List<Essai.EssaiLocationItem> locationItems;
    protected transient List<Essai.EssaiAnyItem> anyItems;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalizedString }
     * 
     * 
     */
    @OneToMany(targetEntity = InternationalizedString.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LABEL_ESSAI_HJID")
    public List<InternationalizedString> getLabel() {
        if (label == null) {
            label = new ArrayList<InternationalizedString>();
        }
        return this.label;
    }

    /**
     * 
     * 
     */
    public void setLabel(List<InternationalizedString> label) {
        this.label = label;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    @Transient
    public List<Object> getType() {
        if (type == null) {
            type = new ArrayList<Object>();
        }
        return this.type;
    }

    /**
     * 
     * 
     */
    public void setType(List<Object> type) {
        this.type = type;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    @Transient
    public List<Object> getLocation() {
        if (location == null) {
            location = new ArrayList<Object>();
        }
        return this.location;
    }

    /**
     * 
     * 
     */
    public void setLocation(List<Object> location) {
        this.location = location;
    }

    /**
     * Gets the value of the mytype property.
     * 
     * @return
     *     possible object is
     *     {@link AValue }
     *     
     */
    @OneToMany(targetEntity = AValue.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MYTYPE_ESSAI_HJID")
    public List<AValue> getMytype() {
        if (mytype == null) {
            mytype = new ArrayList<AValue>();
        }
        return this.mytype;
    }

    /**
     * 
     * 
     */
    public void setMytype(List<AValue> mytype) {
        this.mytype = mytype;
    }

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
     * {@link OrgOpenprovenanceProvXmlAttribute }
     * 
     * 
     */
    @OneToMany(targetEntity = org.openprovenance.prov.xml.Attribute.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ANY__ESSAI_HJID")
    public List<org.openprovenance.prov.xml.Attribute> getAny() {
        if (any == null) {
            any = new ArrayList<org.openprovenance.prov.xml.Attribute>();
        }
        return this.any;
    }

    /**
     * 
     * 
     */
    public void setAny(List<org.openprovenance.prov.xml.Attribute> any) {
        this.any = any;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    @Transient
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @Basic
    @Column(name = "STARTTIMEITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartTimeItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getStartTime());
    }

    public void setStartTimeItem(Date target) {
        setStartTime(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @Basic
    @Column(name = "ENDTIMEITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEndTimeItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getEndTime());
    }

    public void setEndTimeItem(Date target) {
        setEndTime(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @OneToMany(targetEntity = Essai.EssaiTypeItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPEITEMS_ESSAI_HJID")
    public List<Essai.EssaiTypeItem> getTypeItems() {
        if (this.typeItems == null) {
            this.typeItems = new ArrayList<Essai.EssaiTypeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.type)) {
            this.type = ItemUtils.wrap(this.type, this.typeItems, Essai.EssaiTypeItem.class);
        }
        return this.typeItems;
    }

    public void setTypeItems(List<Essai.EssaiTypeItem> value) {
        this.type = null;
        this.typeItems = null;
        this.typeItems = value;
        if (this.typeItems == null) {
            this.typeItems = new ArrayList<Essai.EssaiTypeItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.type)) {
            this.type = ItemUtils.wrap(this.type, this.typeItems, Essai.EssaiTypeItem.class);
        }
    }

    @OneToMany(targetEntity = Essai.EssaiLocationItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATIONITEMS_ESSAI_HJID")
    public List<Essai.EssaiLocationItem> getLocationItems() {
        if (this.locationItems == null) {
            this.locationItems = new ArrayList<Essai.EssaiLocationItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.location)) {
            this.location = ItemUtils.wrap(this.location, this.locationItems, Essai.EssaiLocationItem.class);
        }
        return this.locationItems;
    }

    public void setLocationItems(List<Essai.EssaiLocationItem> value) {
        this.location = null;
        this.locationItems = null;
        this.locationItems = value;
        if (this.locationItems == null) {
            this.locationItems = new ArrayList<Essai.EssaiLocationItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.location)) {
            this.location = ItemUtils.wrap(this.location, this.locationItems, Essai.EssaiLocationItem.class);
        }
    }


    @OneToMany(targetEntity = Essai.EssaiAnyItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ANYITEMS_ESSAI_HJID")
    public List<Essai.EssaiAnyItem> getAnyItems() {
        if (this.anyItems == null) {
            this.anyItems = new ArrayList<Essai.EssaiAnyItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.any)) {
	    // LUC, Commented out
	    //            this.any = ItemUtils.wrap(this.any, this.anyItems, Essai.EssaiAnyItem.class);
        }
        return this.anyItems;
    }

    public void setAnyItems(List<Essai.EssaiAnyItem> value) {
        this.any = null;
        this.anyItems = null;
        this.anyItems = value;
        if (this.anyItems == null) {
            this.anyItems = new ArrayList<Essai.EssaiAnyItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.any)) {
	    // LUC, Commented out
            //this.any = ItemUtils.wrap(this.any, this.anyItems, Essai.EssaiAnyItem.class);
        }
    }



    @Basic
    @Column(name = "IDITEM")
    public String getIdItem() {
        return XmlAdapterUtils.unmarshall(QNameAsString.class, this.getId());
    }

    public void setIdItem(String target) {
        setId(XmlAdapterUtils.marshall(QNameAsString.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Essai)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Essai that = ((Essai) object);
        {
            XMLGregorianCalendar lhsStartTime;
            lhsStartTime = this.getStartTime();
            XMLGregorianCalendar rhsStartTime;
            rhsStartTime = that.getStartTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTime", lhsStartTime), LocatorUtils.property(thatLocator, "startTime", rhsStartTime), lhsStartTime, rhsStartTime)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndTime;
            lhsEndTime = this.getEndTime();
            XMLGregorianCalendar rhsEndTime;
            rhsEndTime = that.getEndTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTime", lhsEndTime), LocatorUtils.property(thatLocator, "endTime", rhsEndTime), lhsEndTime, rhsEndTime)) {
                return false;
            }
        }
        {
            List<InternationalizedString> lhsLabel;
            lhsLabel = (((this.label!= null)&&(!this.label.isEmpty()))?this.getLabel():null);
            List<InternationalizedString> rhsLabel;
            rhsLabel = (((that.label!= null)&&(!that.label.isEmpty()))?that.getLabel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
                return false;
            }
        }
        {
            List<Object> lhsType;
            lhsType = (((this.type!= null)&&(!this.type.isEmpty()))?this.getType():null);
            List<Object> rhsType;
            rhsType = (((that.type!= null)&&(!that.type.isEmpty()))?that.getType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<Object> lhsLocation;
            lhsLocation = (((this.location!= null)&&(!this.location.isEmpty()))?this.getLocation():null);
            List<Object> rhsLocation;
            rhsLocation = (((that.location!= null)&&(!that.location.isEmpty()))?that.getLocation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            List<org.openprovenance.prov.xml.Attribute> lhsAny;
            lhsAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            List<org.openprovenance.prov.xml.Attribute> rhsAny;
            rhsAny = (((that.any!= null)&&(!that.any.isEmpty()))?that.getAny():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny)) {
                return false;
            }
        }
        {
            QName lhsId;
            lhsId = this.getId();
            QName rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            XMLGregorianCalendar theStartTime;
            theStartTime = this.getStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTime", theStartTime), currentHashCode, theStartTime);
        }
        {
            XMLGregorianCalendar theEndTime;
            theEndTime = this.getEndTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTime", theEndTime), currentHashCode, theEndTime);
        }
        {
            List<InternationalizedString> theLabel;
            theLabel = (((this.label!= null)&&(!this.label.isEmpty()))?this.getLabel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        {
            List<Object> theType;
            theType = (((this.type!= null)&&(!this.type.isEmpty()))?this.getType():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<Object> theLocation;
            theLocation = (((this.location!= null)&&(!this.location.isEmpty()))?this.getLocation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            List<org.openprovenance.prov.xml.Attribute> theAny;
            theAny = (((this.any!= null)&&(!this.any.isEmpty()))?this.getAny():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny);
        }
        {
            QName theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "Essai$EssaiAnyItem")
    @Table(name = "ESSAIANYITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class EssaiAnyItem
        implements Item<Object>
    {

        @XmlAnyElement(lax = true)
        protected Object item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "org.openprovenance.prov.sql";

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Basic
        @Column(name = "ITEMOBJECT")
        @Lob
        public String getItemObject() {
            if (JAXBContextUtils.isMarshallable(ItemObjectContextPath, this.getItem())) {
                return JAXBContextUtils.marshal(ItemObjectContextPath, this.getItem());
            } else {
                return null;
            }
        }

        public void setItemObject(String target) {
            if (target!= null) {
                setItem(JAXBContextUtils.unmarshal(ItemObjectContextPath, target));
            }
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "Essai$EssaiLocationItem")
    @Table(name = "ESSAILOCATIONITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class EssaiLocationItem
        implements Item<Object>
    {

        @XmlElement(name = "location", namespace = "http://www.w3.org/ns/prov#")
        @XmlSchemaType(name = "anySimpleType")
        protected Object item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "org.openprovenance.prov.sql";

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Basic
        @Column(name = "ITEMOBJECT")
        public String getItemObject() {
            if (JAXBContextUtils.isMarshallable(ItemObjectContextPath, this.getItem())) {
                return JAXBContextUtils.marshal(ItemObjectContextPath, this.getItem());
            } else {
                return null;
            }
        }

        public void setItemObject(String target) {
            if (target!= null) {
                setItem(JAXBContextUtils.unmarshal(ItemObjectContextPath, target));
            }
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "Essai$EssaiTypeItem")
    @Table(name = "ESSAITYPEITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class EssaiTypeItem
        implements Item<Object>
    {

        @XmlElement(name = "type", namespace = "http://www.w3.org/ns/prov#")
        @XmlSchemaType(name = "anySimpleType")
        protected Object item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "org.openprovenance.prov.sql";

        /**
         * Gets the value of the item property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * Sets the value of the item property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

	@ManyToOne(targetEntity = AValue.class, cascade = {
		CascadeType.ALL
	    })
	@JoinColumn(name = "TYPEWRAP_ESSAI_HJID")
        public AValue getItemObject() {
	    System.out.println("===> in getItemObject()");
	    Object o=this.getItem();
	    AValue res= SQLValueConverter.convert(o);
	    System.out.println("===> out getItemObject() " + o);
	    return res;
        }

        public void setItemObject(AValue target) {
    	    System.out.println("===> !!! in setItemObject()");

            if (target!= null) {  //FIXME: an int is used, and not an Integer. Can't detect the type of the argument!
        	Object res= SQLValueConverter.convertFromAValue(target);
                setItem(res); 
            }
        }

    }

}
