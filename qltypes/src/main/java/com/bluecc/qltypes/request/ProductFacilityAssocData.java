package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFacilityAssocData {
    String productId;
    String facilityId;
    String facilityIdTo;
    String facilityAssocTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    long sequenceNum;
    long transitTime;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



