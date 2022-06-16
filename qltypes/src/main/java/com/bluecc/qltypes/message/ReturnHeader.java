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
    String proto;
    ContactMech contactMech;
    Facility facility;
    ReturnItemCollection returnItems;
    Party party;
    ReturnItemBillingCollection returnItemBillings;
    FieldCatsValue cats;
    UserLogin userLogin;
    ReturnItemShipmentCollection returnItemShipments;
    ReturnAdjustmentCollection returnAdjustments;
    Party toParty;
    ModelEntity model;
    ReturnStatusCollection returnStatuses;
    ListItemProtoValue subview;
    String format;
    BillingAccount billingAccount;
    @Override
    public String getKey() {
        return returnId;
    }
}



