import time
import logging
import pytest
from selenium.webdriver.common.by import By
from selenium import webdriver
logging.basicConfig(level=logging.INFO)

@pytest.mark.skip
def test():
    driver = webdriver.Chrome()  
    driver.get('https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert', ErrMsg
    fr = driver.find_element(By.NAME,"__tcfapiLocator")
    driver.switch_to.frame(fr)
    driver.switch_to.default_content()
