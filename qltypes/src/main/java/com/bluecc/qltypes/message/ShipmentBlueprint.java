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
    ShipmentBlueprint removeShipmentReceipt;
    ShipmentBlueprint addShipmentItemBillingList;
    ShipmentBlueprint addShipmentPackageContentList;
    ShipmentBlueprint updateShipmentPackageContent;
    ShipmentBlueprint removeAcctgTrans;
    ShipmentBlueprint updateShipmentReceipt;
    ShipmentBlueprint addShipmentStatusList;
    ShipmentBlueprint updateAcctgTrans;
    ShipmentBlueprint updateShipmentPackageRouteSeg;
    ShipmentBlueprint removeShipmentRouteSegment;
    ShipmentBlueprint removeShippingDocument;
    ShipmentBlueprint updateShipmentItem;
    ShipmentBlueprint addShipmentItem;
    ShipmentBlueprint addAcctgTransList;
    ShipmentBlueprint addShipmentReceipt;
    ShipmentBlueprint addShipmentPackageRouteSeg;
    ShipmentBlueprint addShipmentPackageList;
    ShipmentBlueprint updateShipmentRouteSegment;
    ShipmentBlueprint addShipmentRouteSegment;
    ShipmentBlueprint addShipmentStatus;
    ShipmentBlueprint addItemIssuance;
    ShipmentBlueprint updateShippingDocument;
    ShipmentBlueprint updateShipmentItemBilling;
    ShipmentBlueprint addShipmentPackageRouteSegList;
    ShipmentBlueprint addShipmentPackageContent;
    ShipmentBlueprint addShippingDocumentList;
    ShipmentBlueprint addShippingDocument;
    ShipmentBlueprint removeShipmentItemBilling;
    ShipmentBlueprint addShipmentPackage;
    ShipmentBlueprint addShipmentItemList;
    ShipmentBlueprint removeShipmentPackageContent;
    ShipmentBlueprint removeShipmentItem;
    ShipmentBlueprint removeShipmentStatus;
    ShipmentBlueprint addShipmentReceiptList;
    ShipmentBlueprint addItemIssuanceList;
    ShipmentBlueprint updateItemIssuance;
    ShipmentBlueprint addShipmentRouteSegmentList;
    ShipmentBlueprint removeShipmentPackage;
    ShipmentBlueprint removeShipmentPackageRouteSeg;
    ShipmentBlueprint addAcctgTrans;
    ShipmentBlueprint updateShipmentStatus;
    ShipmentBlueprint removeItemIssuance;
    ShipmentBlueprint updateShipmentPackage;
    ShipmentBlueprint addShipmentItemBilling;
}



