package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfigItemBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductConfigItem entity;
    List<ResponseValue> response;
    ProductConfigItemBlueprint removeConfigItemProductConfigProduct;
    ProductConfigItemBlueprint updateConfigItemProductConfigOption;
    ProductConfigItemBlueprint addConfigItemProductConfigOption;
    ProductConfigItemBlueprint updateConfigItemProductConfigProduct;
    ProductConfigItemBlueprint addConfigItemProductConfigProductList;
    ProductConfigItemBlueprint removeConfigItemProductConfigOption;
    ProductConfigItemBlueprint addConfigItemProductConfigOptionList;
    ProductConfigItemBlueprint addConfigItemProductConfigProduct;
}



