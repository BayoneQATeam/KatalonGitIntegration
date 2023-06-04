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

WebUI.navigateToUrl('https://fengyuanchen.github.io/datepicker/')

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/input_Demo_date'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_June 2023'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_2023'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_2000'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_Jun'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/li_8'))

WebUI.click(findTestObject('Object Repository/DatePickerObjects/Page_Datepicker/i_Demo_fa fa-calendar'))

WebUI.closeBrowser()

