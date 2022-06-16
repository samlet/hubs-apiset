package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProdCatalogCategoryFlatData {
    String prodCatalogId;
    String productCategoryId;
    String prodCatalogCategoryTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    long sequenceNum;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



