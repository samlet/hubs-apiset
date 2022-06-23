package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FactProto implements WithKey{
    String factId;
    String data;
    String factProtoTypeId;
    String statusId;
    String tenantId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    FieldCatsValue cats;
    ListItemProtoValue subview;
    TypesEntity type;
    String proto;
    FactProtoStatusCollection factProtoStatuses;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return factId;
    }
}



