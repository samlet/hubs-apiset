package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentRouteSegment implements WithKey{
    String shipmentId;
    String shipmentRouteSegmentId;
    String deliveryId;
    String originFacilityId;
    String destFacilityId;
    String originContactMechId;
    String originTelecomNumberId;
    String destContactMechId;
    String destTelecomNumberId;
    String carrierPartyId;
    String shipmentMethodTypeId;
    String carrierServiceStatusId;
    String carrierDeliveryZone;
    String carrierRestrictionCodes;
    String carrierRestrictionDesc;
    FixedPointValue billingWeight;
    String billingWeightUomId;
    CurrencyValue actualTransportCost;
    CurrencyValue actualServiceCost;
    CurrencyValue actualOtherCost;
    CurrencyValue actualCost;
    String currencyUomId;
    TimestampValue actualStartDate;
    TimestampValue actualArrivalDate;
    TimestampValue estimatedStartDate;
    TimestampValue estimatedArrivalDate;
    String trackingIdNumber;
    String trackingDigest;
    String updatedByUserLoginId;
    TimestampValue lastUpdatedDate;
    String homeDeliveryType;
    TimestampValue homeDeliveryDate;
    String thirdPartyAccountNumber;
    String thirdPartyPostalCode;
    String thirdPartyCountryGeoCode;
    String upsHighValueReport;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Party carrierParty;
    String format;
    Facility originFacility;
    FieldCatsValue cats;
    ContactMech destContactMech;
    ModelEntity model;
    String proto;
    Facility destFacility;
    ContactMech originContactMech;
    Shipment shipment;
    @Override
    public String getKey() {
        return id;
    }
}



