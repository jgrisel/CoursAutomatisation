# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.DEBUG)
    
def test_screenshot():
    BR1=webdriver.Chrome()
    BR2=webdriver.Chrome()
    
    BR1.get("https://www.python.org")
    BR1.get_screenshot_as_file("C:\\Users\\qdusser\\Documents\\screenshot\\BR1.png")
    BR2.get("https://www.w3.org/")
    BR2.get_screenshot_as_file("C:\\Users\\qdusser\\Documents\\screenshot\\BR2.png")
    
    assert BR1.title == 'Welcome to Python.org', "le titre de la page n'est pas celui attendu"
    assert BR2.title == 'World Wide Web Consortium (W3C)', "le titre de la page n'est pas celui attendu"
    
    
