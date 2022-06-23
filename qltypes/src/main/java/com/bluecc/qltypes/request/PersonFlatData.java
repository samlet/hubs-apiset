package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PersonFlatData {
    String partyId;
    String salutation;
    String firstName;
    String middleName;
    String lastName;
    String personalTitle;
    String suffix;
    String nickname;
    String firstNameLocal;
    String middleNameLocal;
    String lastNameLocal;
    String otherLocal;
    String memberId;
    String gender;
    Date birthDate;
    Date deceasedDate;
    Double height;
    Double weight;
    String mothersMaidenName;
    String maritalStatusEnumId;
    String socialSecurityNumber;
    String passportNumber;
    Date passportExpireDate;
    Double totalYearsWorkExperience;
    String comments;
    String employmentStatusEnumId;
    String residenceStatusEnumId;
    String occupation;
    Long yearsWithEmployer;
    Long monthsWithEmployer;
    String existingCustomer;
    String cardId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



