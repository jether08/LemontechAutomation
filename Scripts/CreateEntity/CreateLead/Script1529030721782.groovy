import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('https://supplyport4qa04.supplypro.com/Login.aspx')

WebUI.setText(findTestObject('Lead/Page_SupplySystem/input_txtUserName'), '-admin')

WebUI.setText(findTestObject('Lead/Page_SupplySystem/input_txtPassword'), 'admin')

WebUI.setText(findTestObject('Lead/Page_SupplySystem/input_txtCompanyCode'), 'spcs')

WebUI.click(findTestObject('Lead/Page_SupplySystem/input_btnLogin'))

WebUI.delay(3)

WebUI.click(findTestObject('Lead/Page_Home/span_'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.scrollToElement(findTestObject('Lead/Page_Home/i_fa fa-bars'), 3)

WebUI.waitForElementClickable(findTestObject('Lead/Page_Home/i_fa fa-bars'), 3)

WebUI.mouseOver(findTestObject('Lead/Page_Home/i_fa fa-bars'))

WebUI.mouseOver(findTestObject('Lead/Page_Home/ul_Welcome'))

WebUI.click(findTestObject('Lead/Page_Home/i_fa fa-bars'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.click(findTestObject('Lead/Page_Home/small'))

WebUI.delay(3)

WebUI.setText(findTestObject('Lead/Page_Home/input_searchtype-partner'), 'jtestpart')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Lead/Page_Home/a_jtestpartner1'))

WebUI.scrollToElement(findTestObject('Lead/Page_Home/i_fa fa-bars'), 3)

WebUI.waitForElementClickable(findTestObject('Lead/Page_Home/i_fa fa-bars'), 3)

WebUI.mouseOver(findTestObject('Lead/Page_Home/i_fa fa-bars'))

WebUI.click(findTestObject('Lead/Page_Home/i_fa fa-bars'))

WebUI.click(findTestObject('Lead/Page_Home/a_Leads'))

WebUI.click(findTestObject('Lead/Page_Search Lead/input_ctl00MainContentPlaceHol'))

WebUI.setText(findTestObject('Lead/Page_AddEdit Lead/input_Name'), LeadName)

LeadName = WebUI.getText(findTestObject('Lead/Page_AddEdit Lead/input_Name'))

WebUI.focus(findTestObject('Lead/Page_AddEdit Lead/div_Alias_tagsinput'))

WebUI.waitForElementClickable(findTestObject('Lead/Page_AddEdit Lead/div_Alias_tagsinput'), 3)

WebUI.click(findTestObject('Lead/Page_AddEdit Lead/div_Alias_tagsinput'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Lead/input_Alias_tag'), Alias)

WebUI.sendKeys(findTestObject('Lead/Page_AddEdit Lead/div_Alias_tagsinput'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Lead/Page_AddEdit Lead/a_YES'))

WebUI.click(findTestObject('Lead/Page_AddEdit Lead/a_YES2'))

WebUI.click(findTestObject('Lead/Page_AddEdit Lead/a_YES3'))

WebUI.scrollToElement(findTestObject('Lead/Page_AddEdit Lead/button_Save'), 0)

WebUI.click(findTestObject('Lead/Page_AddEdit Lead/button_Save'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Lead/Page_AddEdit Lead/div_The record was successfull'), 'The record was successfully saved.')

'Test Successful. Created New Lead Entity'
LeadName = WebUI.verifyElementText(findTestObject('Lead/NewLead'), LeadName)

KeywordLogger log = new KeywordLogger()

log.logPassed('Successful Creating New Lead')

WebUI.closeBrowser()

