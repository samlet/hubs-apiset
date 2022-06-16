package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TemporalExpressionFlatData {
    String tempExprId;
    String tempExprTypeId;
    String description;
    Timestamp date1;
    Timestamp date2;
    long integer1;
    long integer2;
    String string1;
    String string2;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



