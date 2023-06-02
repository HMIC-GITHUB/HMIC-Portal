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

WebUI.navigateToUrl('https://webqa.hastingsmutual.com/')

//WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Record/Page_Hastings Mutual Insurance Company  Home/span_Insurance_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Record/Page_Hastings Mutual Insurance Company  Home/span_Login'))

WebUI.setText(findTestObject('Object Repository/Record/Page_Hastings Mutual Insurance Company - Login/input_UserName_UserName'), 
    'adminuser2059')

WebUI.setEncryptedText(findTestObject('Object Repository/Record/Page_Hastings Mutual Insurance Company - Login/input_Password_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

WebUI.click(findTestObject('Object Repository/Record/Page_Hastings Mutual Insurance Company - Login/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Record/Page_Agent Dashboard/a_QUOTE'))

WebUI.click(findTestObject('Object Repository/Record/Page_Quote/div_Start a New Business'))

WebUI.click(findTestObject('Object Repository/Record/Page_Quote/svg_Select_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Record/Page_Quote/div_Personal Umbrella'))

WebUI.click(findTestObject('Object Repository/Record/Page_Quote/button_Next'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Individual_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Account Number'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Account Number_accountNumber'), 
    'AC00259343')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_365b9a/button_Search'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_Occupation (if retired, list prior oc_83c789'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_concat(Name of Insured, , s Employer)_cfa305'), 
    'test')

WebUI.click(findTestObject('New Policy Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_None_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Pinnacle'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_c196ac/span_Next Primary Policy'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Other'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Other Policy Type_otherTypeOfPolicy'), 
    'other')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_company name_companyName'), 
    'test engineer')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Policy Number_policyNumber'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Person_perPerson'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Accident_perAccident'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Property Damage_propertyDamage'), 
    '100,000')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Combined Single Limit_combinedSingleLimit'), 
    '100,000')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Save'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Next Exposures'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_For any entries below list all owned, _639edf'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-ttve_66d7d5'), 
    'michi')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/li_Michigan Street Northwest, Grand Rapids,_d97d70'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-ttvec7qugrt-zip'), 
    '45032')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_0'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_1'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Save'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location_jut__CheckboxField__check_1d0698'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Year'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2024'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_INTEGRA'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Save'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Operator Info_jut__CheckboxField__chec_607e4e'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_First Name_firstName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Last Name_lastName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Birth Date_birthDate'), 
    '')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Birth Date_birthDate'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_June_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2005'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_concat(Driver, , s License Number)_dr_3df3b9'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_State Issuance_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Alabama'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Next General Information'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_14678e/button_Next Quote'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_527583/span_Proceed as New Business'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_2bda54/span_Next Payment'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Automatic'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Agency'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/label_Full Pay'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_184.00_jut__CheckboxField__checkboxElement'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Please Select_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Agency_1'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Please Select_css-1wy0on6_1'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/div_Full Pay'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    '12345678')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact email_agentContactEmail'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    '12345678')

WebUI.doubleClick(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'))

WebUI.setText(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    'TEst')

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print Receipt'))

WebUI.click(findTestObject('Object Repository/Record/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print'))

