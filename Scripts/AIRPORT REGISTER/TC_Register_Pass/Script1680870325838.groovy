import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

'Open browser and navigate to website.'
WebUI.openBrowser('https://www.thaiairways.com/th_TH/rop/index.page')

'Maximize current window'
WebUI.maximizeWindow()

title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'สะสมไมล์การบินไทย | จองตั๋วการบินไทย', false)

WebUI.click(findTestObject('OBJ AIRPORT/HOME/Click_register'))

WebUI.verifyTextPresent('สมัครสมาชิก', false)

WebUI.verifyElementNotChecked(findTestObject('OBJ AIRPORT/REGISTER/Chick_cheackboxF-Home'), 0)

WebUI.check(findTestObject('OBJ AIRPORT/REGISTER/Chick_cheackboxF-Home'))

WebUI.verifyElementChecked(findTestObject('OBJ AIRPORT/REGISTER/Chick_cheackboxF-Home'), 0)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Next-1'))

WebUI.verifyTextPresent('ข้อมูลส่วนตัว', false)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Sir_Name.click'))

WebUI.verifyElementClickable(findTestObject('OBJ AIRPORT/REGISTER/Sir_Name.click'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Sir_Name.click'), 'Mstr.', false)

Sname = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Sir_Name.click'), 'value')

WebUI.verifyMatch(Sname, 'Mstr.', false)

WebUI.setText(findTestObject('OBJ AIRPORT/REGISTER/Name'), 'Supphalak')

WebUI.sendKeys(findTestObject('OBJ AIRPORT/REGISTER/Name'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('OBJ AIRPORT/REGISTER/Lastname'), 'Maneepanpanit')

WebUI.sendKeys(findTestObject('OBJ AIRPORT/REGISTER/Lastname'), Keys.chord(Keys.ENTER))

GN = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Name'), 'value')

GLN = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Lastname'), 'value')

WebUI.verifyMatch(GN, 'Supphalak', false)

WebUI.verifyMatch(GLN, 'Maneepanpanit', false)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Click_D'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Click_D'), '30', false)

BirdthdayTH = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Click_D'), 'value')

WebUI.verifyMatch(BirdthdayTH, '30', false)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Click_M'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Click_M'), '05', false)

BirdthdayTH = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Click_M'), 'value')

WebUI.verifyMatch(BirdthdayTH, '05', false)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Click_Y'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Click_Y'), '2002', false)

BirdthdayTH = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Click_Y'), 'value')

WebUI.verifyMatch(BirdthdayTH, '2002', false)

WebUI.verifyElementNotChecked(findTestObject('OBJ AIRPORT/REGISTER/Male'), 0)

WebUI.verifyElementNotChecked(findTestObject('OBJ AIRPORT/REGISTER/Female'), 0)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Female'))

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Male'))

WebUI.verifyElementNotChecked(findTestObject('OBJ AIRPORT/REGISTER/Female'), 0)

WebUI.verifyElementClickable(findTestObject('OBJ AIRPORT/REGISTER/Male'))

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Nationality'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Nationality'), 'JP', false)

NT = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Nationality'), 'value')

WebUI.verifyMatch(NT, 'JP', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Nationality'))

WebUI.selectOptionByValue(findTestObject('OBJ AIRPORT/REGISTER/Nationality'), 'TH', false)

NT = WebUI.getAttribute(findTestObject('OBJ AIRPORT/REGISTER/Nationality'), 'value')

WebUI.verifyMatch(NT, 'TH', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Next-2'))

WebUI.verifyTextPresent('ข้อมูลติดต่อ', false)

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Business_preferred_address'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Home_preferred_address'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/div_Job Title'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Job Title_job_title'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Company NameDepartment_company_name2'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Company NameDepartment_company_name1'))

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Address_address1'), 
    '2517')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Address_address2'), 
    'Santor')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Address_address3'), 
    'Thamaka')

WebUI.scrollToElement(findTestObject('OBJ AIRPORT/REGISTER/Scroll input1'), 0)

WebUI.click(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Please select cityPrachinburiAmnajch_4b05c9'))

WebUI.verifyTextNotPresent('Kanchanaburi', false)

WebUI.click(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Please select countryAfghanistanland_aacb6f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Please select countryAfghanistanland_aacb6f'), 
    'TH', true)

WebUI.click(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Please select cityPrachinburiAmnajch_4b05c9'))

WebUI.verifyTextPresent('Kanchanaburi', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Please select cityPrachinburiAmnajch_4b05c9'), 
    'Kanchanaburi', true)

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Postal Code_postalcode'), 
    '71120')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Email Address_email'), 
    'Shil3aiinu@outlook.com')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Confirm Email Address_confirm_email'), 
    'Shil3aiinu@outlook.com')

WebUI.verifyElementNotChecked(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d'), 
    0)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'), 
    0)

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'))

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_I agree to receive News, and promotio_6d6b5d_1'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_--select--                          _bfbc23'), 
    'C', true)

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Country Code_country_code1'), 
    '66')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Area Code_area_code1'), 
    '66')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Number_phone_number1'), 
    '086')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Extension_extension1'), 
    '6459875')

WebUI.click(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/span_Next'))

WebUI.verifyTextPresent('ความประสงค์ของท่านกับบริการบนเครื่อง', false)

WebUI.verifyTextPresent('ความประสงค์ในการรับข้อมูลข่าวสาร', false)

WebUI.verifyTextPresent('รายละเอียดการล็อคอิน', false)

WebUI.verifyTextPresent('ผู้แนะนำ', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Aisle                        Window _8b9e90'), 
    'NSSW', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_Religious Requirements              _54f0f0'), 
    'SFML', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/select_English                        Thai'), 
    'T', true)

WebUI.scrollToElement(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_PIN_pin'), 0)

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_PIN_pin'), 
    'test1234')

WebUI.setText(findTestObject('Object Repository/OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Confirm PIN_confirm_pin'), 
    'test1234')

PIN = WebUI.getAttribute(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_PIN_pin'), 'value')

C_PIN = WebUI.getAttribute(findTestObject('OBJ AIRPORT/OBJ_RECORD/Page_Enrolment  Royal Orchid Plus/input_Confirm PIN_confirm_pin'), 
    'value')

WebUI.verifyMatch(PIN, 'test1234', false)

WebUI.verifyMatch(C_PIN, 'test1234', false)

WebUI.click(findTestObject('OBJ AIRPORT/REGISTER/Next-4'))

WebUI.verifyTextPresent('4. ตรวจสอบ', false)

WebUI.verifyTextNotPresent('4. ตรวจโรคติดต่อ', false)

WebUI.verifyTextPresent('ข้อมูลส่วนตัว', false)

WebUI.verifyTextPresent('รายละเอียดการล็อคอิน', false)

WebUI.verifyTextPresent('ข้อมูลติดต่อ', false)

WebUI.verifyTextPresent('ข้อมูลอีเมล', false)

WebUI.verifyTextPresent('หมายเลขโทรศัพท์และโทรสาร', false)

WebUI.verifyTextPresent('ความประสงค์ของท่านกับบริการบนเครื่อง', false)

WebUI.verifyTextPresent('ความประสงค์ในการรับข้อมูลข่าวสาร', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

