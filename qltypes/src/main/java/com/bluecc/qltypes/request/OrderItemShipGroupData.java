package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemShipGroupData {
    String orderId;
    String shipGroupSeqId;
    String shipmentMethodTypeId;
    String supplierPartyId;
    String supplierAgreementId;
    String vendorPartyId;
    String carrierPartyId;
    String carrierRoleTypeId;
    String facilityId;
    String contactMechId;
    String telecomContactMechId;
    String trackingNumber;
    String shippingInstructions;
    String maySplit;
    String giftMessage;
    String isGift;
    Timestamp shipAfterDate;
    Timestamp shipByDate;
    Timestamp estimatedShipDate;
    Timestamp estimatedDeliveryDate;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



