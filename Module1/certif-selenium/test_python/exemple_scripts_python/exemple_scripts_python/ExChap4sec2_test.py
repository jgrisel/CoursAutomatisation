# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By

logging.basicConfig(level=logging.INFO)
driver=webdriver.Chrome()


def test_implicit_wait():
    driver.implicitly_wait(10)
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_id('search_query_top').send_keys('a')
    driver.find_element_by_name('submit_search').click()
    assert "No result" in driver.find_element_by_xpath("//div[@id='center_column']/p").text, "le message de résultat n'est pas affiché"
    logging.info('La recherche a été effectuée correctement')
    
def test_explicit_wait():
    wait=WebDriverWait(driver,10)
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_id('search_query_top').send_keys('a')
    driver.find_element_by_name('submit_search').click()
    #Explicit wait
    resultat_recherche = wait.until(EC.visibility_of_element_located((By.XPATH, "//div[@id='center_column']/p")))
    assert "No result" in resultat_recherche.text, "le message de résultat n'est pas affiché"
    logging.info('La recherche a été effectuée correctement')
    driver.quit()