package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    OrderHeader entity;
    List<ResponseValue> response;
    OrderBlueprint removeOrderStatus;
    OrderBlueprint removeOrderItemPriceInfo;
    OrderBlueprint addOrderItemPriceInfoList;
    OrderBlueprint addOrderItemShipGroupAssoc;
    OrderBlueprint addOrderContactMech;
    OrderBlueprint removeOrderItemShipGroupAssoc;
    OrderBlueprint addOrderRole;
    OrderBlueprint updateOrderPaymentPreference;
    OrderBlueprint updateWorkOrderItemFulfillment;
    OrderBlueprint removeOrderRole;
    OrderBlueprint removeOrderHeaderNote;
    OrderBlueprint addOrderItemPriceInfo;
    OrderBlueprint modifyOrderType;
    OrderBlueprint updateOrderContactMech;
    OrderBlueprint addWorkOrderItemFulfillmentList;
    OrderBlueprint updateOrderItemShipGroup;
    OrderBlueprint updateOrderAdjustment;
    OrderBlueprint updateOrderRole;
    OrderBlueprint removeWorkOrderItemFulfillment;
    CurrencyValue resetGrandTotal;
    OrderBlueprint removeOrderItem;
    OrderBlueprint removeOrderAdjustment;
    OrderBlueprint addOrderRoleList;
    OrderBlueprint addOrderItemList;
    OrderBlueprint addWorkOrderItemFulfillment;
    OrderBlueprint addOrderItemShipGroupList;
    OrderBlueprint addOrderItemShipGroup;
    OrderBlueprint addOrderStatus;
    OrderBlueprint addOrderAdjustment;
    OrderBlueprint addOrderPaymentPreferenceList;
    OrderBlueprint addOrderPaymentPreference;
    OrderBlueprint addOrderItem;
    OrderBlueprint updateOrderItemPriceInfo;
    OrderBlueprint updateOrderItem;
    OrderBlueprint addOrderAdjustmentList;
    OrderBlueprint removeOrderContactMech;
    OrderBlueprint addOrderStatusList;
    OrderBlueprint addOrderHeaderNote;
    OrderBlueprint addOrderContactMechList;
    OrderBlueprint addOrderItemShipGroupAssocList;
    OrderBlueprint removeOrderPaymentPreference;
    OrderBlueprint removeOrderItemShipGroup;
    OrderBlueprint updateOrderStatus;
    OrderBlueprint addOrderHeaderNoteList;
    OrderBlueprint updateOrderHeaderNote;
    OrderBlueprint updateOrderItemShipGroupAssoc;
}



