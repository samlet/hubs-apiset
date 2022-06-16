package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderStatusFlatData {
    String orderStatusId;
    String statusId;
    String orderId;
    String orderItemSeqId;
    String orderPaymentPreferenceId;
    Timestamp statusDatetime;
    String statusUserLogin;
    String changeReason;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



