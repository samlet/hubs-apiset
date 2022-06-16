package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfigData {
    String productId;
    String configItemId;
    long sequenceNum;
    Timestamp fromDate;
    String description;
    String longDescription;
    String configTypeId;
    String defaultConfigOptionId;
    Timestamp thruDate;
    String isMandatory;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



