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


class TransactionsStatus(
    schemas.AnyTypeSchema,
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Status of account transaction sync
    """


    class MetaOapg:
        
        class properties:
            initial_sync_completed = schemas.BoolSchema
        
            @staticmethod
            def last_successful_sync() -> typing.Type['SyncStatusDate']:
                return SyncStatusDate
        
            @staticmethod
            def first_transaction_date() -> typing.Type['SyncStatusDate']:
                return SyncStatusDate
            __annotations__ = {
                "initial_sync_completed": initial_sync_completed,
                "last_successful_sync": last_successful_sync,
                "first_transaction_date": first_transaction_date,
            }

    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["initial_sync_completed"]) -> MetaOapg.properties.initial_sync_completed: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_successful_sync"]) -> 'SyncStatusDate': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["first_transaction_date"]) -> 'SyncStatusDate': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["initial_sync_completed", "last_successful_sync", "first_transaction_date", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["initial_sync_completed"]) -> typing.Union[MetaOapg.properties.initial_sync_completed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_successful_sync"]) -> typing.Union['SyncStatusDate', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["first_transaction_date"]) -> typing.Union['SyncStatusDate', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["initial_sync_completed", "last_successful_sync", "first_transaction_date", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        initial_sync_completed: typing.Union[MetaOapg.properties.initial_sync_completed, bool, schemas.Unset] = schemas.unset,
        last_successful_sync: typing.Union['SyncStatusDate', schemas.Unset] = schemas.unset,
        first_transaction_date: typing.Union['SyncStatusDate', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'TransactionsStatus':
        return super().__new__(
            cls,
            *args,
            initial_sync_completed=initial_sync_completed,
            last_successful_sync=last_successful_sync,
            first_transaction_date=first_transaction_date,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.sync_status_date import SyncStatusDate
