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
    're')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured Last Name_lastName'), 
    'test' + RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Zip Code_zipCode'), 
    '52234')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Create New Account'))

WebUI.sendKeys(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Address_addressTypeAhead_contact-xbqt_cabb9c'), 
    'iowa')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Address TypeHomeAddressAddress 2Address_5994e5'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_City_contact-xbqthne5gh-address-oah9g_435d5b'), 
    'iowa')

WebUI.click(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_State'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Iowa'))

not_run: WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_ZIP Code_contact-xbqthne5gh-address-o_7d6b37'), 
    '52245')

WebUI.click(findTestObject('producer code in accinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Producer Select_dropdown'))

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_0081-CaCarpc 020590081CandiCarpcan'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_0002059-0000-HOUSE House Code'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Add Account'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/button_Continue'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Continue'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_All Other Counties'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Polk'))

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

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Next Exposures'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_For any entries below list all owned, _639edf'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Address_addressTypeAhead_address-4g3m_58918c'), 
    'iowa')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_City_address-4g3mytlyz8-city'), 
    'iowa')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Iowa'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-4g3mytlyz8-zip'), 
    '52245')

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

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Autos'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location_jut__CheckboxField__check_1d0698'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/label_Accept'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/label_Accept'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Year'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_2021'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ILX'))

WebUI.click(findTestObject('Auto TC3/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Save'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_other_jut__CheckboxField'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Year other'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_1951 other'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Type vehicle'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Snowmobile'))

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Make_make'))

WebUI.setText(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Make_make'), 'water')

WebUI.setText(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Model_model'), 'ship')

WebUI.setText(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/input_Engine Size_engineSize'), 
    '200')

WebUI.click(findTestObject('Other/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Save'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Next General Information'))

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

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Payment Method_jut__CheckboxField__che_3f2365'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact email_agentContactEmail'), 
    'klella@gmail.com')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print Receipt'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print'))

