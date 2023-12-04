import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

def dayOfWeek = new Date().format("EEEE")

if (!(dayOfWeek in ["Saturday", "Sunday"])) {
	
	WebUI.openBrowser(GlobalVariable.url)
	
	WebUI.setText(findTestObject('Object Repository/Page_greytHR IDP/input_username'), GlobalVariable.user)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_greytHR IDP/input_password'), GlobalVariable.password)
	
	WebUI.click(findTestObject('Page_greytHR IDP/button_Log in'))
	
	WebUI.click(findTestObject('Page_greytHR IDP/button_SignInOut'))

} else {
	println "Week off : $dayOfWeek"
}
