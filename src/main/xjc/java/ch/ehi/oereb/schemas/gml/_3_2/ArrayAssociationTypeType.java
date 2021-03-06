//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayAssociationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayAssociationType", propOrder = {
    "abstractObject"
})
public class ArrayAssociationTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "AbstractObject", namespace = "http://www.opengis.net/gml/3.2", type = AbstractObject.class, required = false)
    protected List<JAXBElement<?>> abstractObject;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * Gets the value of the abstractObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link File }
     * {@link CircleByCenterPoint }
     * {@link RectifiedGrid }
     * {@link ImageCRS }
     * {@link VerticalCRS }
     * {@link MultiSurface }
     * {@link ProjectedCRS }
     * {@link CoverageMappingRule }
     * {@link TimeNode }
     * {@link AbstractRing }
     * {@link TimeCalendar }
     * {@link EllipsoidUpperCase }
     * {@link TimePeriod }
     * {@link GeographicCRS }
     * {@link CoordinateSystemAxis }
     * {@link GeometricComplex }
     * {@link BooleanList }
     * {@link AbstractGeometricPrimitive }
     * {@link DefinitionCollection }
     * {@link EllipsoidalCSUpperCase }
     * {@link AbstractTimePrimitive }
     * {@link GeodeticDatumUpperCase }
     * {@link Dictionary }
     * {@link ArcString }
     * {@link Category }
     * {@link TemporalCS }
     * {@link AbstractCoordinateSystem }
     * {@link DerivedUnit }
     * {@link AbstractGeometry }
     * {@link AbstractFeatureCollection }
     * {@link AbstractGeneralConversion }
     * {@link ConcatenatedOperation }
     * {@link AbstractCurve }
     * {@link QuantityList }
     * {@link AbstractOperation }
     * {@link Bezier }
     * {@link AbstractGeneralParameterValue }
     * {@link ArcByCenterPoint }
     * {@link EnvelopeWithTimePeriod }
     * {@link AbstractSingleOperation }
     * {@link CylindricalCSUpperCase }
     * {@link CubicSpline }
     * {@link VerticalCSUpperCase }
     * {@link AbstractValue }
     * {@link LineStringSegment }
     * {@link Quantity }
     * {@link CategoryList }
     * {@link SphericalCSUpperCase }
     * {@link ConventionalUnit }
     * {@link AbstractGML }
     * {@link CountExtent }
     * {@link TriangulatedSurface }
     * {@link LinearRing }
     * {@link AbstractObject }
     * {@link AbstractSolid }
     * {@link MultiSolidCoverage }
     * {@link MultiGeometry }
     * {@link OperationParameterGroup }
     * {@link RectifiedGridCoverage }
     * {@link TemporalDatumUpperCase }
     * {@link Definition }
     * {@link AbstractDatum }
     * {@link AbstractSurface }
     * {@link AbstractContinuousCoverage }
     * {@link Count }
     * {@link AbstractImplicitGeometry }
     * {@link AbstractTimeGeometricPrimitive }
     * {@link MultiPointCoverage }
     * {@link GeodeticCRS }
     * {@link Point }
     * {@link BaseUnit }
     * {@link Ring }
     * {@link AbstractTimeComplex }
     * {@link CompositeCurve }
     * {@link AbstractTimeObject }
     * {@link AbstractDiscreteCoverage }
     * {@link TopoComplex }
     * {@link OrientableSurface }
     * {@link EngineeringDatumUpperCase }
     * {@link AbstractCRS }
     * {@link BSpline }
     * {@link FeatureCollection }
     * {@link CategoryExtent }
     * {@link ch.ehi.oereb.schemas.gml._3_2.Boolean }
     * {@link CountList }
     * {@link Transformation }
     * {@link ParameterValueGroup }
     * {@link DerivedCRS }
     * {@link ArcByBulge }
     * {@link GeodesicString }
     * {@link AffinePlacement }
     * {@link Bag }
     * {@link TimeReferenceSystem }
     * {@link GridFunction }
     * {@link Geodesic }
     * {@link TimeClock }
     * {@link OperationMethod }
     * {@link TimeEdge }
     * {@link OperationParameterUpperCase }
     * {@link QuantityExtent }
     * {@link CompositeSurface }
     * {@link AbstractGeometricAggregate }
     * {@link AbstractGeneralOperationParameter }
     * {@link CartesianCSUpperCase }
     * {@link AbstractCurveSegment }
     * {@link AbstractTopology }
     * {@link MultiSurfaceCoverage }
     * {@link AbstractGeneralTransformation }
     * {@link MultiCurve }
     * {@link AbstractTimeTopologyPrimitive }
     * {@link CompositeValue }
     * {@link DataBlock }
     * {@link TimeCoordinateSystem }
     * {@link CompoundCRS }
     * {@link ConversionUpperCase }
     * {@link Tin }
     * {@link TimeOrdinalReferenceSystem }
     * {@link ArcStringByBulge }
     * {@link PassThroughOperation }
     * {@link Clothoid }
     * {@link Polygon }
     * {@link Grid }
     * {@link Observation }
     * {@link AffineCSUpperCase }
     * {@link AbstractSingleCRS }
     * {@link ObliqueCartesianCS }
     * {@link GeocentricCRS }
     * {@link MultiCurveCoverage }
     * {@link DirectedObservation }
     * {@link ValueArray }
     * {@link LinearCSUpperCase }
     * {@link Array }
     * {@link EngineeringCRS }
     * {@link Circle }
     * {@link Arc }
     * {@link CompositeSolid }
     * {@link TemporalCRS }
     * {@link LineString }
     * {@link AbstractScalarValue }
     * {@link DynamicFeature }
     * {@link DirectedObservationAtDistance }
     * {@link Face }
     * {@link GenericMetaData }
     * {@link AbstractMetaData }
     * {@link OrientableCurve }
     * {@link CoverageFunction }
     * {@link VerticalDatumUpperCase }
     * {@link AbstractFeature }
     * {@link PrimeMeridianUpperCase }
     * {@link AbstractCoverage }
     * {@link TimeCSUpperCase }
     * {@link ImageDatumUpperCase }
     * {@link MultiPoint }
     * {@link Curve }
     * {@link Shell }
     * {@link DefinitionProxy }
     * {@link TopoSolid }
     * {@link Edge }
     * {@link AbstractScalarValueList }
     * {@link AbstractTopoPrimitive }
     * {@link PolarCSUpperCase }
     * {@link ParameterValueUpperCase }
     * {@link UserDefinedCSUpperCase }
     * {@link MovingObjectStatus }
     * {@link AbstractCoordinateOperation }
     * {@link Surface }
     * {@link AbstractTimeSlice }
     * {@link Node }
     * {@link DynamicFeatureCollection }
     * {@link UnitDefinition }
     * {@link Solid }
     * {@link Envelope }
     * {@link MultiSolid }
     * {@link TimeTopologyComplex }
     * {@link AbstractGeneralDerivedCRS }
     * {@link GridCoverage }
     * {@link TimeInstant }
     * {@link PolyhedralSurface }
     * {@link OffsetCurve }
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractObject() {
        if (abstractObject == null) {
            abstractObject = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractObject;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
