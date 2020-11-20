# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.3.0
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


class PubliekrechtelijkeBeperkingenApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

    def get_publiekrechtelijke_beperkingen(self, kadastraal_onroerende_zaak_identificatie, **kwargs):  # noqa: E501
        """get_publiekrechtelijke_beperkingen  # noqa: E501

        Zoeken van de publiekrechtelijke beperkingen op een kadastraal onroerende zaak.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_publiekrechtelijke_beperkingen(kadastraal_onroerende_zaak_identificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraal_onroerende_zaak_identificatie: De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature)
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: PubliekrechtelijkeBeperkingHalCollectie
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        return self.get_publiekrechtelijke_beperkingen_with_http_info(kadastraal_onroerende_zaak_identificatie, **kwargs)  # noqa: E501

    def get_publiekrechtelijke_beperkingen_with_http_info(self, kadastraal_onroerende_zaak_identificatie, **kwargs):  # noqa: E501
        """get_publiekrechtelijke_beperkingen  # noqa: E501

        Zoeken van de publiekrechtelijke beperkingen op een kadastraal onroerende zaak.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True
        >>> thread = api.get_publiekrechtelijke_beperkingen_with_http_info(kadastraal_onroerende_zaak_identificatie, async_req=True)
        >>> result = thread.get()

        :param async_req bool: execute request asynchronously
        :param str kadastraal_onroerende_zaak_identificatie: De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
        :param str fields: Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature)
        :param _return_http_data_only: response data without head status code
                                       and headers
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: tuple(PubliekrechtelijkeBeperkingHalCollectie, status_code(int), headers(HTTPHeaderDict))
                 If the method is called asynchronously,
                 returns the request thread.
        """

        local_var_params = locals()

        all_params = [
            'kadastraal_onroerende_zaak_identificatie',
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
                    " to method get_publiekrechtelijke_beperkingen" % key
                )
            local_var_params[key] = val
        del local_var_params['kwargs']
        # verify the required parameter 'kadastraal_onroerende_zaak_identificatie' is set
        if self.api_client.client_side_validation and ('kadastraal_onroerende_zaak_identificatie' not in local_var_params or  # noqa: E501
                                                        local_var_params['kadastraal_onroerende_zaak_identificatie'] is None):  # noqa: E501
            raise ApiValueError("Missing the required parameter `kadastraal_onroerende_zaak_identificatie` when calling `get_publiekrechtelijke_beperkingen`")  # noqa: E501

        collection_formats = {}

        path_params = {}

        query_params = []
        if 'fields' in local_var_params and local_var_params['fields'] is not None:  # noqa: E501
            query_params.append(('fields', local_var_params['fields']))  # noqa: E501
        if 'kadastraal_onroerende_zaak_identificatie' in local_var_params and local_var_params['kadastraal_onroerende_zaak_identificatie'] is not None:  # noqa: E501
            query_params.append(('kadastraalOnroerendeZaakIdentificatie', local_var_params['kadastraal_onroerende_zaak_identificatie']))  # noqa: E501

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
            '/publiekrechtelijkebeperkingen', 'GET',
            path_params,
            query_params,
            header_params,
            body=body_params,
            post_params=form_params,
            files=local_var_files,
            response_type='PubliekrechtelijkeBeperkingHalCollectie',  # noqa: E501
            auth_settings=auth_settings,
            async_req=local_var_params.get('async_req'),
            _return_http_data_only=local_var_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=local_var_params.get('_preload_content', True),
            _request_timeout=local_var_params.get('_request_timeout'),
            collection_formats=collection_formats)
