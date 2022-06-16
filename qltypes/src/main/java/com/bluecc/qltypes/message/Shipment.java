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
    ContactMech destContactMech;
    ShipmentItemCollection shipmentItems;
    Facility destinationFacility;
    ShipmentPackageContentCollection shipmentPackageContents;
    String format;
    ShipmentReceiptCollection shipmentReceipts;
    FieldCatsValue cats;
    WorkEffort estimatedArrivalWorkEffort;
    ContactMech originContactMech;
    ShipmentItemBillingCollection shipmentItemBillings;
    ShipmentRouteSegmentCollection shipmentRouteSegments;
    WorkEffort estimatedShipWorkEffort;
    ListItemProtoValue subview;
    OrderHeader primaryOrderHeader;
    String proto;
    Party fromParty;
    ShippingDocumentCollection shippingDocuments;
    Facility originFacility;
    Party toParty;
    ReturnHeader primaryReturnHeader;
    ModelEntity model;
    ShipmentPackageRouteSegCollection shipmentPackageRouteSegs;
    ShipmentPackageCollection shipmentPackages;
    ShipmentStatusCollection shipmentStatuses;
    ItemIssuanceCollection itemIssuances;
    @Override
    public String getKey() {
        return shipmentId;
    }
}



