package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentAssocData {
    String contentId;
    String contentIdTo;
    String contentAssocTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    String contentAssocPredicateId;
    String dataSourceId;
    Long sequenceNum;
    String mapKey;
    Long upperCoordinate;
    Long leftCoordinate;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



