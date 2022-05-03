# à exécuter : pytest --html=report.html -s

import pytest
import logging as log
import time
log.basicConfig(level=logging.DEBUG)
def test_localtime():
   print('What\'s the time ?')
   log.info(time.localtime())
   assert time.localtime().tm_hour < 12, "It too late!"
   log.info("it's still time")