
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "myPack.Portal_ULP_Utility.getCoverageInfo"(
    	String coverageName	) {
    (new myPack.Portal_ULP_Utility()).getCoverageInfo(
        	coverageName)
}


def static "myPack.WriteExcel.savePortalData"(
    	String currentDateAndTime	
     , 	String tcName	
     , 	String state	
     , 	String lob	
     , 	String accountNumber	
     , 	String submissionNumber	
     , 	String policyNumber	
     , 	String ExecutionStatus	
     , 	String pcURL	
     , 	String portalURL	) {
    (new myPack.WriteExcel()).savePortalData(
        	currentDateAndTime
         , 	tcName
         , 	state
         , 	lob
         , 	accountNumber
         , 	submissionNumber
         , 	policyNumber
         , 	ExecutionStatus
         , 	pcURL
         , 	portalURL)
}
