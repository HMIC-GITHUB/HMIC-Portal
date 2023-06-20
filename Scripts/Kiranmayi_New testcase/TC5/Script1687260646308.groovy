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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webqa.hastingsmutual.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Quote/Page_Hastings Mutual Insurance Company  Home/span_Login'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_Hastings Mutual Insurance Company - Login/input_UserName_UserName'), 
    'adminuser2059')

WebUI.setEncryptedText(findTestObject('Object Repository/Quote/Page_Hastings Mutual Insurance Company - Login/input_Password_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

WebUI.click(findTestObject('Object Repository/Quote/Page_Hastings Mutual Insurance Company - Login/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Agent Dashboard/a_QUOTE'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Quote/div_Start a New Business'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Quote/svg_Select_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Quote/div_Personal Umbrella'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Quote/button_Next'))

WebUI.click(findTestObject('New Account Information/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Individual_css-1wy0on6'))

WebUI.click(findTestObject('New Account Information/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Account Number'))

WebUI.setText(findTestObject('New Account Information/Page_HMIC Agency Portal - Personal Umbrella - Account Information/Page_HMIC Agency Portal - Personal Umbrella - Account Information/Account Number'), 
    'AC00259343')

WebUI.click(findTestObject('New Search Account/Page_HMIC Agency Portal - Personal Umbrella - Account Information/span_Search'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Michigan_css-1wy0on6'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Ohio'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Please Select_css-1wy0on6'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Ashtabula'))

WebUI.clearText(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/input_Occupation (if retired, list prior occupation)_insuredOccupation'))

WebUI.setText(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/input_Occupation (if retired, list prior occupation)_insuredOccupation'), 
    'Test Engineer')

WebUI.clearText(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/input_concat(Name of Insured, , s Employer)_insuredEmployer'))

WebUI.setText(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/input_concat(Name of Insured, , s Employer)_insuredEmployer'), 
    'Testing')

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_None_css-1wy0on6'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Pinnacle'))

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/span_Next Primary Policy'))

WebUI.click(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/div_Please Select_css-1wy0on6'))

WebUI.click(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/div_Other'))

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Other Policy Type_otherTypeOfPolicy'), 
    'Engineering')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_company name_companyName'), 
    'Hastings')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Policy Number_policyNumber'), 
    '12345678')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Limit Per Person_perPerson'), 
    '500,000')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Limit Per Accident_perAccident'), 
    '500,000')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Property Damage_propertyDamage'), 
    '500,000')

WebUI.setText(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/input_Combined Single Limit_combinedSingleLimit'), 
    '500,000')

WebUI.click(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/span_Save'))

WebUI.click(findTestObject('New Primary Policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/span_Next Exposures'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_For any entries below list all owned, _639edf'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-j7fz_764a0b'), 
    'Michigan')

WebUI.setText(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_City_address-g5d0sf97dq9-city'), 
    'Grand Rapids')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Michigan'))

not_run: WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/li_28th Street Southeast, Grand Rapids, MI, USA'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-j7fzorw11ld-zip'), 
    '49503')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Select no residen'))

not_run: WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_3'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_1'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location_jut__CheckboxField__check_1d0698'))

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/label_Accept'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Year_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2023'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ILX'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/label_Yes'))

not_run: WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/new operator'))

WebUI.setText(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_First Name_firstName'), 
    'Test1')

WebUI.setText(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Last Name_lastName'), 
    'Test2')

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Birth Date_birthDate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_2003'))

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_3'))

WebUI.setText(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/Driver License number'), 
    '123456')

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State Issuance_css-1wy0on6'))

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Alaska'))

WebUI.click(findTestObject('New Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Save'))

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Next General Information'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Next Quote'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_527583/span_Proceed as New Business'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_2bda54/button_Next Payment'))

//WebUI.click(findTestObject('New payment objects/Page_HMIC Agency Portal - Personal Umbrella - Payment/direct'))
//
//WebUI.click(findTestObject('New payment objects/Page_HMIC Agency Portal - Personal Umbrella - Payment/agency'))
//
//WebUI.click(findTestObject('New Payment/Page_HMIC Agency Portal - Personal Umbrella - Payment/label_Full Pay'))
//
//WebUI.click(findTestObject('New Payment/Page_HMIC Agency Portal - Personal Umbrella - Payment/renewal checkbox'))
//
//WebUI.click(findTestObject('New payment objects/Page_HMIC Agency Portal - Personal Umbrella - Payment/select'))
//
//WebUI.click(findTestObject('New payment objects/Page_HMIC Agency Portal - Personal Umbrella - Payment/agency'))
//
//not_run: WebUI.click(findTestObject('New Payment/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Please Select_css-1wy0on6'))
//
//WebUI.click(findTestObject('New payment objects/Page_HMIC Agency Portal - Personal Umbrella - Payment/fullpay'))
not_run: WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Automatic'))

not_run: WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Agency'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/label_Full Pay'))

WebUI.click(findTestObject('defer/Page_HMIC Agency Portal - Personal Umbrella - Payment/span_defer Payment Method_jut__CheckboxField'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_184.00_jut__CheckboxField__checkboxElement'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Please Select_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Agency_1'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Please Select_css-1wy0on6_1'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Full Pay'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact email_agentContactEmail'), 
    'klella@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit Payment'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print Receipt'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print'))

WebUI.closeBrowser()

