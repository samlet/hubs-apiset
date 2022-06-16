package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FieldCatsValue {
    StructValue series;
    StructValue measure;
    List<MapEntry> identity;
    List<MapEntry> describe;
    List<MapEntry> storage;
    String entity;
}



