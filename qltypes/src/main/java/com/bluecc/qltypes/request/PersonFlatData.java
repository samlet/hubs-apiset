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
    double height;
    double weight;
    String mothersMaidenName;
    String maritalStatusEnumId;
    String socialSecurityNumber;
    String passportNumber;
    Date passportExpireDate;
    double totalYearsWorkExperience;
    String comments;
    String employmentStatusEnumId;
    String residenceStatusEnumId;
    String occupation;
    long yearsWithEmployer;
    long monthsWithEmployer;
    String existingCustomer;
    String cardId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



