import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\DosaPra\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Portal_SmokeTest\\20230509_111625\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

not_run: WebUI.comment('Portal Smoke Test')

not_run: WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

not_run: WebUI.comment('User is able to Initiate the quote successfully')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Title_StartANewBusiness'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Dropdown_SelectLineOfBusiness'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_LOB_TypeList_WorkersComp'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_Next'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_PreQual_Title_PreQualification'), 'Pre-Qualification')

not_run: WebUI.comment('Prequalification statement should be displayed.')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_CheckBox_RiskDoesNotHaveAny'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PreQual_Button_Agree'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_Header_AccInfo'), 'Step 1: Account Information')

not_run: WebUI.comment('User successfully navigated to Account Information screen')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Dropdown_SearchOrQuoteFor'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_Individual'))

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_FirstName'), 'Auto_FirstName')

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_LastName'), 'LastName2')

// + RandomStringUtils.randomAlphabetic(5)
not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_ZipCode'), '60614')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_CreateNewAcc'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_AccInfo_SubTitle_AddNewAcc'), 'Add a New Account')

not_run: WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), '10850 Lincoln Trail')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_AccInfo_TextBox_Address'), Keys.chord(Keys.SPACE))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_1stAddress'), FailureHandling.OPTIONAL)

not_run: WebUI.waitForPageLoad(10)

not_run: WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccountInfo_Dropdown_ProducerCode'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_TypeList_2059HouseCode'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_AccInfo_Button_AddAccount'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_StandardizeAddress_Button_Continue'))

not_run: GlobalVariable.AccountNumber = WebUI.getText(findTestObject('Portal/Portal_NewAccountCreated_Label_AccountNum'))

not_run: WebUI.click(findTestObject('Portal/Portal_NewAccountCreated_Button_Continue'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PolicyDetails_Dropdown_OrgType'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_OrgType_TypeList_Individual'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Object Repository/Portal/Portal_PolDetails_TextBox_SSN'), Keys.chord('123456789'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_PolDetails_Button_Save'))

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLoc'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Loc_Header_Loc'), 'Step 3: Locations')

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_MaxNumOfEmp'), '51')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_WorkClassification'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_WorkClassification_TypeList_0005'))

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_TotalPayroll'), '5000')

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_FullTimeEmployees'), '10')

not_run: WebUI.setText(findTestObject('Object Repository/Portal/Portal_Loc_TextBox_PartTimeEmployees'), '10')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Loc_Button_Save'))

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextStateCov'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Cov_Header_Coverages'), 'Step 4: Coverages')

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextLineCov'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextSupplementalQues'))

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Supplemental_CheckBox_IhaveReviewed'))

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Button_NextQuote'))

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_Quote'), 'Step 6: Quote')

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'), 0)

not_run: GlobalVariable.SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Portal/Portal_Quote_Label_SubmissionNum'))

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Portal/Portal_Common_Button_NextAdditionalInfo'))

not_run: WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 7: Additional Info')

not_run: WebUI.setText(findTestObject('Portal/Portal_AddInfo_TextArea_DescriptionOfOp'), 'Individual')

not_run: WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_FirstName'), 'AccAndIns_FirstName')

not_run: WebUI.setText(findTestObject('Portal/Portal_AccAndInsCont_TextBox_LastName'), 'LastName' + RandomStringUtils.randomAlphabetic(
        5))

not_run: WebUI.sendKeys(findTestObject('Portal/Portal_AccAndIns_TextBox_PhoneNum'), Keys.chord('8567123411'))

not_run: WebUI.click(findTestObject('Portal/Portal_Common_Button_Save'))

not_run: WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_FirstName'), 'Test')

not_run: WebUI.setText(findTestObject('Portal/Portal_AccInfo_TextBox_LastName'), 'Person')

not_run: WebUI.setText(findTestObject('Portal/Portal_FirstCall_TextBox_EmailAddress'), 'ssomasundaram@hastingsmutual.com')

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.click(findTestObject('Portal/Portal_Common_Button_NextReview'))

not_run: WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

