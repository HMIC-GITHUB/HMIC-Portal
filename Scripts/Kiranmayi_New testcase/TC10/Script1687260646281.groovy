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
    'Wisconsin')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Address TypeHomeAddressAddress 2Address_5994e5'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_City_contact-xbqthne5gh-address-oah9g_435d5b'), 
    'Wisconsin')

WebUI.click(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_State'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Wisconsin'))

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
    'Wisconsin')

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_City_address-4g3mytlyz8-city'), 
    'Wisconsin')

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_State'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Wisconsin'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_ZIP Code_address-4g3mytlyz8-zip'), 
    '53008')

not_run: WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Please Select'))

WebUI.click(findTestObject('Exposures/Page_HMIC Agency Portal - Personal Umbrella - Exposures/div_Select no residen'))

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2'))

WebUI.setText(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/input_Occupancy  Interest_occupancyAndInterest'), 
    'owner')

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

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

WebUI.click(findTestObject('Object Repository/TC3/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Next General Information'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Next Quote'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_527583/span_Proceed as New Business'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/span_Named Insured_jut__CheckboxField__checkboxElement'))

WebUI.setText(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/input_Carrier_carrier'), 
    'Test')

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/input_Effective Date_effectiveDate'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/div_1'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/input_Expiration Date_expirationDate'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/div_29'))

WebUI.click(findTestObject('TC10 WI Prior/Page_HMIC Agency Portal - Personal Umbrella - Complete Application/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_2bda54/button_Next Payment'))

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/label_Full Pay'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Add New Payment Method'))

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/label_Bank Account'))

not_run: WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Payment Nickname (optional)_ccNickname'), 
    'visa')

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Routing_baRoutingNumber'))

WebUI.setText(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Routing_baRoutingNumber'), 
    '072404320')

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Account_baAccountNumber'))

WebUI.setText(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Account_baAccountNumber'), 
    '123456700')

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Confirm Account_baConfirm'))

WebUI.setText(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/input_Confirm Account_baConfirm'), 
    '123456700')

WebUI.click(findTestObject('bank account/Page_HMIC Agency Portal - Personal Umbrella - Payment/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/i_Expires072028_mir mi-chevron-right dynami_53c4eb'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact name_agentContactName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Agent contact email_agentContactEmail'), 
    'klella@hastingsmutual.com')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Submit Payment'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print Receipt'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_5a5785/span_Print'))

WebUI.closeBrowser()

