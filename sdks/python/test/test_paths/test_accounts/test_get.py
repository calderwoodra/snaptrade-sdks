# coding: utf-8

"""


    Generated by: https://konfigthis.com
"""

import unittest
from unittest.mock import patch

import urllib3

import snaptrade_client
from snaptrade_client.paths.accounts import get  # noqa: E501
from snaptrade_client import configuration, schemas, api_client

from .. import ApiTestMixin


class TestAccounts(ApiTestMixin, unittest.TestCase):
    """
    Accounts unit test stubs
        List all investment accounts for the user  # noqa: E501
    """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    response_status = 200




if __name__ == '__main__':
    unittest.main()
