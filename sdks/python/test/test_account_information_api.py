"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
"""


import unittest

import snaptrade_client
from snaptrade_client.api.account_information_api import AccountInformationApi  # noqa: E501


class TestAccountInformationApi(unittest.TestCase):
    """AccountInformationApi unit test stubs"""

    def setUp(self):
        self.api = AccountInformationApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_all_user_holdings(self):
        """Test case for get_all_user_holdings

        List all accounts for the user, plus balances and positions for each account.  # noqa: E501
        """
        pass

    def test_get_user_account_balance(self):
        """Test case for get_user_account_balance

        Get all cash balances of an investment account  # noqa: E501
        """
        pass

    def test_get_user_account_details(self):
        """Test case for get_user_account_details

        Return details of a specific investment account  # noqa: E501
        """
        pass

    def test_get_user_account_orders(self):
        """Test case for get_user_account_orders

        Get all history of orders placed in account  # noqa: E501
        """
        pass

    def test_get_user_account_positions(self):
        """Test case for get_user_account_positions

        Get all positions of an investment account  # noqa: E501
        """
        pass

    def test_get_user_holdings(self):
        """Test case for get_user_holdings

        List balances, positions and orders for the specified account.  # noqa: E501
        """
        pass

    def test_list_user_accounts(self):
        """Test case for list_user_accounts

        List all investment accounts for the user  # noqa: E501
        """
        pass

    def test_update_user_account(self):
        """Test case for update_user_account

        Update details of an investment account  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
