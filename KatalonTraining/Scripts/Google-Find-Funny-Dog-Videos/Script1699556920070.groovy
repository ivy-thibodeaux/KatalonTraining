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

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_q'), 'funny dog videos')

WebUI.navigateToUrl('https://www.google.com/search?q=funny+dog+videos&sca_esv=580917885&source=hp&ei=kS9NZciUIJSekPIP2Y20oAc&iflsig=AO6bgOgAAAAAZU09ocg0MyugYy4GtOssLjQyuSDs-31M&oq=funny+dog+videos&gs_lp=Egdnd3Mtd2l6IhBmdW5ueSBkb2cgdmlkZW9zKgIIADIIEAAYgAQYsQMyBRAAGIAEMgsQABiABBixAxiDATIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgARIgyNQhApY_BxwAXgAkAEBmAFcoAHLCKoBAjE2uAEDyAEA-AEBqAIKwgIQEAAYAxiPARjlAhjqAhiMA8ICEBAuGAMYjwEY5QIY6gIYjAPCAhEQLhiABBixAxiDARjHARjRA8ICERAuGIMBGMcBGLEDGNEDGIAEwgILEC4YgAQYsQMYgwHCAgsQABiKBRixAxiDAcICDhAuGMcBGLEDGNEDGIAEwgILEC4YgAQYxwEY0QPCAgUQLhiABMICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQM&sclient=gws-wiz')

WebUI.verifyElementText(findTestObject('Object Repository/Page_funny dog videos - Google Search/textarea_funny dog videos'), 
    'funny dog videos')

WebUI.closeBrowser()

