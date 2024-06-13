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

WebUI.openBrowser('https://lonlinux03.cerillion.com:21343/epc/main.html?project#dashboard')

WebUI.delay(50)

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Dashboard - Enterprise Product Catalogue/a_File'))

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Dashboard - Enterprise Product Catalogue/a_Import Project'))

WebUI.uploadFile(findTestObject('Object Repository/IOEVER/Page_Import Project - Enterprise Product Catalogue/span_Select File_glyphicon glyphicon-folder-open'), 
    'C:/Users/pooja.borawake/Downloads/project0v1 (1).xml')

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Import Project - Enterprise Product Catalogue/button_Import Project'))

WebUI.click(findTestObject('Object Repository/IOEVER/Page_Import Project - Enterprise Product Catalogue/button_ImportProject'))

WebUI.delay(30)

