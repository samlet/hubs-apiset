package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ModelEntity {
    String name;
    String title;
    Boolean combine;
    String description;
    List<ModelEntityFieldsEntry> fields;
    List<ModelEntityRelationsEntry> relations;
    String pkg;
    StringsValue keys;
    List<ModelRelation> nonAutoRels;
    String proto;
}



