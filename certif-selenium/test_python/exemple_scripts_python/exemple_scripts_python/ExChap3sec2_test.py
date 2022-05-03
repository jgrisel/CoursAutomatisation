# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.DEBUG)
def test_selenium_1():
    driver=webdriver.Chrome()
    driver.get('https://www.python.org')
    assert driver.current_url=='https://www.python.org/', "l'url n'est pas celle attendue"
    assert driver.title == 'Welcome to Python.org', "le titre de la page n'est pas celui attendu"