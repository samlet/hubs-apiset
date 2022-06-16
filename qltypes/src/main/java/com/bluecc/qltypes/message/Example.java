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
    long exampleSize;
    TimestampValue exampleDate;
    TimestampValue anotherDate;
    String anotherText;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    TypesEntity type;
    ExampleStatusCollection exampleStatuses;
    ExampleItemCollection exampleItems;
    ListItemProtoValue subview;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return exampleId;
    }
}



