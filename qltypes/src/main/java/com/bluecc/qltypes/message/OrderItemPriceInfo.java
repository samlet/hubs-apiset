package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemPriceInfo implements WithKey{
    String orderItemPriceInfoId;
    String orderId;
    String orderItemSeqId;
    String productPriceRuleId;
    String productPriceActionSeqId;
    CurrencyValue modifyAmount;
    String description;
    String rateCode;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    String format;
    FieldCatsValue cats;
    OrderHeader orderHeader;
    ModelEntity model;
    @Override
    public String getKey() {
        return orderItemPriceInfoId;
    }
}



