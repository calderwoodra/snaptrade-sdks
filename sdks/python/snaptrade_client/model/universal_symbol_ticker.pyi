# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Created by: https://snaptrade.com/
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


class UniversalSymbolTicker(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Universal symbol
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
            symbol = schemas.StrSchema
            raw_symbol = schemas.StrSchema
            description = schemas.StrSchema
        
            @staticmethod
            def currency() -> typing.Type['Currency']:
                return Currency
        
            @staticmethod
            def exchange() -> typing.Type['Exchange']:
                return Exchange
        
            @staticmethod
            def type() -> typing.Type['SecurityType']:
                return SecurityType
            
            
            class currencies(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    @staticmethod
                    def items() -> typing.Type['Currency']:
                        return Currency
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple['Currency'], typing.List['Currency']],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'currencies':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> 'Currency':
                    return super().__getitem__(i)
            __annotations__ = {
                "id": id,
                "symbol": symbol,
                "raw_symbol": raw_symbol,
                "description": description,
                "currency": currency,
                "exchange": exchange,
                "type": type,
                "currencies": currencies,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["symbol"]) -> MetaOapg.properties.symbol: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["raw_symbol"]) -> MetaOapg.properties.raw_symbol: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["description"]) -> MetaOapg.properties.description: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currency"]) -> 'Currency': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["exchange"]) -> 'Exchange': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["type"]) -> 'SecurityType': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["currencies"]) -> MetaOapg.properties.currencies: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["symbol"], typing_extensions.Literal["raw_symbol"], typing_extensions.Literal["description"], typing_extensions.Literal["currency"], typing_extensions.Literal["exchange"], typing_extensions.Literal["type"], typing_extensions.Literal["currencies"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["symbol"]) -> typing.Union[MetaOapg.properties.symbol, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["raw_symbol"]) -> typing.Union[MetaOapg.properties.raw_symbol, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["description"]) -> typing.Union[MetaOapg.properties.description, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currency"]) -> typing.Union['Currency', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["exchange"]) -> typing.Union['Exchange', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["type"]) -> typing.Union['SecurityType', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["currencies"]) -> typing.Union[MetaOapg.properties.currencies, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["symbol"], typing_extensions.Literal["raw_symbol"], typing_extensions.Literal["description"], typing_extensions.Literal["currency"], typing_extensions.Literal["exchange"], typing_extensions.Literal["type"], typing_extensions.Literal["currencies"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        symbol: typing.Union[MetaOapg.properties.symbol, str, schemas.Unset] = schemas.unset,
        raw_symbol: typing.Union[MetaOapg.properties.raw_symbol, str, schemas.Unset] = schemas.unset,
        description: typing.Union[MetaOapg.properties.description, str, schemas.Unset] = schemas.unset,
        currency: typing.Union['Currency', schemas.Unset] = schemas.unset,
        exchange: typing.Union['Exchange', schemas.Unset] = schemas.unset,
        type: typing.Union['SecurityType', schemas.Unset] = schemas.unset,
        currencies: typing.Union[MetaOapg.properties.currencies, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'UniversalSymbolTicker':
        return super().__new__(
            cls,
            *args,
            id=id,
            symbol=symbol,
            raw_symbol=raw_symbol,
            description=description,
            currency=currency,
            exchange=exchange,
            type=type,
            currencies=currencies,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.currency import Currency
from snaptrade_client.model.exchange import Exchange
from snaptrade_client.model.security_type import SecurityType
