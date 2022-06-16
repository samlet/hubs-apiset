package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackageRouteSegData {
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
    Currency packageTransportCost;
    Currency packageServiceCost;
    Currency packageOtherCost;
    Currency codAmount;
    Currency insuredAmount;
    String currencyUomId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



