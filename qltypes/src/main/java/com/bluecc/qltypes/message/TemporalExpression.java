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
    Long integer1;
    Long integer2;
    String string1;
    String string2;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    TemporalExpressionAssocCollection toTemporalExpressionAssocs;
    ListItemProtoValue subview;
    TemporalExpressionAssocCollection fromTemporalExpressionAssocs;
    @Override
    public String getKey() {
        return tempExprId;
    }
}



