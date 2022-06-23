package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Example entity;
    List<ResponseValue> response;
    ExampleBlueprint updateExampleStatus;
    ExampleBlueprint addExampleStatusList;
    ExampleBlueprint removeExampleStatus;
    ExampleBlueprint removeExampleItem;
    ExampleBlueprint addExampleItemList;
    ExampleBlueprint addExampleItem;
    ExampleBlueprint modifyExampleType;
    ExampleBlueprint updateExampleItem;
    ExampleBlueprint addExampleStatus;
}



