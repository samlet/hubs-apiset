package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentFlatData {
    String contentId;
    String contentTypeId;
    String ownerContentId;
    String decoratorContentId;
    String instanceOfContentId;
    String dataResourceId;
    String templateDataResourceId;
    String dataSourceId;
    String statusId;
    String privilegeEnumId;
    String serviceName;
    String customMethodId;
    String contentName;
    String description;
    String localeString;
    String mimeTypeId;
    String characterSetId;
    Long childLeafCount;
    Long childBranchCount;
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



