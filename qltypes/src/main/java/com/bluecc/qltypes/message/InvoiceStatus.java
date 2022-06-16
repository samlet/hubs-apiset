package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InvoiceStatus implements WithKey{
    String statusId;
    String invoiceId;
    TimestampValue statusDate;
    String changeByUserLoginId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Invoice invoice;
    UserLogin changeByUserLogin;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



