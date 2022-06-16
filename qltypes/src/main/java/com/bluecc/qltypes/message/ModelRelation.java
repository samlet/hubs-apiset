package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ModelRelation {
    String name;
    String type;
    String relEntityName;
    String title;
    List<MapEntry> keymaps;
    boolean autoRelation;
    ModelEntity relModel;
}



