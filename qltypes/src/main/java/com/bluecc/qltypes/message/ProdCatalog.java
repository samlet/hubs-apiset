package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProdCatalog implements WithKey{
    String prodCatalogId;
    String catalogName;
    String useQuickAdd;
    String styleSheet;
    String headerLogo;
    String contentPathPrefix;
    String templatePathPrefix;
    String viewAllowPermReqd;
    String purchaseAllowPermReqd;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    ListItemProtoValue subview;
    String proto;
    ProdCatalogCategoryCollection prodCatalogCategories;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return prodCatalogId;
    }
}



