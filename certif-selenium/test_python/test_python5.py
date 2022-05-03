import time
import logging
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By


@pytest.mark.skip
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    fr = driver.find_element(By.ID,"search_query_top")
    fr_ID = fr.get_attribute('ID')
    print ('fr_ID: '+ fr_ID)
