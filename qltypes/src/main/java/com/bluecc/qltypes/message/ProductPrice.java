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
    Product product;
    Party taxAuthorityParty;
    ProductStoreGroup productStoreGroup;
    ModelEntity model;
    FieldCatsValue cats;
    UserLogin lastmodifiedbyuserlogin;
    String format;
    UserLogin createdbyuserlogin;
    String desc;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



