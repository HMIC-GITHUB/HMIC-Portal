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

WebUI.click(findTestObject('Object Repository/TC3/Page_Hastings Mutual Insurance Company  Home/span_Login'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_Hastings Mutual Insurance Company - Login/input_UserName_UserName'), 
    'adminuser2059')

WebUI.setEncryptedText(findTestObject('Object Repository/TC3/Page_Hastings Mutual Insurance Company - Login/input_Password_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

WebUI.click(findTestObject('Object Repository/TC3/Page_Hastings Mutual Insurance Company - Login/input_Password_login'))

WebUI.click(findTestObject('Object Repository/TC3/Page_Agent Dashboard/a_QUOTE'))

WebUI.click(findTestObject('Object Repository/Quote/Page_Quote/div_Start a New Business'))

WebUI.click(findTestObject('Object Repository/TC3/Page_Quote/svg_Select_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/TC3/Page_Quote/div_Personal Umbrella'))

WebUI.click(findTestObject('Object Repository/TC3/Page_Quote/button_Next'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured First Name_firstName'), 
    'Test7')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured Last Name_lastName'), 
    'Test8')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Zip Code_zipCode'), 
    '40532')

WebUI.click(findTestObject('New Search/Page_HMIC Agency Portal - Personal Umbrella - Account Information/span_Search'))

WebUI.click(findTestObject('New Search/Page_HMIC Agency Portal - Personal Umbrella - Account Information/span_Select this account'))

WebUI.click(findTestObject('Thirteen personal Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Michigan_css-1wy0on6'))

WebUI.click(findTestObject('Thirteen personal Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Indiana'))

WebUI.click(findTestObject('Thirteen personal Information/Page_HMIC Agency Portal - Personal Umbrella - Policy Information/div_Lake'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_Occupation (if retired, list prior oc_83c789'), 
    'engineer')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_concat(Name of Insured, , s Employer)_cfa305'), 
    'test')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_None'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Pinnacle'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/span_Next Primary Policy'))

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Comprehensive Personal Liability'))

WebUI.click(findTestObject('primary policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/div_Please Select Primarypolicy'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Comprehensive Personal Liability'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_company name_companyName'), 
    'HMIC')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Combined Single Limit_combinedSingleLimit'), 
    '500,000')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/button_Add Policy'))

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Employers Liability'))

WebUI.click(findTestObject('primary policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/div_Please Select Primarypolicy'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Other'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Other Policy Type_otherTypeOfPolicy'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_company name_companyName'), 
    'HMIC')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Person_perPerson'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Accident_perAccident'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Property Damage_propertyDamage'), 
    '100,000')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Combined Single Limit_combinedSingleLimit'), 
    '500,000')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/button_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Next Exposures'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_For any entries below list all owned, _639edf'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-4g3m_58918c'), 
    'Michigan')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_City_address-4g3mytlyz8-city'), 
    'Grand Rapids')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Iowa'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-4g3mytlyz8-zip'), 
    '49503')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Please Select'))

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Select no residen'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-4ai0_de3c63'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-4ai0_de3c63'), 
    'michigan')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_City_address-4ai0500xorf-city'), 
    'GrandRapids')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Michigan'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-4ai0500xorf-zip'), 
    '49503')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Please Select_1'))

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Select no residen'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_1'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-5izh_582d45'), 
    'michigan')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Number Of ResidencesPlease SelectOccupa_1ea1b8'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_City_address-5izhviukmor-city'), 
    'grand rapids')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Michigan_1'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-5izhviukmor-zip'), 
    '49503')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Please Select_1_2'))

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Select no residen'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_4'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('watercraftdropdown/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Save real estate'))

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Autos'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location_jut__CheckboxField__check_1d0698'))

WebUI.click(findTestObject('New Accept Label Auto/Page_HMIC Agency Portal - Personal Umbrella - Exposures/label_Accept'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Year'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_2021'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ILX'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Save'))

WebUI.click(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Other Vehicles - Including Motorcycles_jut__CheckboxField__checkboxElement'))

WebUI.click(findTestObject('watercraftdropdown/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Year_css-water drop'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_1951'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Type'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_In Board'))

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Manufacturer_make'), 
    'water')

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_model_model'), 
    'ship')

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_length (in feet)_length'), 
    '20')

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Horsepower_horsepower'), 
    '400')

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Max Speed_maxSpeed'), 
    '40')

WebUI.setText(findTestObject('watercraft TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Waters Navigated_watersNavigated'), 
    'lake')

WebUI.click(findTestObject('watercraftdropdown/Page_HMIC Agency Portal - Personal Umbrella - Exposures/button_Sav water'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Next General Information'))

WebUI.click(findTestObject('TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Any aircraft owned, leased, chartered,_16e290'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_First Name_DriverFirstName'), 
    'first')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_Last Name_DriverLastName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_Please enter violation_DriverViolation'), 
    'violation')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Add Another Driver Violation'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_First Name_DriverFirstName'), 
    'second')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_Last Name_DriverLastName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/input_Please enter violation_DriverViolation'), 
    'violation')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Next Quote'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_527583/span_Proceed as New Business'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/span_Prior Carrier Information_jut__Checkbo_5af059'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/input_Date of Loss_occurrenceDate'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/div_1'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/input_Description_description'), 
    'loss')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/input__openReserve'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/input__amountPaid'), 
    '500')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_2bda54/span_Next Payment'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/label_Bi-Monthly'))

WebUI.click(findTestObject('defer/Page_HMIC Agency Portal - Personal Umbrella - Payment/span_defer Payment Method_jut__CheckboxField'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/span_Save_jut__CheckboxField__checkboxElement'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Please Select'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Please Select'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Direct'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Full Pay_css-1wy0on6'))

not_run: WebUI.click(findTestObject('payment renewal/Page_HMIC Agency Portal - Personal Umbrella - Payment/div_Full Pay'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact email_agentContactEmail'), 
    'klella@gmail.com')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print Receipt'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print'))

