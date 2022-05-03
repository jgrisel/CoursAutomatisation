import time
import logging
import pytest
import helpers
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select


@pytest.mark.skip
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    fr = driver.find_element_by_class_name('login')
    fr_class = fr.get_attribute('class')
    print ('fr_class: '+ fr_class)
    
@pytest.mark.skip   
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.TAG_NAME,"h1")
    tag_n = tag.text
    print ('tag: '+ tag_n)
    
@pytest.mark.skip     
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.LINK_TEXT,"Contact us")
    tag_n = tag.text
    print ('tag: '+ tag_n)
    
@pytest.mark.skip 
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.XPATH,"//input[@id='search_query_top']")
    tag_n = tag.get_attribute('ID')
    print ('tag: '+ tag_n)
    
@pytest.mark.skip     
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.LINK_TEXT,"Sign in")
    tag_n = tag.text
    print ('tag: '+ tag_n)
    
@pytest.mark.skip    
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.LINK_TEXT,"Sign in")
    tag_n = tag.get_attribute('href')
    print ('tag: '+ tag_n)
    
@pytest.mark.skip      
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php?id_category=8&controller=category#/')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php?id_category=8&controller=category#/', ErrMsg
    element = driver.find_element(By.XPATH,"//input[@value='1_1']")
    checkbox_state = element.is_selected()
    assert checkbox_state == False
    time.sleep(5)
    element.click()
    assert element.is_selected() == True
    print(checkbox_state)
     
@pytest.mark.skip     
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    tag = driver.find_element(By.LINK_TEXT,"Sign in")
    tag_n = tag.get_attribute('href')
    print ('tag: '+ tag_n)
    tag.click()
    assert driver.current_url == 'http://automationpractice.com/index.php?controller=authentication&back=my-account', ErrMsg
    
@pytest.mark.skip 
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php?controller=prices-drop')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php?controller=prices-drop', ErrMsg
    select = driver.find_element(By.ID,"selectProductSort")
    select.click()
    option_select = driver.find_element(By.XPATH,"//option[contains(text(),'In stock')]")
    option_select.click()
    
@pytest.mark.skip     
def test():
    driver = webdriver.Chrome()  
    driver.get('http://automationpractice.com/index.php')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'http://automationpractice.com/index.php', ErrMsg
    element = driver.find_element(By.CSS_SELECTOR,"ul#homefeatured li:first-of-type")
    element.click()
    button = driver.find_element(By.XPATH,"//span[contains(text(),'Add to cart')]")
    button.click()
    time.sleep(5)
    modal = driver.find_element(By.ID,"layer_cart")
    time.sleep(5)
    button1 = modal.find_element(By.PARTIAL_LINK_TEXT,"Proceed to checkout")
    time.sleep(3)
    button1.click()
    assert driver.title == 'Order - My Store', ErrMsg
    

def test():
    driver = webdriver.Chrome()  
    driver.get('https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert')
    driver.maximize_window()
    ErrMsg = "mauvaise page"
    assert driver.current_url == 'https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert', ErrMsg
    fr = driver.find_element(By.NAME,"__tcfapiLocator")
    driver.switch_to.frame(fr)
    driver.switch_to.default_content()
    button_accept = driver.find_element(By.ID,"accept-choices")
    button_accept.click()
    fr2 = driver.find_element(By.ID,"iframeResult")
    driver.switch_to.frame(fr2)
    button = driver.find_element(By.XPATH, "//button[contains(text(),'Try it')]")
    button.click()
    time.sleep(3)
    alert = driver.switch_to.alert
    msg_text = alert.text
    expected_text = 'Hello! I am an alert box!'
    assert expected_text in msg_text, "I am an alert box!"