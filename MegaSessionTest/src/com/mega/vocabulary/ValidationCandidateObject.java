package com.mega.vocabulary;

public interface ValidationCandidateObject extends GenericObject,LockableObject,NotificationRelatedObject {
/*MetaClass ID*/
    public static String ID = "~p97oueyyBbF0[Validation Candidate Object]";
/*MetaAttributes*/
    public static final String MA_Comment = "~f10000000b20[X]";
    public static final String MA_Log = "~f20000000b60[X]";
    public static final String MA_CommentBody = "~m20000000170[X]";
    public static final String MA_ValidationState = "~sB7o8gyyBjI0[X]";
    public static final String MAV_ValidationState_Validated_V = "V";
    public static final String MAV_ValidationState_NotValid = "U";
    public static final String MAV_ValidationState_ValidationSubmitted = "S";
    public static final String MAV_ValidationState_ValidationInProgress_P = "P";
    public static final String MAV_ValidationState_ValidationInProgress_C = "C";
    public static final String MAV_ValidationState_Validated_D = "D";
    public static final String MAV_ValidationState_UpdateInProgress = "A";
    public static final String MAV_ValidationState_Undetermined = "X";
    public static final String MA_CurrentValidation = "~TUOYtiORGbG1[X]";
    public static final String MA_PreviousValidationStateDeprecated = "~RGzwku(yBrV1[X]";
/*MetaAssociationEnds*/
    public static final String MAE_Validation = "~9d4R6x6MGfWB[Validation Candidate Object.Validation]";

}
