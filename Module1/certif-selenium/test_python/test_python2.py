import time
import logging
import pytest
from selenium import webdriver
logging.basicConfig(level=logging.INFO)

@pytest.mark.skip
def test():
    driver = webdriver.Chrome()  
    driver.get('https://www.python.org/doc/')
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'https://www.python.org/doc/', ErrMsg

