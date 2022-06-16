package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Shipment entity;
    List<ResponseValue> response;
    ShipmentBlueprint addShipmentRouteSegment;
    ShipmentBlueprint addShipmentItemBilling;
    ShipmentBlueprint removeShipmentPackageRouteSeg;
    ShipmentBlueprint addShipmentPackageContent;
    ShipmentBlueprint removeAcctgTrans;
    ShipmentBlueprint addShipmentReceiptList;
    ShipmentBlueprint addShipmentRouteSegmentList;
    ShipmentBlueprint removeShipmentStatus;
    ShipmentBlueprint addShippingDocumentList;
    ShipmentBlueprint updateShipmentItem;
    ShipmentBlueprint updateItemIssuance;
    ShipmentBlueprint addItemIssuance;
    ShipmentBlueprint updateShipmentReceipt;
    ShipmentBlueprint removeShipmentPackage;
    ShipmentBlueprint removeShippingDocument;
    ShipmentBlueprint removeShipmentReceipt;
    ShipmentBlueprint updateShipmentPackage;
    ShipmentBlueprint updateShipmentRouteSegment;
    ShipmentBlueprint addShipmentStatus;
    ShipmentBlueprint addAcctgTrans;
    ShipmentBlueprint addShipmentStatusList;
    ShipmentBlueprint addAcctgTransList;
    ShipmentBlueprint updateShipmentItemBilling;
    ShipmentBlueprint addShipmentItemList;
    ShipmentBlueprint updateShippingDocument;
    ShipmentBlueprint addShipmentItem;
    ShipmentBlueprint updateShipmentPackageContent;
    ShipmentBlueprint removeItemIssuance;
    ShipmentBlueprint updateShipmentStatus;
    ShipmentBlueprint addShipmentPackageContentList;
    ShipmentBlueprint updateAcctgTrans;
    ShipmentBlueprint addShipmentPackageRouteSegList;
    ShipmentBlueprint addShipmentPackageRouteSeg;
    ShipmentBlueprint removeShipmentItemBilling;
    ShipmentBlueprint addItemIssuanceList;
    ShipmentBlueprint addShipmentPackage;
    ShipmentBlueprint removeShipmentPackageContent;
    ShipmentBlueprint addShipmentPackageList;
    ShipmentBlueprint addShippingDocument;
    ShipmentBlueprint updateShipmentPackageRouteSeg;
    ShipmentBlueprint removeShipmentItem;
    ShipmentBlueprint addShipmentItemBillingList;
    ShipmentBlueprint addShipmentReceipt;
    ShipmentBlueprint removeShipmentRouteSegment;
}



