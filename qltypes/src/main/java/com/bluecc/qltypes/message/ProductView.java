package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductView {
    String productId;
    String productTypeId;
    String primaryProductCategoryId;
    String brandName;
    String comments;
    String productName;
    String description;
    String longDescription;
    String priceDetailText;
    String smallImageUrl;
    String mediumImageUrl;
    String largeImageUrl;
    String detailImageUrl;
    String originalImageUrl;
    String detailScreen;
    String inventoryMessage;
    String inventoryItemTypeId;
    String currencyUomId;
    CurrencyValue defaultPrice;
    CurrencyValue listPrice;
    List<String> categories;
    String proto;
}



