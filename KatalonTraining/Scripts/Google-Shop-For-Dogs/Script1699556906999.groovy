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

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_q'), 'shop for dogs')

WebUI.navigateToUrl('https://www.google.com/search?q=shop+for+dogs&sca_esv=580917885&source=hp&ei=2y9NZdmVGuqtqtsPureayA4&iflsig=AO6bgOgAAAAAZU096_gzItZj5W9I9YsTQz1DGNNTPm84&ved=0ahUKEwiZ7_e70LeCAxXqlmoFHbqbBukQ4dUDCAw&uact=5&oq=shop+for+dogs&gs_lp=Egdnd3Mtd2l6Ig1zaG9wIGZvciBkb2dzMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyCBAAGBYYHhgKMgYQABgWGB4yCBAAGBYYHhgPMgYQABgWGB4yBhAAGBYYHkiBL1DoFFiJLnAEeACQAQGYAecCoAG9DaoBCDEyLjQuMC4xuAEDyAEA-AEBqAIKwgIQEAAYAxiPARjlAhjqAhiMA8ICEBAuGAMYjwEY5QIY6gIYjAPCAg4QLhjHARixAxjRAxiABMICDhAuGIAEGLEDGMcBGNEDwgIREC4YgAQYsQMYgwEYxwEY0QPCAgsQLhiABBixAxiDAcICCBAAGIAEGLEDwgILEAAYgAQYsQMYgwHCAggQLhiABBixA8ICCBAAGIAEGMkDwgIIEAAYigUYkgPCAggQLhixAxiABMICCxAAGIAEGLEDGMkDwgIIEAAYgAQYkgPCAgsQLhiABBixAxjUAsICCxAuGIAEGMcBGNEDwgIREC4YigUYsQMYgwEYxwEY0QPCAgUQLhiABMICCxAuGIoFGLEDGIMBwgIOEC4YigUYsQMYxwEY0QPCAgsQABiKBRixAxiDAcICCBAAGIoFGLEDwgILEC4YgAQYxwEYrwHCAg4QABiABBixAxiDARjJAw&sclient=gws-wiz')

WebUI.click(findTestObject('Object Repository/Page_shop for dogs - Google Search/span_Shopping'))

WebUI.click(findTestObject('Object Repository/Page_shop for dogs - Google Shopping/h2_Shop shop for dogs'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_shop for dogs - Google Shopping/h2_Shop shop for dogs'), 
    'Shop shop for dogs')

WebUI.closeBrowser()

