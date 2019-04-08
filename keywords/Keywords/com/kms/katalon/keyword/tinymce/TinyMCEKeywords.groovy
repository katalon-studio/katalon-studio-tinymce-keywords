package com.kms.katalon.keyword.tinymce

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import groovy.transform.CompileStatic

public class TinyMCEKeywords {
	static WebDriver driver = DriverFactory.getWebDriver()

	/**
	 * Set the content of entire input area. It will replaces editor data by the new text.
	 *
	 * @param iFrame The <iframe> object that contains the text editor body.
	 * @param body The <body> object that needs to set text.
	 * @param text The text needs to set.
	 */
	@CompileStatic
	@Keyword
	static void setText(TestObject iFrame, TestObject body, String text) throws IOException {
		WebUI.switchToFrame(iFrame, 60)
		WebUI.setText(body, text)
		driver.switchTo().defaultContent()
	}

	/**
	 * Set the content to input area. It keeps the existing editor data.
	 *
	 * @param iFrame The <iframe> object that contains the text editor body.
	 * @param body The <body> object that needs to set text.
	 * @param text The text needs to set.
	 */
	@CompileStatic
	@Keyword
	static void sendKeys(TestObject iFrame, TestObject body, String text) throws IOException {
		WebUI.switchToFrame(iFrame, 60)
		WebUI.sendKeys(body, text)
		driver.switchTo().defaultContent()
	}

	/**
	 * Clear all the content of the text editor.
	 *
	 * @param iFrame The <iframe> object that contains the text editor body.
	 * @param body The <body> object that needs to clear text.
	 */
	@CompileStatic
	@Keyword
	static void clearAll(TestObject iFrame, TestObject body) throws IOException {
		WebUI.switchToFrame(iFrame, 60)
		WebUI.clearText(body)
		driver.switchTo().defaultContent()
	}

	/**
	 * Select all the content of the text editor.
	 *
	 * @param iFrame The <iframe> object that contains the text editor body.
	 * @param body The <body> object that needs to select the text.
	 */
	@CompileStatic
	@Keyword
	static void selectAll(TestObject iFrame, TestObject body) throws IOException {
		WebUI.switchToFrame(iFrame, 0)
		WebElement element = WebUiCommonHelper.findWebElement(body, 60)
		Actions actions = new Actions(driver)
		actions.click(element).keyDown(Keys.LEFT_CONTROL).sendKeys("a").keyUp(Keys.LEFT_CONTROL).perform()
		driver.switchTo().defaultContent()
	}
}
