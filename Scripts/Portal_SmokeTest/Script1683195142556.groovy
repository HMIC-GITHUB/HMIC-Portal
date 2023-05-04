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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://agencyportal.qa1.hastingsmutual.com/Accounts')

WebUI.setText(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company - Login/input_UserName_UserName'), 
    'adminuser2059')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company - Login/input_Password_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

WebUI.click(findTestObject('Object Repository/Page_Hastings Mutual Insurance Company - Login/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Account Search/a_Quote'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Quote/h1_New Business Dashboard'), 'New Business Dashboard')

WebUI.click(findTestObject('Object Repository/Page_Quote/div_Start a New Business'))

WebUI.click(findTestObject('Object Repository/Page_Quote/svg_Select_css-19bqh2r'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Quote/path'))

WebUI.click(findTestObject('Object Repository/Page_Quote/div_Workers Compensation'))

WebUI.click(findTestObject('Object Repository/Page_Quote/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/span_Operation of a public utility_jut__Che_43370d'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/span_Agree'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/input_Insured Company Name_companyName'), 
    'Test Company')

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/input_Zip Code_postalCode'), 
    '30004')

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/span_Create New Account'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/div_Billing'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/div_Address TypeBillingAddressAddress 2Addr_16ab90'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/input_Address_addressTypeAhead_contact-6loz_8085f5'), 
    '404 E Woo')

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/li_404 East Woodlawn Avenue, Hastings, MI, USA'))

WebUI.waitForPageLoad(10)

WebUI.mouseOver(findTestObject('Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Portal_AccountInfo_Dropdown_ProducerCode'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/div_0002059-0000-HOUSE House Code'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/span_Add Account'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_05ab75/span_Continue'))

WebUI.mouseOver(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/input_FEIN_contact-3ox9ujv960h-feinId'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/input_FEIN_contact-3ox9ujv960h-feinId'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/input_FEIN_contact-3ox9ujv960h-feinId'), 
    Keys.chord('123456789'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/div_Search For An Existing ContactOrg typeS_f6a704'))

WebUI.click(findTestObject('Portal_PolicyDetails_Dropdown_OrgType'))

not_run: WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/body_You need to enable JavaScript to run t_517c10'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/div_Corporation'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_867d40/span_Next Locations'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/input_maximum number of employees at this l_34d630'), 
    '10')

WebUI.click(findTestObject('Portal_Locations_TextBox_WorkClassification'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/div_0011 - Farm  Market Or Truck'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/input__totalPayroll'), 
    '25000')

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/input__numFullTimeEmployees'), 
    '5')

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/input__numPartTimeEmployees'), 
    '5')

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/div_Add Classification'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b41d06/span_Next State Coverages'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_77bebb/span_Next Line Coverages'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_2741c9/span_Optional Coverages_jut__CheckboxField__6e43b1'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_2741c9/div_Please Select_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_2741c9/div_Michigan'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_2741c9/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_2741c9/span_Next Supplemental Questions'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_f8570d/span_Additional Details_jut__CheckboxField__6dea13'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_f8570d/span_Next Quote'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_eefd0b/span_Next Additional Info'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Individual'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Search For An Existing Contact_css-1hwfws3'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Test CompanyUnknown'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Both'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Contact TypeCompanyContact RoleBoth'))

WebUI.sendKeys(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/input_Phone Number_contact-m9he0twddpj-phoneNumber'), 
    Keys.chord('8144231211'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/input_First Name_firstName'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/input_First Name_firstName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/input_Last Name_lastName'), 
    'Person')

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/input_Email Address_emailAddress'), 
    'ssomasundaram@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/span_Next Review'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/div_Step 7 Additional InfoPolicy Informatio_cc1cc3'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/button_Save'))

WebUI.setText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/textarea_Description of Operation_operation_9742a7'), 
    'Test Description')

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_37dc0f/span_Next Review'))

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b55f5b/span_Submit to Underwriting'))

SubmissionNumber = WebUI.getText(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b55f5b/span_SubNumber'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_HMIC Agency Portal - Workers Compensat_b55f5b/span_OK'))

WebUI.closeBrowser()

