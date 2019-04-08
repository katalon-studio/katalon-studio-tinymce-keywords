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

//'Open browser and navigate to a site that has an iframe'
WebUI.openBrowser("https://www.tiny.cloud/")

//setText
CustomKeywords.'com.kms.katalon.keyword.tinymce.TinyMCEKeywords.setText'(findTestObject('Object Repository/Page_tinyMCEDemo/iframe'),findTestObject('Object Repository/Page_tinyMCEDemo/body') , "text1")

//sendkeys
CustomKeywords.'com.kms.katalon.keyword.tinymce.TinyMCEKeywords.sendKeys'(findTestObject('Object Repository/Page_tinyMCEDemo/iframe'),findTestObject('Object Repository/Page_tinyMCEDemo/body') , "text3")

//select all
CustomKeywords.'com.kms.katalon.keyword.tinymce.TinyMCEKeywords.selectAll'(findTestObject('Object Repository/Page_tinyMCEDemo/iframe'), findTestObject('Object Repository/Page_tinyMCEDemo/body'))
WebUI.click(findTestObject('Object Repository/Page_tinyMCEDemo/Align_Center'))
WebUI.click(findTestObject('Object Repository/Page_tinyMCEDemo/Align left'))

//clear all
CustomKeywords.'com.kms.katalon.keyword.tinymce.TinyMCEKeywords.clearAll'(findTestObject('Object Repository/Page_tinyMCEDemo/iframe'),findTestObject('Object Repository/Page_tinyMCEDemo/body') )