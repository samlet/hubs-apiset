package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackageRouteSeg implements WithKey{
    String shipmentId;
    String shipmentPackageSeqId;
    String shipmentRouteSegmentId;
    String trackingCode;
    String boxNumber;
    String labelImage;
    String labelIntlSignImage;
    String labelHtml;
    String labelPrinted;
    String internationalInvoice;
    CurrencyValue packageTransportCost;
    CurrencyValue packageServiceCost;
    CurrencyValue packageOtherCost;
    CurrencyValue codAmount;
    CurrencyValue insuredAmount;
    String currencyUomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    Shipment shipment;
    FieldCatsValue cats;
    String proto;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



