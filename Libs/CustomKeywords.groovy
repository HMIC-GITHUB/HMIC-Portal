
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import java.util.List



def static "myPack.Portal_ULP_Utility.getCoverageInfo"(
    	String coverageName	) {
    (new myPack.Portal_ULP_Utility()).getCoverageInfo(
        	coverageName)
}


def static "myPack.Portal_ULP_Utility.checkResidencePremium"(
    	java.util.List<java.lang.Integer> residenceData	) {
    (new myPack.Portal_ULP_Utility()).checkResidencePremium(
        	residenceData)
}


def static "myPack.Portal_ULP_Utility.checkAutoPremium"(
    	java.util.List<java.lang.Integer> autosData	) {
    (new myPack.Portal_ULP_Utility()).checkAutoPremium(
        	autosData)
}


def static "myPack.Portal_ULP_Utility.checkOHCountyPremium"(
    	java.util.List<java.lang.Integer> countyData	
     , 	String countyName	) {
    (new myPack.Portal_ULP_Utility()).checkOHCountyPremium(
        	countyData
         , 	countyName)
}


def static "myPack.Portal_ULP_Utility.checkAntiqueAutoPremium"(
    	java.util.List<java.lang.Integer> antiqueData	) {
    (new myPack.Portal_ULP_Utility()).checkAntiqueAutoPremium(
        	antiqueData)
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
