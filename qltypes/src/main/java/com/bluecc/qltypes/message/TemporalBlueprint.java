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
    TemporalBlueprint addToTemporalExpressionAssocList;
    TemporalBlueprint updateToTemporalExpressionAssoc;
    TemporalBlueprint updateFromTemporalExpressionAssoc;
    TemporalBlueprint addToTemporalExpressionAssoc;
    TemporalBlueprint removeToTemporalExpressionAssoc;
    TemporalBlueprint addFromTemporalExpressionAssocList;
    TemporalBlueprint removeFromTemporalExpressionAssoc;
    TemporalBlueprint addFromTemporalExpressionAssoc;
}



