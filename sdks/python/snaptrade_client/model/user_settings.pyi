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


class UserSettings(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Passiv user account settings
    """


    class MetaOapg:
        
        class properties:
            email = schemas.StrSchema
            name = schemas.StrSchema
            receive_cash_notification = schemas.BoolSchema
            receive_drift_notification = schemas.BoolSchema
            user_trial_activated = schemas.BoolSchema
            activated_trial_date = schemas.StrSchema
            demo = schemas.BoolSchema
            api_enabled = schemas.BoolSchema
            drift_threshold = schemas.NumberSchema
        
            @staticmethod
            def preferred_currency() -> typing.Type['Currency']:
                return Currency
            __annotations__ = {
                "email": email,
                "name": name,
                "receive_cash_notification": receive_cash_notification,
                "receive_drift_notification": receive_drift_notification,
                "user_trial_activated": user_trial_activated,
                "activated_trial_date": activated_trial_date,
                "demo": demo,
                "api_enabled": api_enabled,
                "drift_threshold": drift_threshold,
                "preferred_currency": preferred_currency,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["email"]) -> MetaOapg.properties.email: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receive_cash_notification"]) -> MetaOapg.properties.receive_cash_notification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receive_drift_notification"]) -> MetaOapg.properties.receive_drift_notification: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["user_trial_activated"]) -> MetaOapg.properties.user_trial_activated: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["activated_trial_date"]) -> MetaOapg.properties.activated_trial_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["demo"]) -> MetaOapg.properties.demo: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["api_enabled"]) -> MetaOapg.properties.api_enabled: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["drift_threshold"]) -> MetaOapg.properties.drift_threshold: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["preferred_currency"]) -> 'Currency': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["email"], typing_extensions.Literal["name"], typing_extensions.Literal["receive_cash_notification"], typing_extensions.Literal["receive_drift_notification"], typing_extensions.Literal["user_trial_activated"], typing_extensions.Literal["activated_trial_date"], typing_extensions.Literal["demo"], typing_extensions.Literal["api_enabled"], typing_extensions.Literal["drift_threshold"], typing_extensions.Literal["preferred_currency"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["email"]) -> typing.Union[MetaOapg.properties.email, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> typing.Union[MetaOapg.properties.name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receive_cash_notification"]) -> typing.Union[MetaOapg.properties.receive_cash_notification, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receive_drift_notification"]) -> typing.Union[MetaOapg.properties.receive_drift_notification, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["user_trial_activated"]) -> typing.Union[MetaOapg.properties.user_trial_activated, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["activated_trial_date"]) -> typing.Union[MetaOapg.properties.activated_trial_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["demo"]) -> typing.Union[MetaOapg.properties.demo, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["api_enabled"]) -> typing.Union[MetaOapg.properties.api_enabled, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["drift_threshold"]) -> typing.Union[MetaOapg.properties.drift_threshold, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["preferred_currency"]) -> typing.Union['Currency', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["email"], typing_extensions.Literal["name"], typing_extensions.Literal["receive_cash_notification"], typing_extensions.Literal["receive_drift_notification"], typing_extensions.Literal["user_trial_activated"], typing_extensions.Literal["activated_trial_date"], typing_extensions.Literal["demo"], typing_extensions.Literal["api_enabled"], typing_extensions.Literal["drift_threshold"], typing_extensions.Literal["preferred_currency"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        email: typing.Union[MetaOapg.properties.email, str, schemas.Unset] = schemas.unset,
        name: typing.Union[MetaOapg.properties.name, str, schemas.Unset] = schemas.unset,
        receive_cash_notification: typing.Union[MetaOapg.properties.receive_cash_notification, bool, schemas.Unset] = schemas.unset,
        receive_drift_notification: typing.Union[MetaOapg.properties.receive_drift_notification, bool, schemas.Unset] = schemas.unset,
        user_trial_activated: typing.Union[MetaOapg.properties.user_trial_activated, bool, schemas.Unset] = schemas.unset,
        activated_trial_date: typing.Union[MetaOapg.properties.activated_trial_date, str, schemas.Unset] = schemas.unset,
        demo: typing.Union[MetaOapg.properties.demo, bool, schemas.Unset] = schemas.unset,
        api_enabled: typing.Union[MetaOapg.properties.api_enabled, bool, schemas.Unset] = schemas.unset,
        drift_threshold: typing.Union[MetaOapg.properties.drift_threshold, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        preferred_currency: typing.Union['Currency', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'UserSettings':
        return super().__new__(
            cls,
            *args,
            email=email,
            name=name,
            receive_cash_notification=receive_cash_notification,
            receive_drift_notification=receive_drift_notification,
            user_trial_activated=user_trial_activated,
            activated_trial_date=activated_trial_date,
            demo=demo,
            api_enabled=api_enabled,
            drift_threshold=drift_threshold,
            preferred_currency=preferred_currency,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.currency import Currency
