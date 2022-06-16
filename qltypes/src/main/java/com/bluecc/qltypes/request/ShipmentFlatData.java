package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentFlatData {
    String shipmentId;
    String shipmentTypeId;
    String statusId;
    String primaryOrderId;
    String primaryReturnId;
    String primaryShipGroupSeqId;
    String picklistBinId;
    Timestamp estimatedReadyDate;
    Timestamp estimatedShipDate;
    String estimatedShipWorkEffId;
    Timestamp estimatedArrivalDate;
    String estimatedArrivalWorkEffId;
    Timestamp latestCancelDate;
    Currency estimatedShipCost;
    String currencyUomId;
    String handlingInstructions;
    String originFacilityId;
    String destinationFacilityId;
    String originContactMechId;
    String originTelecomNumberId;
    String destinationContactMechId;
    String destinationTelecomNumberId;
    String partyIdTo;
    String partyIdFrom;
    Currency additionalShippingCharge;
    String addtlShippingChargeDesc;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



