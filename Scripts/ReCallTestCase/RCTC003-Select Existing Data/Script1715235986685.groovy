import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input_text'), 
    'PKGDARK')

WebUI.delay(5)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()=\'ATZ1P001\']')

WebUI.waitForElementVisible(dragDropValue, 30)

WebUI.dragAndDropByOffset(dragDropValue, 500, 300, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('canvas'), -145, 105)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_Product'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input_Product Type'), 
    'Equi')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_EquipmentItem'))

WebUI.clearText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Service Type'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Service Type'), 
    'wha')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_WhatsApp'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Product Description'), 
    'Subscribe Whatsapp tier')

WebUI.clearText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Product Group'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Product Group'), 
    'WhatsApp')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div_WhatsAppTieredAddons'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__Order 11'), 
    'O11_P0001416')

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('canvas'), -100, 160)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Add New'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/a_Product Charge OptionCharge'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_button'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_button'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/div__dhxcombo_select_img'))

WebUI.setText(findTestObject('Object Repository/AddNewProd/Page_Catalogue View - Enterprise Product Catalogue/input__dhxId_kYWw6T9lBpIe'), 
    'Re')

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

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/a_Link_Prod_Project'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/AddNewProd/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/AddNewProd/Page_Validate - Enterprise Product Catalogue/select_Select an optionDemoTest'), 
    '6', true)

WebUI.delay(15)

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

WebUI.delay(20)

