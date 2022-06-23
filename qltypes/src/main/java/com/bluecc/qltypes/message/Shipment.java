package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Shipment implements WithKey{
    String shipmentId;
    String shipmentTypeId;
    String statusId;
    String primaryOrderId;
    String primaryReturnId;
    String primaryShipGroupSeqId;
    String picklistBinId;
    TimestampValue estimatedReadyDate;
    TimestampValue estimatedShipDate;
    String estimatedShipWorkEffId;
    TimestampValue estimatedArrivalDate;
    String estimatedArrivalWorkEffId;
    TimestampValue latestCancelDate;
    CurrencyValue estimatedShipCost;
    String currencyUomId;
    String handlingInstructions;
    String originFacilityId;
    String destinationFacilityId;
    String originContactMechId;
    String originTelecomNumberId;
    String destinationContactMechId;
    String destinationTelecomNumberId;
    String partyIdTo;
    String partyIdFrom;
    CurrencyValue additionalShippingCharge;
    String addtlShippingChargeDesc;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    ContactMech destContactMech;
    ShipmentReceiptCollection shipmentReceipts;
    ShipmentPackageContentCollection shipmentPackageContents;
    WorkEffort estimatedArrivalWorkEffort;
    ShipmentItemCollection shipmentItems;
    String proto;
    Party toParty;
    ShipmentPackageRouteSegCollection shipmentPackageRouteSegs;
    ModelEntity model;
    ShipmentItemBillingCollection shipmentItemBillings;
    ReturnHeader primaryReturnHeader;
    OrderHeader primaryOrderHeader;
    ShipmentRouteSegmentCollection shipmentRouteSegments;
    WorkEffort estimatedShipWorkEffort;
    Facility originFacility;
    Facility destinationFacility;
    ShippingDocumentCollection shippingDocuments;
    ItemIssuanceCollection itemIssuances;
    FieldCatsValue cats;
    ShipmentStatusCollection shipmentStatuses;
    ShipmentPackageCollection shipmentPackages;
    ContactMech originContactMech;
    Party fromParty;
    String format;
    @Override
    public String getKey() {
        return shipmentId;
    }
}



