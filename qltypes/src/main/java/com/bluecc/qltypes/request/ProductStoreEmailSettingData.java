package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreEmailSettingData {
    String productStoreId;
    String emailType;
    String bodyScreenLocation;
    String xslfoAttachScreenLocation;
    String fromAddress;
    String ccAddress;
    String bccAddress;
    String subject;
    String contentType;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



