# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.  # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class ZakelijkeGerechtigdenApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_zakelijk_gerechtigde(self, kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, **kwargs):  # noqa: E501
        """get_zakelijk_gerechtigde  # noqa: E501

        Het raadplegen van een specifieke zakelijk gerechtigde van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_zakelijk_gerechtigde(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraalonroerendezaakidentificatie: De unieke identificatie van een kadastraal onroerende zaak. (required)
        :param str zakelijkgerechtigdeidentificatie: De identificatie van de zakelijk gerechtigde (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: ZakelijkGerechtigdeHal
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_zakelijk_gerechtigde_with_http_info(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, **kwargs)  # noqa: E501

    def get_zakelijk_gerechtigde_with_http_info(self, kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, **kwargs):  # noqa: E501
        """get_zakelijk_gerechtigde  # noqa: E501

        Het raadplegen van een specifieke zakelijk gerechtigde van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_zakelijk_gerechtigde_with_http_info(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraalonroerendezaakidentificatie: De unieke identificatie van een kadastraal onroerende zaak. (required)
        :param str zakelijkgerechtigdeidentificatie: De identificatie van de zakelijk gerechtigde (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(ZakelijkGerechtigdeHal, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'kadastraalonroerendezaakidentificatie',
            'zakelijkgerechtigdeidentificatie',
            'fields'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_zakelijk_gerechtigde" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if self.api_client.client_side_validation and ('kadastraalonroerendezaakidentificatie' not in local_var_params or  # noqa: E501
                                                        local_var_params['kadastraalonroerendezaakidentificatie'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `kadastraalonroerendezaakidentificatie` when calling `get_zakelijk_gerechtigde`")  # noqa: E501
        # verify the required parameter 'zakelijkgerechtigdeidentificatie' is set
        if self.api_client.client_side_validation and ('zakelijkgerechtigdeidentificatie' not in local_var_params or  # noqa: E501
                                                        local_var_params['zakelijkgerechtigdeidentificatie'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `zakelijkgerechtigdeidentificatie` when calling `get_zakelijk_gerechtigde`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'kadastraalonroerendezaakidentificatie' in local_var_params:
            path_params['kadastraalonroerendezaakidentificatie'] = local_var_params['kadastraalonroerendezaakidentificatie']  # noqa: E501
        if 'zakelijkgerechtigdeidentificatie' in local_var_params:
            path_params['zakelijkgerechtigdeidentificatie'] = local_var_params['zakelijkgerechtigdeidentificatie']  # noqa: E501

        query_params = []
        if 'fields' in local_var_params and local_var_params['fields'] is not None:  # noqa: E501
            query_params.append(('fields', local_var_params['fields']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/hal+json', 'application/problem+json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyAuth']  # noqa: E501

        return self.api_client.call_api(
            '/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden/{zakelijkgerechtigdeidentificatie}', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ZakelijkGerechtigdeHal',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)

    def get_zakelijk_gerechtigden(self, kadastraalonroerendezaakidentificatie, **kwargs):  # noqa: E501
        """get_zakelijk_gerechtigden  # noqa: E501

        Het zoeken van zakelijk gerechtigden van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_zakelijk_gerechtigden(kadastraalonroerendezaakidentificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraalonroerendezaakidentificatie: De unieke identificatie van een kadastraal onroerende zaak. (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature)
        :param TypeGerechtigdeEnum type: Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: ZakelijkGerechtigdeHalCollectie
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_zakelijk_gerechtigden_with_http_info(kadastraalonroerendezaakidentificatie, **kwargs)  # noqa: E501

    def get_zakelijk_gerechtigden_with_http_info(self, kadastraalonroerendezaakidentificatie, **kwargs):  # noqa: E501
        """get_zakelijk_gerechtigden  # noqa: E501

        Het zoeken van zakelijk gerechtigden van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_zakelijk_gerechtigden_with_http_info(kadastraalonroerendezaakidentificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraalonroerendezaakidentificatie: De unieke identificatie van een kadastraal onroerende zaak. (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature)
        :param TypeGerechtigdeEnum type: Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(ZakelijkGerechtigdeHalCollectie, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'kadastraalonroerendezaakidentificatie',
            'fields',
            'type'
        ]
        all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout'
            ]
        )

        for key, val in six.iteritems(local_var_params['kwargs']):
            if key not in all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method get_zakelijk_gerechtigden" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if self.api_client.client_side_validation and ('kadastraalonroerendezaakidentificatie' not in local_var_params or  # noqa: E501
                                                        local_var_params['kadastraalonroerendezaakidentificatie'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `kadastraalonroerendezaakidentificatie` when calling `get_zakelijk_gerechtigden`")  # noqa: E501

        collection_formats = {}

        path_params = {}
        if 'kadastraalonroerendezaakidentificatie' in local_var_params:
            path_params['kadastraalonroerendezaakidentificatie'] = local_var_params['kadastraalonroerendezaakidentificatie']  # noqa: E501

        query_params = []
        if 'fields' in local_var_params and local_var_params['fields'] is not None:  # noqa: E501
            query_params.append(('fields', local_var_params['fields']))  # noqa: E501
        if 'type' in local_var_params and local_var_params['type'] is not None:  # noqa: E501
            query_params.append(('type', local_var_params['type']))  # noqa: E501

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.select_header_accept(
            ['application/hal+json', 'application/problem+json'])  # noqa: E501

        # Authentication setting
        auth_settings = ['apiKeyAuth']  # noqa: E501

        return self.api_client.call_api(
            '/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='ZakelijkGerechtigdeHalCollectie',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)