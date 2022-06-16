package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStorePaymentSetting implements WithKey{
    String productStoreId;
    String paymentMethodTypeId;
    String paymentServiceTypeEnumId;
    String paymentService;
    String paymentCustomMethodId;
    String paymentGatewayConfigId;
    String paymentPropertiesPath;
    String applyToAllProducts;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ProductStore productStore;
    String format;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