not_run: WebUI.mouseOver(findTestObject('Portal/Portal_Review_Button_SubmitToUnderwriting'))

not_run: WebUI.click(findTestObject('Portal/Portal_Review_Button_SubmitToUnderwriting'))

not_run: WebUI.verifyElementVisible(findTestObject('Portal/Portal_Popup_Label_QuoteConfirmation'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Portal/Portal_QuoteConfirmPopup_Button_OK'))

not_run: WebUI.comment('User should be able to quote the submission in Portal')

not_run: String SubmissionNumber = GlobalVariable.SubmissionNumber

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.comment('Login to PC and approve UW issues')

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_Login'), [('PC_Username') : PC_Username
        , ('PC_Password') : PC_Password], FailureHandling.STOP_ON_FAILURE)

not_run: GlobalVariable.SubmissionNumber = SubmissionNumber.replace('Quote No. ', '')

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_SearchSubmission'), [('SubmissionNumber') : GlobalVariable.SubmissionNumber], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_LeftPanel_RiskAnalysis'))

not_run: WebUI.verifyElementText(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Label_Title'), 'Risk Analysis')

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_RiskAnalysisScreen_ApproveUWIssues'), [:], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_Common_Button_ReleaseLock'))

not_run: WebUI.selectOptionByLabel(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Dropdown_AssignTo'), 'Test Processor3 (Renewal Com Proc)', 
    false)

not_run: WebUI.click(findTestObject('PolicyCenter/PolicyCenterObjects/PC_UWActivity_Button_Release'))

not_run: WebUI.takeFullPageScreenshot()

not_run: WebUI.callTestCase(findTestCase('PolicyCenter_Pages/PC_CommonScreens/PC_LogOut'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_Login'), [('Portal_Username') : GlobalVariable.Portal_Username
        , ('Portal_Password') : GlobalVariable.Portal_Password], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Portal/Portal_Common_Tab_Quote'))

not_run: WebUI.comment('User should able to search the quote in Portal')

WebUI.verifyElementText(findTestObject('Object Repository/Portal/Portal_Quote_Header_NewBusinessDashboard'), 'New Business Dashboard')

WebUI.setText(findTestObject('Object Repository/Portal/Portal_Quote_TextBox_SearchFor'), GlobalVariable.SubmissionNumber)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Portal/Portal_Quote_Button_Search'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Portal/Portal_Quote_Table_QuoteNum', [('SubmissionNumber') : GlobalVariable.SubmissionNumber]))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 8: Review')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_Common_Button_NextPayment'))

WebUI.verifyElementText(findTestObject('Portal/Portal_Common_Label_Header'), 'Step 9: Payment')

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_FullPay'))

WebUI.click(findTestObject('Portal/Portal_Payment_PaymentPlan_Radio_FullPay'))

WebUI.click(findTestObject('Portal/Portal_Payment_CheckBox_DeferDownPayment'))

WebUI.mouseOver(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactName'), 'AgentName')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentContactEmail'), 'abc@gmail.com')

WebUI.setText(findTestObject('Portal/Portal_Payment_TextBox_AgentPhoneNum'), '8567123411')

WebUI.click(findTestObject('Portal/Portal_Payment_Button_Submit'))

WebUI.verifyElementText(findTestObject('Portal/Portal_SubSuccess_Label_ApplicationIssued'), 'This application has been issued. Please contact your underwriter with questions.')

String polNum = WebUI.getText(findTestObject('Portal/Portal_SubSuccess_Label_PolNum'))

GlobalVariable.PolicyNumber = polNum.replace('Policy No. ', '')

WebUI.comment('Policy issued successfully in Portal')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Portal/Portal_UserDropdown_Button_Arrow'))

WebUI.click(findTestObject('Portal/Portal_UserDropdown_TypeList_LogOut'))

WebUI.callTestCase(findTestCase('Portal_Pages/Portal_CommonScreens/Portal_SavePolicyData'), [('State') : State, ('TCName') : TCName
        , ('LOB') : LOB], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

''', 'Test Cases/Portal_SmokeTest', new TestCaseBinding('Test Cases/Portal_SmokeTest',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
