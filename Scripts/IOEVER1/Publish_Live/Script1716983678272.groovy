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

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Publish'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Enterprise Product Catalogue/a_Publish_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_Select an optionIO - TestProjectIO -_52147f'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_Select an optionIOEVER1 CCSIOEVER1 CRM'), 
    '0', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Publish - Enterprise Product Catalogue/select_CompleteDelta'), 
    'COMPLETE', true)

WebUI.click(findTestObject('IOEVER/Page_Publish - Enterprise Product Catalogue/button_Publish'))

WebUI.delay(20)

