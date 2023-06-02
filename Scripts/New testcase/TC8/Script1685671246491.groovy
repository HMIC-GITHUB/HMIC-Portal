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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://webqa.hastingsmutual.com/')

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Hastings Mutual Insurance Company  Home/span_Login'))

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_Hastings Mutual Insurance Company - Login/input_UserName_UserName'), 
    'adminuser2059')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/TC8/Page_Hastings Mutual Insurance Company - Login/input_Password_Password'), 
    'wnoxtXU/hjBWldglQVct5g==')

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Hastings Mutual Insurance Company - Login/input_Password_login'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Agent Dashboard/a_QUOTE'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Quote/div_Start a New Business'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Quote/svg_Select_css-19bqh2r'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Quote/div_Personal Umbrella'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_Quote/button_Next'))

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured First Name_firstName'), 
    'first')

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured Last Name_lastName'), 
    'last' + RandomStringUtils.randomAlphabetic(5))

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Zip Code_zipCode'), 
    '49503')

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/button_Create New Account'))

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Address_addressTypeAhead_contact-1bka_7f4453'), 
    'michigan')

not_run: WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_City_contact-1bkatljiknt-address-jxjs_aa844f'), 
    'Grand Rapids')

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Delaware'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_Michigan'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_0081-CaCarpc 020590081CandiCarpcan'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/div_0081-CaCarpc 020590081CandiCarpcan'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Add Account'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Continue'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Continue'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_All Other Counties_css-1wy0on6'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Genessee'))

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

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured First Name_firstName'), 
    'first')

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Insured Last Name_lastName'), 
    'name' + RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/input_Zip Code_zipCode'), 
    '49503')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/button_Create New Account'))

WebUI.sendKeys(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/input_Address'), 
    'michigan')

WebUI.setText(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/input_City'), 
    'Grand Rapids')

WebUI.click(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_State'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Accountinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Michigan'))

WebUI.click(findTestObject('new producer ocde/Page_HMIC Agency Portal - Personal Umbrella - Account Information/input_Email Address_Accinfo'))

WebUI.setText(findTestObject('new producer ocde/Page_HMIC Agency Portal - Personal Umbrella - Account Information/input_Email Address_Accinfo'), 
    'klella@hastingsmutual.com')

WebUI.click(findTestObject('producer code in accinfo/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_Producer Select_dropdown'))

WebUI.click(findTestObject('new producer ocde/Page_HMIC Agency Portal - Personal Umbrella - Account Information/div_0002059-0000-HOUSE House Code'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Add Account'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Continue'))

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_365b9a/span_Continue'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_All Other Counties'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Genessee'))

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/span_Add Another Insured'))

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_First Name_firstName'), 
    'test')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_Last Name_lastName'), 
    'lastname')

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/span_Save'))

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_Occupation (if retired, list prior oc_83c789'), 
    'engineer')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/input_concat(Name of Insured, , s Employer)_cfa305'), 
    'test')

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_None'))

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/div_Pinnacle'))

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_c196ac/span_Next Primary Policy'))

WebUI.click(findTestObject('primary policy/Page_HMIC Agency Portal - Personal Umbrella - Primary Policy/div_Please Select Primarypolicy'))

not_run: WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Comprehensive Personal Liability'))

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/div_Auto Liability'))

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_company name_companyName'), 
    'HMIC')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Person_perPerson'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Limit Per Accident_perAccident'), 
    '500,000')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Property Damage_propertyDamage'), 
    '100,000')

WebUI.setText(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/input_Combined Single Limit_combinedSingleLimit'), 
    '500,000')

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Save'))

WebUI.click(findTestObject('Object Repository/TC8/Page_HMIC Agency Portal - Personal Umbrella_400c25/span_Next Exposures'))

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
    'ouner')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Add Location_jut__CheckboxField__check_1d0698'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Year_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2023'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ILX'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Add Auto'))

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Year_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_2024'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ACURA_1'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_RDX'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/button_Add Auto'))

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Year_css-1wy0on6'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_1987'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Make'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_ALFA ROMEO'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_Model'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/div_MILANO GOLD'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/label_Yes'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_b16c8a/span_Save'))

WebUI.click(findTestObject('watercraftdropdown/Page_HMIC Agency Portal - Personal Umbrella - Exposures/span_Next General Information'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_14678e/span_Next Quote'))

WebUI.click(findTestObject('watercraftdropdown/Page_HMIC Agency Portal - Personal Umbrella - Quote/span_Proceed as New Business'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_2bda54/button_Next Payment'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/label_Monthly'))

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Add New Payment Method'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Payment Nickname (optional)_ccNickname'), 
    'visa')

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Credit Card_ccNumber'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Credit Card_ccNumber'), 
    '4111111111111111')

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Exp Date_ccExpDate'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Exp Date_ccExpDate'), 
    '07/28_')

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_CVV_ccCVV'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_CVV_ccCVV'), 
    '123 ')

WebUI.click(findTestObject('Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Zip Code_ccZipCode'))

WebUI.setText(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/input_Zip Code_ccZipCode'), 
    '49503 ')

WebUI.click(findTestObject('Object Repository/Quote/Page_HMIC Agency Portal - Personal Umbrella_f3bd10/span_Save'))

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

