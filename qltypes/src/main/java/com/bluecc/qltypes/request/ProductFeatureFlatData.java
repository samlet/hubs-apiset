package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFeatureFlatData {
    String productFeatureId;
    String productFeatureTypeId;
    String productFeatureCategoryId;
    String description;
    String uomId;
    FixedPoint numberSpecified;
    Currency defaultAmount;
    long defaultSequenceNum;
    String abbrev;
    String idCode;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



