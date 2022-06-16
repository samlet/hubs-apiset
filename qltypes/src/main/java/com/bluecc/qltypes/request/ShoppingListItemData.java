package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingListItemData {
    String shoppingListId;
    String shoppingListItemSeqId;
    String productId;
    FixedPoint quantity;
    Currency modifiedPrice;
    Timestamp reservStart;
    FixedPoint reservLength;
    FixedPoint reservPersons;
    FixedPoint quantityPurchased;
    String configId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



