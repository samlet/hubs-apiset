package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TemporalExpressionAssoc implements WithKey{
    String fromTempExprId;
    String toTempExprId;
    String exprAssocType;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    TemporalExpression toTemporalExpression;
    ModelEntity model;
    TemporalExpression fromTemporalExpression;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



