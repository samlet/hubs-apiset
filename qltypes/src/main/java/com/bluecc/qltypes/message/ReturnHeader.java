package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnHeader implements WithKey{
    String returnId;
    String returnHeaderTypeId;
    String statusId;
    String createdBy;
    String fromPartyId;
    String toPartyId;
    String paymentMethodId;
    String finAccountId;
    String billingAccountId;
    TimestampValue entryDate;
    String originContactMechId;
    String destinationFacilityId;
    String needsInventoryReceive;
    String currencyUomId;
    String supplierRmaId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    Facility facility;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    ReturnAdjustmentCollection returnAdjustments;
    ReturnItemBillingCollection returnItemBillings;
    ModelEntity model;
    ReturnStatusCollection returnStatuses;
    String proto;
    ReturnItemShipmentCollection returnItemShipments;
    Party toParty;
    ReturnItemCollection returnItems;
    ContactMech contactMech;
    BillingAccount billingAccount;
    UserLogin userLogin;
    String format;
    Party party;
    @Override
    public String getKey() {
        return returnId;
    }
}



