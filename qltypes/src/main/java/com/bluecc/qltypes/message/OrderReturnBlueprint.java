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
    OrderReturnBlueprint addReturnItemShipment;
    OrderReturnBlueprint removeReturnItemShipment;
    OrderReturnBlueprint addReturnItemShipmentList;
    OrderReturnBlueprint removeReturnStatus;
    OrderReturnBlueprint updateReturnItem;
    OrderReturnBlueprint removeReturnAdjustment;
    OrderReturnBlueprint updateReturnAdjustment;
    OrderReturnBlueprint addReturnItemBillingList;
    OrderReturnBlueprint updateReturnStatus;
    OrderReturnBlueprint updateReturnItemBilling;
    OrderReturnBlueprint removeReturnItemBilling;
    OrderReturnBlueprint addReturnItem;
    OrderReturnBlueprint addReturnItemBilling;
    OrderReturnBlueprint addReturnStatus;
    OrderReturnBlueprint addReturnItemList;
    OrderReturnBlueprint addReturnAdjustment;
    OrderReturnBlueprint removeReturnItem;
    OrderReturnBlueprint addReturnStatusList;
    OrderReturnBlueprint addReturnAdjustmentList;
    OrderReturnBlueprint updateReturnItemShipment;
}



