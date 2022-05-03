import logging
from selenium import webdriver
logging.basicConfig(level=logging.INFO)
driver=webdriver.Chrome()

recherche='printed dress'
numero_produit='1'


def test_kdt():
    aller_sur_la_page_index()
    rechercher_un_produit(recherche)
    ajouter_le_resultat_numero(numero_produit)
    
    
    
    
    
    
    
def aller_sur_la_page_index():
     driver.get('http://automationpractice.com/index.php')

def rechercher_un_produit(produit):
    driver.find_element_by_id('search_query_top').send_keys(produit)
    driver.find_element_by_name('submit_search').click()
    

def ajouter_le_resultat_numero(index):
    driver.find_element_by_xpath("//ul/li["+index+"]//a[@title='Add to cart']").click()