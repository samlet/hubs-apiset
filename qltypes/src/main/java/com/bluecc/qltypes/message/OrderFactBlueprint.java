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
    OrderFactBlueprint addOrderFactStatusList;
    OrderFactBlueprint addOrderFactStatus;
    OrderFactBlueprint updateOrderFactStatus;
    OrderFactBlueprint modifyOrderFactType;
    OrderFactBlueprint removeOrderFactStatus;
}



