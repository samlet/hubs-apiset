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
    OrderHeader orderHeader;
    String proto;
    Agreement supplierAgreement;
    ContactMech telecomContactMech;
    ModelEntity model;
    Facility facility;
    FieldCatsValue cats;
    ContactMech contactMech;
    Party supplierParty;
    Party vendorParty;
    Party carrierParty;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



