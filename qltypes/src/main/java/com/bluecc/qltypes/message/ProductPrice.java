package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPrice implements WithKey{
    String productId;
    String productPriceTypeId;
    String productPricePurposeId;
    String currencyUomId;
    String productStoreGroupId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    CurrencyValue price;
    String termUomId;
    String customPriceCalcService;
    CurrencyValue priceWithoutTax;
    CurrencyValue priceWithTax;
    CurrencyValue taxAmount;
    FixedPointValue taxPercentage;
    String taxAuthPartyId;
    String taxAuthGeoId;
    String taxInPrice;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    UserLogin createdbyuserlogin;
    String format;
    UserLogin lastmodifiedbyuserlogin;
    String proto;
    ProductStoreGroup productStoreGroup;
    Product product;
    FieldCatsValue cats;
    ModelEntity model;
    Party taxAuthorityParty;
    String desc;
    @Override
    public String getKey() {
        return id;
    }
}



