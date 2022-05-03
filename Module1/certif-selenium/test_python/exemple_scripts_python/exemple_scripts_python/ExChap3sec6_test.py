# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.WARNING)

driver=webdriver.Chrome()

def test_recuperer_text():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_class_name('login')
    print("VOICI LE TEXTE DE L'ELEMENT BOUTON SIGNIN : "+ driver.find_element_by_class_name('login').text)

def test_recuperer_attribut():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_class_name('login')
    print("VOICI LE TEXTE DE L'ELEMENT BOUTON SIGNIN : "+ driver.find_element_by_class_name('login').get_attribute('href'))
    
def test_verifier_etat():
    driver.get('http://automationpractice.com/index.php?id_category=8&controller=category#/categories-casual_dresses/compositions-cotton')
    checkbox=driver.find_element_by_id('layered_id_attribute_group_1')
    print(checkbox.is_selected())
    checkbox.click()
    #sleep(1000)
    print(checkbox.is_selected())