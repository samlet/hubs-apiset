package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderFactBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    OrderFact entity;
    List<ResponseValue> response;
    OrderFactBlueprint modifyOrderFactType;
    OrderFactBlueprint addOrderFactStatusList;
    OrderFactBlueprint updateOrderFactStatus;
    OrderFactBlueprint addOrderFactStatus;
    OrderFactBlueprint removeOrderFactStatus;
}



