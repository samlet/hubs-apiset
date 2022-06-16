package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderFact implements WithKey{
    String orderId;
    String invoiceId;
    String paymentId;
    String paymentGatewayResponseId;
    String orderPaymentPreferenceId;
    String billingAccountId;
    String shipmentId;
    String orderFactTypeId;
    String statusId;
    String tenantId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    FieldCatsValue cats;
    OrderFactStatusCollection orderFactStatuses;
    ListItemProtoValue subview;
    String proto;
    TypesEntity type;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return orderId;
    }
}



