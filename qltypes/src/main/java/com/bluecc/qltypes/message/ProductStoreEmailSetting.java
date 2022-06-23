package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreEmailSetting implements WithKey{
    String productStoreId;
    String emailType;
    String bodyScreenLocation;
    String xslfoAttachScreenLocation;
    String fromAddress;
    String ccAddress;
    String bccAddress;
    String subject;
    String contentType;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ProductStore productStore;
    FieldCatsValue cats;
    String proto;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



