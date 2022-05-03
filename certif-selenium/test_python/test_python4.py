import time
import logging
import pytest
from selenium.webdriver.common.by import By
from selenium import webdriver
logging.basicConfig(level=logging.INFO)

@pytest.mark.skip
def test():
    dr1 = webdriver.Chrome()
    dr1.get('https://www.python.org/')
    dr1.get_screenshot_as_file('C:\\Users\\jgrisel\\Desktop\\test\\screenshot\\f.png')
    dr2 = webdriver.Chrome()
    dr2.get('https://www.w3.org/')
    dr1.get_screenshot_as_file('C:\\Users\\jgrisel\\Desktop\\test\\screenshot\\p.png')
    dr1.maximize_window()
    dr2.maximize_window()
    ErrMsg = "mauvaise page"
    assert dr1.title == 'Welcome to Python.org', ErrMsg
    assert dr2.title == 'World Wide Web Consortium (W3C)', ErrMsg
   
