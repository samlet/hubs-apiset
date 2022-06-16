package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemShipGroup implements WithKey{
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
    TimestampValue shipAfterDate;
    TimestampValue shipByDate;
    TimestampValue estimatedShipDate;
    TimestampValue estimatedDeliveryDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    Party carrierParty;
    ContactMech contactMech;
    String proto;
    ContactMech telecomContactMech;
    Facility facility;
    Party supplierParty;
    Agreement supplierAgreement;
    String format;
    Party vendorParty;
    FieldCatsValue cats;
    OrderHeader orderHeader;
    @Override
    public String getKey() {
        return id;
    }
}



