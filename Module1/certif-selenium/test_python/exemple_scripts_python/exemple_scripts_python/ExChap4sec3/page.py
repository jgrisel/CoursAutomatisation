import logging
from selenium import webdriver

class BasePage(object):

    def __init__(self, driver):
        self.driver = driver

class HomePage(BasePage):
    url = "http://automationpractice.com/index.php"
    
    def getTitle(self):
        return self.driver.title

    def search_product(self, product):
        self.driver.find_element_by_id('search_query_top').send_keys(product)
        self.driver.find_element_by_name('submit_search').click()
        return SearchResultPage(self.driver)
        
class SearchResultPage(BasePage):


    def select_product(self, index_product):
        self.driver.find_element_by_xpath("//ul/li["+index_product+"]//a[@title='Add to cart']").click()
        return ShoppingCartModalPage(self.driver)

class ShoppingCartModalPage(BasePage):
    url="https://blabla"