package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingListFlatData {
    String shoppingListId;
    String shoppingListTypeId;
    String parentShoppingListId;
    String productStoreId;
    String visitorId;
    String partyId;
    String listName;
    String description;
    String isPublic;
    String isActive;
    String currencyUom;
    String shipmentMethodTypeId;
    String carrierPartyId;
    String carrierRoleTypeId;
    String contactMechId;
    String paymentMethodId;
    String recurrenceInfoId;
    Timestamp lastOrderedDate;
    Timestamp lastAdminModified;
    String productPromoCodeId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



