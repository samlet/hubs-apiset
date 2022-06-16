package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroupRoleCollection {
    List<ProductStoreGroupRole> values;
    String nextPageToken;
    String regionId;
}



