# à exécuter : pytest --html=report.html -s

import logging
from selenium import webdriver
logging.basicConfig(level=logging.INFO)
def test_alerte():
    driver=webdriver.Chrome()
    driver.get('https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert')
    driver.switch_to.frame('iframeResult')
    driver.find_element_by_xpath("//button[.='Try it']").click()
    alert=driver.switch_to.alert
    assert "Hello! I am an alert box!"==alert.text, "le message de l'alerte n'est pas celui attendu"
    logging.info("Le message de l'alerte est correct")
    alert.accept()
    driver.quit()