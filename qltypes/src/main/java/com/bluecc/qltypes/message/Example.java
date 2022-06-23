package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Example implements WithKey{
    String exampleId;
    String exampleTypeId;
    String statusId;
    String exampleName;
    String description;
    String longDescription;
    String comments;
    Long exampleSize;
    TimestampValue exampleDate;
    TimestampValue anotherDate;
    String anotherText;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    ExampleStatusCollection exampleStatuses;
    ExampleItemCollection exampleItems;
    ModelEntity model;
    String proto;
    TypesEntity type;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return exampleId;
    }
}



