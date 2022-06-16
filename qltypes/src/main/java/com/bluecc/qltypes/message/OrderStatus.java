package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderStatus implements WithKey{
    String orderStatusId;
    String statusId;
    String orderId;
    String orderItemSeqId;
    String orderPaymentPreferenceId;
    TimestampValue statusDatetime;
    String statusUserLogin;
    String changeReason;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    OrderHeader orderHeader;
    FieldCatsValue cats;
    String format;
    UserLogin userLogin;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return orderStatusId;
    }
}



