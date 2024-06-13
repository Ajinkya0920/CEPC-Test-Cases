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

WebUI.navigateToUrl('https://lonlinux03.cerillion.com:21343/epc/main.html#dashboard')

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/h4_IO - IOPROD_Project'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Version 1'))

WebUI.click(findTestObject('Object Repository/Page_Catalogues - Enterprise Product Catalogue/button_New Page'))

WebUI.click(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/a_Existing'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/select_Account Loyalty Earning RateAccount _1781eb'), 
    'COMBO', true)

WebUI.doubleClick(findTestObject('Object Repository/Page_Catalogue View - Enterprise Product Catalogue/td_CVLAN'))

WebUI.clickOffset(findTestObject('canvas'), 1, -11)

WebUI.delay(5)

