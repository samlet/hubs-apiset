package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SupplierProductData {
    String productId;
    String partyId;
    Timestamp availableFromDate;
    Timestamp availableThruDate;
    String supplierPrefOrderId;
    String supplierRatingTypeId;
    FixedPoint standardLeadTimeDays;
    FixedPoint minimumOrderQuantity;
    FixedPoint orderQtyIncrements;
    FixedPoint unitsIncluded;
    String quantityUomId;
    String agreementId;
    String agreementItemSeqId;
    Currency lastPrice;
    Currency shippingPrice;
    String currencyUomId;
    String supplierProductName;
    String supplierProductId;
    String canDropShip;
    String comments;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



