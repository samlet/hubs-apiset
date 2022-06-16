package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SupplierProduct implements WithKey{
    String productId;
    String partyId;
    TimestampValue availableFromDate;
    TimestampValue availableThruDate;
    String supplierPrefOrderId;
    String supplierRatingTypeId;
    FixedPointValue standardLeadTimeDays;
    FixedPointValue minimumOrderQuantity;
    FixedPointValue orderQtyIncrements;
    FixedPointValue unitsIncluded;
    String quantityUomId;
    String agreementId;
    String agreementItemSeqId;
    CurrencyValue lastPrice;
    CurrencyValue shippingPrice;
    String currencyUomId;
    String supplierProductName;
    String supplierProductId;
    String canDropShip;
    String comments;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product product;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    Party party;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



