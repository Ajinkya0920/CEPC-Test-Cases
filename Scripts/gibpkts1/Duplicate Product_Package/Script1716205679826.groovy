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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:19103/epc/main.html?project=28#dashboard')

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Password_password'), '/5S6MFFLcE4A78PC0HwgEA==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to GIBPKTS1CEPC/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/div_Gibtelecom - Pooja_DemoEdited 1523 (Me 1523)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Version 1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/select_Account Loyalty Earning RateAccount _1781eb'), 
    'PRODUCT', true)

WebUI.delay(5)

TestObject dragDropValue = new TestObject('DropDownValue').addProperty('xpath', ConditionType.EQUALS, './/td[text()="100 SMS £5"]')

WebUI.waitForElementVisible(dragDropValue, 30)

WebUI.dragAndDropByOffset(dragDropValue, 500, 300, FailureHandling.OPTIONAL)

WebUI.clickOffset(findTestObject('canvas'), 0, 0, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.rightClickOffset(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/canvas'), 
    0, 0)

WebUI.click(findTestObject('Object Repository/Gibtel/Page_Catalogue View - Enterprise Product Catalogue/a_Duplicate'))

