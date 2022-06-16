package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TemporalExpression implements WithKey{
    String tempExprId;
    String tempExprTypeId;
    String description;
    TimestampValue date1;
    TimestampValue date2;
    long integer1;
    long integer2;
    String string1;
    String string2;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    TemporalExpressionAssocCollection fromTemporalExpressionAssocs;
    TemporalExpressionAssocCollection toTemporalExpressionAssocs;
    String format;
    ListItemProtoValue subview;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return tempExprId;
    }
}



