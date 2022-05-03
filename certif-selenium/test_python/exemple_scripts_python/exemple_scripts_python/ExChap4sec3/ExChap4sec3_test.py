# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
import page


logging.basicConfig(level=logging.INFO)
driver=webdriver.Chrome()


def test_page_object():
    
    driver.get('http://automationpractice.com/index.php')
    home_page=page.HomePage(driver)
    assert "My Store"==home_page.getTitle()
    search_result_page=home_page.search_product('chiffon')
    search_result_page.select_product('1')    