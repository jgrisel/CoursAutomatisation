import time
import logging
import pytest
logger = logging.getLogger()
logger.setLevel(logging.DEBUG)

@pytest.mark.skip 
def test():

    logger.debug("debugCAT")
    logger.info("info")
    logger.warning("warning")
    logger.error("error")
    logger.critical("critical")
    t = time.localtime()
    logging.info(t)
    print("tm_hour:", t.tm_hour)
    if t.tm_hour<12 :
        print ("it's before 12.00")
    else :
        print("it's after 12.00")