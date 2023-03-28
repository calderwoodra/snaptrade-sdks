# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from snaptrade_client import schemas  # noqa: F401


class ExcludedAsset(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    An excluded asset in a portfolio group
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def symbol() -> typing.Type['UniversalSymbol']:
                return UniversalSymbol
            __annotations__ = {
                "symbol": symbol,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["symbol"]) -> 'UniversalSymbol': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["symbol"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["symbol"]) -> typing.Union['UniversalSymbol', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["symbol"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        symbol: typing.Union['UniversalSymbol', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'ExcludedAsset':
        return super().__new__(
            cls,
            *args,
            symbol=symbol,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.universal_symbol import UniversalSymbol
