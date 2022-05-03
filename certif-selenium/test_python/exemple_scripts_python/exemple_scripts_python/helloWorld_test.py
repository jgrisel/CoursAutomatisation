import pytest
import logging
logging.basicConfig(level=logging.DEBUG)
def test_hello():
    print('Hello World')
    logging.info("Hello World INFO")
    logging.debug("Hello World DEBUG")
    logging.warning("Hello World WARNING")