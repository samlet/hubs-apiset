package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class CurrencyValue {
    String currencyUomId;
    String value;
    String decimal;
    Double floatValue;
}



