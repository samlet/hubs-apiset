package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentRouteSegmentData {
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
    FixedPoint billingWeight;
    String billingWeightUomId;
    Currency actualTransportCost;
    Currency actualServiceCost;
    Currency actualOtherCost;
    Currency actualCost;
    String currencyUomId;
    Timestamp actualStartDate;
    Timestamp actualArrivalDate;
    Timestamp estimatedStartDate;
    Timestamp estimatedArrivalDate;
    String trackingIdNumber;
    String trackingDigest;
    String updatedByUserLoginId;
    Timestamp lastUpdatedDate;
    String homeDeliveryType;
    Timestamp homeDeliveryDate;
    String thirdPartyAccountNumber;
    String thirdPartyPostalCode;
    String thirdPartyCountryGeoCode;
    String upsHighValueReport;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



