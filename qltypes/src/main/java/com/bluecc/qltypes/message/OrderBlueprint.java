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
    OrderBlueprint updateOrderItemShipGroupAssoc;
    OrderBlueprint addOrderRole;
    OrderBlueprint addOrderPaymentPreference;
    OrderBlueprint updateOrderItem;
    OrderBlueprint updateOrderRole;
    OrderBlueprint addOrderItemShipGroupList;
    OrderBlueprint removeOrderAdjustment;
    OrderBlueprint addOrderItemPriceInfo;
    OrderBlueprint addOrderAdjustmentList;
    CurrencyValue resetGrandTotal;
    OrderBlueprint updateOrderItemShipGroup;
    OrderBlueprint addWorkOrderItemFulfillmentList;
    OrderBlueprint removeOrderStatus;
    OrderBlueprint addOrderItemPriceInfoList;
    OrderBlueprint updateOrderHeaderNote;
    OrderBlueprint removeOrderContactMech;
    OrderBlueprint addOrderContactMechList;
    OrderBlueprint removeWorkOrderItemFulfillment;
    OrderBlueprint removeOrderItemPriceInfo;
    OrderBlueprint removeOrderItemShipGroup;
    OrderBlueprint addOrderItemShipGroup;
    OrderBlueprint updateOrderAdjustment;
    OrderBlueprint removeOrderPaymentPreference;
    OrderBlueprint removeOrderItem;
    OrderBlueprint modifyOrderType;
    OrderBlueprint updateOrderItemPriceInfo;
    OrderBlueprint addOrderContactMech;
    OrderBlueprint addOrderPaymentPreferenceList;
    OrderBlueprint updateOrderPaymentPreference;
    OrderBlueprint addOrderItemShipGroupAssoc;
    OrderBlueprint updateOrderContactMech;
    OrderBlueprint addOrderStatusList;
    OrderBlueprint addOrderHeaderNote;
    OrderBlueprint addOrderRoleList;
    OrderBlueprint addOrderHeaderNoteList;
    OrderBlueprint removeOrderItemShipGroupAssoc;
    OrderBlueprint updateWorkOrderItemFulfillment;
    OrderBlueprint addOrderAdjustment;
    OrderBlueprint addOrderItemShipGroupAssocList;
    OrderBlueprint addWorkOrderItemFulfillment;
    OrderBlueprint updateOrderStatus;
    OrderBlueprint addOrderItemList;
    OrderBlueprint addOrderStatus;
    OrderBlueprint addOrderItem;
    OrderBlueprint removeOrderRole;
    OrderBlueprint removeOrderHeaderNote;
}



