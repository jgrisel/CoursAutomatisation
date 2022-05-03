# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.WARNING)
driver=webdriver.Chrome()

def test_localiser_id():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_id('search_query_top')
    print("VOICI L'ELEMENT CHAMP RECHERCHE")

def test_localiser_class():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_class_name('login')
    print("VOICI L'ELEMENT BOUTON SIGNIN")


def test_localiser_tag():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_tag_name('h1')
    print("VOICI L'ELEMENT TITRE")
    
def test_localiser_link_test():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_link_text('Contact us')
    print("VOICI L'ELEMENT LIEN CONTACT US")
    driver.find_element_by_partial_link_text('Contact us')
    print("VOICI L'ELEMENT LIEN CONTACT US par recherche partielle")
    
def test_localiser_xpath():
    driver.get('http://automationpractice.com/index.php')
    driver.find_element_by_xpath("//input[@id='search_query_top']")
    print("VOICI L'ELEMENT CHAMP RECHERCHE par xpath")
