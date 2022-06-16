package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ModelField {
    String name;
    String type;
    boolean pk;
    boolean notNull;
    boolean internal;
}



