# à exécuter : pytest --html=report.html -s

import time
import logging
from selenium import webdriver
from selenium.webdriver.support.ui import Select
logging.basicConfig(level=logging.WARNING)
driver=webdriver.Chrome()

def test_click():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_class_name('login').click()
    logging.info('salut Arnaud')
	assert driver.title=='Login - My Store', "la page affichée n'est pas celle attendue"
 
def test_select(): 
    driver.get('http://automationpractice.com/index.php?controller=prices-drop')
    select = Select(driver.find_element_by_id('selectProductSort'))
    select.select_by_visible_text('In stock')
    assert driver.find_element_by_xpath("//option[.='In stock']").is_selected(), "l'option sélectionnée n'est pas celle attendue"
    
def test_modal():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_xpath("//span[.='Add to cart']").click()
    modal=driver.find_element_by_id('layer_cart')
    time.sleep(2)
    modal.find_element_by_xpath("//span[contains(.,'checkout')]").click()
    assert driver.title=='Order - My Store', "Le titre de la page n'est pas celui attendu"