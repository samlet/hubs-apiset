package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TemporalBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    TemporalExpression entity;
    List<ResponseValue> response;
    TemporalBlueprint addFromTemporalExpressionAssocList;
    TemporalBlueprint removeFromTemporalExpressionAssoc;
    TemporalBlueprint updateToTemporalExpressionAssoc;
    TemporalBlueprint addFromTemporalExpressionAssoc;
    TemporalBlueprint addToTemporalExpressionAssoc;
    TemporalBlueprint updateFromTemporalExpressionAssoc;
    TemporalBlueprint removeToTemporalExpressionAssoc;
    TemporalBlueprint addToTemporalExpressionAssocList;
}



