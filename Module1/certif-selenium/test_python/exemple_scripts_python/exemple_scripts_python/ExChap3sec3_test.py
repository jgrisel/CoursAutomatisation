# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.DEBUG)
def test_frame():
    driver=webdriver.Chrome()
    driver.maximize_window()
    driver.get('https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert')
    driver.switch_to.frame('iframeResult')
    driver.switch_to.default_content
    
def test_2_navigateur():
    BR1=webdriver.Chrome()
    BR2=webdriver.Chrome()
    
    BR1.get("https://www.python.org")
    BR2.get("https://www.w3.org/")
    
    assert BR1.title == 'Welcome to Python.org', "le titre de la page n'est pas celui attendu"
    assert BR2.title == 'World Wide Web Consortium (W3C)', "le titre de la page n'est pas celui attendu"
    
    
