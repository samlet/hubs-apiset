package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderReturnBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ReturnHeader entity;
    List<ResponseValue> response;
    OrderReturnBlueprint addReturnItem;
    OrderReturnBlueprint addReturnItemBillingList;
    OrderReturnBlueprint removeReturnItem;
    OrderReturnBlueprint removeReturnItemShipment;
    OrderReturnBlueprint addReturnStatus;
    OrderReturnBlueprint updateReturnItemShipment;
    OrderReturnBlueprint updateReturnItemBilling;
    OrderReturnBlueprint addReturnItemList;
    OrderReturnBlueprint addReturnItemShipment;
    OrderReturnBlueprint addReturnItemShipmentList;
    OrderReturnBlueprint removeReturnItemBilling;
    OrderReturnBlueprint updateReturnStatus;
    OrderReturnBlueprint removeReturnStatus;
    OrderReturnBlueprint addReturnAdjustment;
    OrderReturnBlueprint addReturnAdjustmentList;
    OrderReturnBlueprint updateReturnItem;
    OrderReturnBlueprint removeReturnAdjustment;
    OrderReturnBlueprint updateReturnAdjustment;
    OrderReturnBlueprint addReturnItemBilling;
    OrderReturnBlueprint addReturnStatusList;
}



