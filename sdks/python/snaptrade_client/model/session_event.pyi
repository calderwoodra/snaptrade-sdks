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


class SessionEvent(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
            
            
            class session_event_type(
                schemas.EnumBase,
                schemas.StrSchema
            ):
                
                @schemas.classproperty
                def CONNECTION_FAILED(cls):
                    return cls("CONNECTION_FAILED")
                
                @schemas.classproperty
                def DISCLAIMER_ACCEPTED(cls):
                    return cls("DISCLAIMER_ACCEPTED")
                
                @schemas.classproperty
                def BROKERAGE_CONNECTION_INITIATED(cls):
                    return cls("BROKERAGE_CONNECTION_INITIATED")
                
                @schemas.classproperty
                def BROKERAGE_AUTHENTICATION(cls):
                    return cls("BROKERAGE_AUTHENTICATION")
                
                @schemas.classproperty
                def MFA_AUTHORIZATION(cls):
                    return cls("MFA_AUTHORIZATION")
                
                @schemas.classproperty
                def CONNECTION_SUCCESSFUL(cls):
                    return cls("CONNECTION_SUCCESSFUL")
                
                @schemas.classproperty
                def PARTNER_REDIRECT(cls):
                    return cls("PARTNER_REDIRECT")
            session_id = schemas.UUIDSchema
            user_id = schemas.StrSchema
            created_date = schemas.StrSchema
            
            
            class brokerage_status_code(
                schemas.IntBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'brokerage_status_code':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            brokerage_authorization_id = schemas.UUIDSchema
            __annotations__ = {
                "id": id,
                "session_event_type": session_event_type,
                "session_id": session_id,
                "user_id": user_id,
                "created_date": created_date,
                "brokerage_status_code": brokerage_status_code,
                "brokerage_authorization_id": brokerage_authorization_id,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["session_event_type"]) -> MetaOapg.properties.session_event_type: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["session_id"]) -> MetaOapg.properties.session_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["user_id"]) -> MetaOapg.properties.user_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["created_date"]) -> MetaOapg.properties.created_date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["brokerage_status_code"]) -> MetaOapg.properties.brokerage_status_code: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["brokerage_authorization_id"]) -> MetaOapg.properties.brokerage_authorization_id: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["session_event_type"], typing_extensions.Literal["session_id"], typing_extensions.Literal["user_id"], typing_extensions.Literal["created_date"], typing_extensions.Literal["brokerage_status_code"], typing_extensions.Literal["brokerage_authorization_id"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["session_event_type"]) -> typing.Union[MetaOapg.properties.session_event_type, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["session_id"]) -> typing.Union[MetaOapg.properties.session_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["user_id"]) -> typing.Union[MetaOapg.properties.user_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["created_date"]) -> typing.Union[MetaOapg.properties.created_date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["brokerage_status_code"]) -> typing.Union[MetaOapg.properties.brokerage_status_code, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["brokerage_authorization_id"]) -> typing.Union[MetaOapg.properties.brokerage_authorization_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["session_event_type"], typing_extensions.Literal["session_id"], typing_extensions.Literal["user_id"], typing_extensions.Literal["created_date"], typing_extensions.Literal["brokerage_status_code"], typing_extensions.Literal["brokerage_authorization_id"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        session_event_type: typing.Union[MetaOapg.properties.session_event_type, str, schemas.Unset] = schemas.unset,
        session_id: typing.Union[MetaOapg.properties.session_id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        user_id: typing.Union[MetaOapg.properties.user_id, str, schemas.Unset] = schemas.unset,
        created_date: typing.Union[MetaOapg.properties.created_date, str, schemas.Unset] = schemas.unset,
        brokerage_status_code: typing.Union[MetaOapg.properties.brokerage_status_code, None, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        brokerage_authorization_id: typing.Union[MetaOapg.properties.brokerage_authorization_id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'SessionEvent':
        return super().__new__(
            cls,
            *args,
            id=id,
            session_event_type=session_event_type,
            session_id=session_id,
            user_id=user_id,
            created_date=created_date,
            brokerage_status_code=brokerage_status_code,
            brokerage_authorization_id=brokerage_authorization_id,
            _configuration=_configuration,
            **kwargs,
        )
