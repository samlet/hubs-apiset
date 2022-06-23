package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContactMechCollection {
    List<ContactMech> values;
    String nextPageToken;
    String regionId;
    List<ContactMechWithEmailAddress> matchEmailAddress;
    List<ContactMechWithTelecomNumber> matchTelecomNumber;
    List<ContactMechWithPostalAddress> matchPostalAddress;
    ContactMechCollection filter;
}



