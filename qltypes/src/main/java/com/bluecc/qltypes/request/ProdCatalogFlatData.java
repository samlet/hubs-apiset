package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProdCatalogFlatData {
    String prodCatalogId;
    String catalogName;
    String useQuickAdd;
    String styleSheet;
    String headerLogo;
    String contentPathPrefix;
    String templatePathPrefix;
    String viewAllowPermReqd;
    String purchaseAllowPermReqd;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



