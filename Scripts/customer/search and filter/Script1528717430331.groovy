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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-business.ontroapp.com/')

WebUI.setText(findTestObject('Page_Ontro/input_email'), 'bala@ontroapp.com')

WebUI.setText(findTestObject('Page_Ontro/input_password'), 'password')

WebUI.click(findTestObject('Page_Ontro/button_Login'))

WebUI.click(findTestObject('Page_Ontro/span_Customers'))

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the venueBahu Ve'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the statusNewAct'), 'new', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the ClassPlanA_O'), '1', true)

WebUI.click(findTestObject('Page_Ontro/div_1'))

WebUI.click(findTestObject('Page_Ontro/html_.swal-icon--errorborder-c'))

WebUI.click(findTestObject('Page_Ontro/div_3'))

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the venueBahu Ve'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the statusNewAct'), 'active', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the ClassPlanA_O'), '3', true)

WebUI.click(findTestObject('Page_Ontro/html_.swal-icon--errorborder-c_1'))

WebUI.click(findTestObject('Page_Ontro/div_3'))

WebUI.click(findTestObject('Page_Ontro/div_5'))

WebUI.click(findTestObject('Page_Ontro/div_7'))

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the venueBahu Ve'), '2', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the statusNewAct'), 'inactive', true)

WebUI.selectOptionByValue(findTestObject('Page_Ontro/select_Select the ClassPlanA_O'), '15', true)

WebUI.click(findTestObject('Page_Ontro/button_Filter'))

WebUI.setText(findTestObject('Page_Ontro/input_form-control'), 'Tokin')

WebUI.sendKeys(findTestObject('Page_Ontro/input_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Ontro/span_Customers'))

WebUI.setText(findTestObject('Page_Ontro/input_form-control'), 'desmond')

WebUI.sendKeys(findTestObject('Page_Ontro/input_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Ontro/td_desmond'))

WebUI.closeBrowser()

