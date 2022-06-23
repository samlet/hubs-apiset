package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WebSite implements WithKey{
    String webSiteId;
    String siteName;
    String httpHost;
    String httpPort;
    String httpsHost;
    String httpsPort;
    String enableHttps;
    String webappPath;
    String standardContentPrefix;
    String secureContentPrefix;
    String cookieDomain;
    String visualThemeSetId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String productStoreId;
    String allowProductStoreChange;
    String hostedPathAlias;
    String isDefault;
    String displayMaintenancePage;
    String tenantId;
    FieldCatsValue cats;
    String proto;
    ProductStore productStore;
    ModelEntity model;
    String format;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return webSiteId;
    }
}



