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

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21883/epc/main.html')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Main_Project_Name_Obj'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Dashboard - Enterprise Product Catalogue/Sub_Project_Obj'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogues - Enterprise Product Catalogue/button_New Page_Obj'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input_text'), 
    'ATZ1P')

WebUI.delay(5)

WebUI.callTestCase(findTestCase('ReUsedTC/DragAndDropImage'), [('dragImage') : 'ATZ1P001', ('dropImage') : 'Canvas'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.callTestCase(findTestCase('ReUsedTC/RightClickOnImage'), [('clickImage') : 'DiscountCombo'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_ProductLink to Component Product'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_EquipmentItem'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_WhatsApp'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Product Description'), 
    'Subscribe WhatsApp Tier ')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_WhatsAppTieredAddons'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Order 11'), 
    'O11_P0001414')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/label_Inclusion Status'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_button'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_DefaultPresent'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('ReUsedTC/RightClickOnImage'), [('clickImage') : 'P0001414'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Product Charge OptionCharge'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_RecurringCharge-R1'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Tariff Charge'), 
    '0.00')

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Cost'), 
    '1')

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Gl 11 Income'), 
    '1')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Link_Prod_Project'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/select_Select an optionDemoTest'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Publish'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Publish_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewProd/Page_Publish - Enterprise Product Catalogue/select_Select an optionLINK - Link_Prod_Project'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewProd/Page_Publish - Enterprise Product Catalogue/select_Select an optionLINKCNF1 CCSLINKCNF1 CRM'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewProd/Page_Publish - Enterprise Product Catalogue/select_Select an optionDemoTest'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Publish - Enterprise Product Catalogue/button_Publish'))

