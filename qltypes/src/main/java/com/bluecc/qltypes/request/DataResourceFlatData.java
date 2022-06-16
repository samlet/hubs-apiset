package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataResourceFlatData {
    String dataResourceId;
    String dataResourceTypeId;
    String dataTemplateTypeId;
    String dataCategoryId;
    String dataSourceId;
    String statusId;
    String dataResourceName;
    String localeString;
    String mimeTypeId;
    String characterSetId;
    String objectInfo;
    String surveyId;
    String surveyResponseId;
    String relatedDetailId;
    String isPublic;
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



