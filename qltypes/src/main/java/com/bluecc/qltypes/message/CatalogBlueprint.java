package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class CatalogBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProdCatalog entity;
    List<ResponseValue> response;
    CatalogBlueprint addProdCatalogCategoryList;
    CatalogBlueprint addProdCatalogCategory;
    CatalogBlueprint updateProdCatalogCategory;
    CatalogBlueprint removeProdCatalogCategory;
}



