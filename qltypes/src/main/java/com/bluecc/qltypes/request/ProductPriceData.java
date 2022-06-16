package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPriceData {
    String productId;
    String productPriceTypeId;
    String productPricePurposeId;
    String currencyUomId;
    String productStoreGroupId;
    Timestamp fromDate;
    Timestamp thruDate;
    Currency price;
    String termUomId;
    String customPriceCalcService;
    Currency priceWithoutTax;
    Currency priceWithTax;
    Currency taxAmount;
    FixedPoint taxPercentage;
    String taxAuthPartyId;
    String taxAuthGeoId;
    String taxInPrice;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



