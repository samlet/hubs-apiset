package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStorePaymentSettingData {
    String productStoreId;
    String paymentMethodTypeId;
    String paymentServiceTypeEnumId;
    String paymentService;
    String paymentCustomMethodId;
    String paymentGatewayConfigId;
    String paymentPropertiesPath;
    String applyToAllProducts;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



