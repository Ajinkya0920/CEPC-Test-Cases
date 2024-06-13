import com.kms.katalon.core.testobject.ConditionType as ConditionType
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21883/epc/main.html')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign in to IOEVER1_CEPC/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Main_Project_Name_Obj'))

WebUI.waitForElementAttributeValue(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Sub_Project_Obj'), 
    'text()', 'Test', 20)

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/Sub_Project_Obj'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.waitForElementAttributeValue(findTestObject('NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'), 
    'id', 'existingpalette', 20)

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.waitForElementAttributeValue(findTestObject('NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/select_Account Loyalty Earning RateAccount _1781eb'), 
    'class', 'form-control c-mandatory c-simple-ddl', 20)

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/select_Account Loyalty Earning RateAccount _1781eb'), 
    'NETWORK_SERVICE', true)

WebUI.delay(10)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()="ALP_TO_ANY_NEW"]')

WebUI.waitForElementVisible(dragDropValue, 50)

WebUI.dragAndDropByOffset(dragDropValue, 500, 400, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 0, 0)

WebUI.delay(5)

not_run: WebUI.rightClickOffset(findTestObject('canvas'), -521, -33)

WebUI.clickOffset(findTestObject('canvas'), -521, -33)

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/input__Network Service Name'), 
    'ALP_TO_ANY_NEW')

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/a_Save'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogue View - Enterprise Product Catalogue/a_Validate_1'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/a_Link_Prod_Project'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogues - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Catalogues - Enterprise Product Catalogue/a_Validate_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/select_Select an optionDemoTest'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/a_Validate'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/a_Publish'))

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Validate - Enterprise Product Catalogue/a_Publish_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Publish - Enterprise Product Catalogue/select_Select an optionLINK - Link_Prod_Project'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Publish - Enterprise Product Catalogue/select_Select an optionLINKCNF1 CCSLINKCNF1 CRM'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Publish - Enterprise Product Catalogue/select_Select an optionDemoTest'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/NetworkServiceChanges/Page_Publish - Enterprise Product Catalogue/select_CompleteDelta'), 
    'DELTA', true)

WebUI.click(findTestObject('Object Repository/NetworkServiceChanges/Page_Publish - Enterprise Product Catalogue/button_Publish'))

