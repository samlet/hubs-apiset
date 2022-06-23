package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleData {
    String exampleId;
    String exampleTypeId;
    String statusId;
    String exampleName;
    String description;
    String longDescription;
    String comments;
    Long exampleSize;
    Timestamp exampleDate;
    Timestamp anotherDate;
    String anotherText;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



