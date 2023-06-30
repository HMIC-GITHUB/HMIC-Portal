import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.comment('Portal WC E2E Regression')

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

WebUI.comment('User is able to Initiate the quote successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_WorkersComp'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

WebUI.verifyElementText(findTestObject('null'), 
    'Pre-Qualification')

WebUI.comment('Prequalification statement should be displayed.')

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information')

WebUI.comment('User successfully navigated to Account Information screen')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Dropdown_SearchOrQuoteFor'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Individual'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

// + RandomStringUtils.randomAlphabetic(5)
WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), '49058')

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), 'Iowa Avenue, Iowa City, IA, USA')

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

WebUI.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_ACCOUNTINFO/Portal_AccInfo_Addressdata/Page_HMIC Agency Portal - Workers Compensation - Account Information/Portal_AccInfo_IL_dropdown'))

not_run: WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_ACCOUNTINFO/Page_HMIC Agency Portal - Workers Compensation - Account Information/Portal_AccInfo_Address_Iowa'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_StandardizeAddress_Button_Continue'))

GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'))

WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails_Operations/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_Operations_dropdown'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails_Operations/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_Operations_Selection'))

//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_EffectiveDate_June19th'))
//
//WebUI.click(findTestObject('null'))
//
//WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_EffectiveDate_Forwardbutton'))
//
//WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_EffectiveDate_July_30th'))
//
//WebUI.verifyElementText(findTestObject('null'), 
//    'Policy Effective Date is more than 30 days in advance. Rates are subject to change.')
//
//WebUI.verifyElementText(findTestObject('PORTAL_HMIC/PORTAL_POLICY DETAILS/Portal_PolicyDetails/Page_HMIC Agency Portal - Workers Compensation - Policy Details/Portal_PolicyDetails_ExpirationDate'), 
//    'July 30, 2024')
//
WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyDetails_Dropdown_OrgType'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_OrgType_TypeList_Individual'))

WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), Keys.chord('123456789'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_WorkClassification_TypeList_0005'))

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages', 
    10)

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_STATECOVERAGES/Page_HMIC Agency Portal - Workers Compensation - State Coverages/Portal_StateCoverage_CheckBox_Unchecked'))

WebUI.setText(findTestObject('PORTAL_HMIC/PORTAL_STATECOVERAGES/Page_HMIC Agency Portal - Workers Compensation - State Coverages/Portal_StateCoverages_TextField_ExperienceRating'), 
    '10.0')

WebUI.click(findTestObject('Object Repository/Portal/Portal_StateCov_Button_NextLineCov'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_LimitPrAcc_DropDown'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_LimitPrAcc_500,000'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_OtherStates_DropDown'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_AllStatesExcept'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE3/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_Coverages_ExcludedStates_Search'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_Coverages_Excluded_Delaware1'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_LineCoverages_BlanketCheckBox_Unchecked'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_OptionalCoverages_State_DropwDown'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_OptionalCoverages_Iowa'))

WebUI.click(findTestObject('PORTAL_HMIC/PORTAL_LINECOVERAGE2/Page_HMIC Agency Portal - Workers Compensation - Line Coverages/Portal_OptionalCoverages_Save1'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_LineCov_button_NextSupplementalQues'))

WebUI.click(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

