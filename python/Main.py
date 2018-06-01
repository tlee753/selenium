from selenium import webdriver


driver = webdriver.Firefox()
print("hit 1")

# driver.set_page_load_timeout(10)
# print("hit 2")

driver.get("http://google.com")
print("hit 3")

driver.quit()
