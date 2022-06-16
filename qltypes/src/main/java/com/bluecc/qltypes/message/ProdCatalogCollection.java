package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProdCatalogCollection {
    List<ProdCatalog> values;
    String nextPageToken;
    String regionId;
    ProdCatalogCollection filter;
}



