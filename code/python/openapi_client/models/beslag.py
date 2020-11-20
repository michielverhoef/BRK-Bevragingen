# coding: utf-8

"""
    Kadaster - BRK-Bevragen API

    D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.   # noqa: E501

    The version of the OpenAPI document: 1.3.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Beslag(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'identificatie': 'str',
        'domein': 'str',
        'aandeel_in_betrokken_recht': 'TypeBreuk',
        'gedeeltelijke_bezwaring_oud_object': 'bool',
        'omschrijving_betrokken_recht': 'Waardelijst',
        'toelichting_bewaarder': 'str',
        'aard': 'Waardelijst',
        'aantekeningen': 'list[AantekeningBasis]',
        'beslagleggers': 'list[PersoonBeperkt]',
        'bedrag_vordering': 'Bedrag',
        'stuk_identificaties': 'list[str]',
        'is_gebaseerd_op_stukdeel_identificatie': 'str',
        'is_vermeld_in_stukdeel_identificaties': 'list[str]'
    }

    attribute_map = {
        'identificatie': 'identificatie',
        'domein': 'domein',
        'aandeel_in_betrokken_recht': 'aandeelInBetrokkenRecht',
        'gedeeltelijke_bezwaring_oud_object': 'gedeeltelijkeBezwaringOudObject',
        'omschrijving_betrokken_recht': 'omschrijvingBetrokkenRecht',
        'toelichting_bewaarder': 'toelichtingBewaarder',
        'aard': 'aard',
        'aantekeningen': 'aantekeningen',
        'beslagleggers': 'beslagleggers',
        'bedrag_vordering': 'bedragVordering',
        'stuk_identificaties': 'stukIdentificaties',
        'is_gebaseerd_op_stukdeel_identificatie': 'isGebaseerdOpStukdeelIdentificatie',
        'is_vermeld_in_stukdeel_identificaties': 'isVermeldInStukdeelIdentificaties'
    }

    def __init__(self, identificatie=None, domein=None, aandeel_in_betrokken_recht=None, gedeeltelijke_bezwaring_oud_object=None, omschrijving_betrokken_recht=None, toelichting_bewaarder=None, aard=None, aantekeningen=None, beslagleggers=None, bedrag_vordering=None, stuk_identificaties=None, is_gebaseerd_op_stukdeel_identificatie=None, is_vermeld_in_stukdeel_identificaties=None, local_vars_configuration=None):  # noqa: E501
        """Beslag - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._identificatie = None
        self._domein = None
        self._aandeel_in_betrokken_recht = None
        self._gedeeltelijke_bezwaring_oud_object = None
        self._omschrijving_betrokken_recht = None
        self._toelichting_bewaarder = None
        self._aard = None
        self._aantekeningen = None
        self._beslagleggers = None
        self._bedrag_vordering = None
        self._stuk_identificaties = None
        self._is_gebaseerd_op_stukdeel_identificatie = None
        self._is_vermeld_in_stukdeel_identificaties = None
        self.discriminator = None

        if identificatie is not None:
            self.identificatie = identificatie
        if domein is not None:
            self.domein = domein
        if aandeel_in_betrokken_recht is not None:
            self.aandeel_in_betrokken_recht = aandeel_in_betrokken_recht
        if gedeeltelijke_bezwaring_oud_object is not None:
            self.gedeeltelijke_bezwaring_oud_object = gedeeltelijke_bezwaring_oud_object
        if omschrijving_betrokken_recht is not None:
            self.omschrijving_betrokken_recht = omschrijving_betrokken_recht
        if toelichting_bewaarder is not None:
            self.toelichting_bewaarder = toelichting_bewaarder
        if aard is not None:
            self.aard = aard
        if aantekeningen is not None:
            self.aantekeningen = aantekeningen
        if beslagleggers is not None:
            self.beslagleggers = beslagleggers
        if bedrag_vordering is not None:
            self.bedrag_vordering = bedrag_vordering
        if stuk_identificaties is not None:
            self.stuk_identificaties = stuk_identificaties
        if is_gebaseerd_op_stukdeel_identificatie is not None:
            self.is_gebaseerd_op_stukdeel_identificatie = is_gebaseerd_op_stukdeel_identificatie
        if is_vermeld_in_stukdeel_identificaties is not None:
            self.is_vermeld_in_stukdeel_identificaties = is_vermeld_in_stukdeel_identificaties

    @property
    def identificatie(self):
        """Gets the identificatie of this Beslag.  # noqa: E501


        :return: The identificatie of this Beslag.  # noqa: E501
        :rtype: str
        """
        return self._identificatie

    @identificatie.setter
    def identificatie(self, identificatie):
        """Sets the identificatie of this Beslag.


        :param identificatie: The identificatie of this Beslag.  # noqa: E501
        :type: str
        """

        self._identificatie = identificatie

    @property
    def domein(self):
        """Gets the domein of this Beslag.  # noqa: E501

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :return: The domein of this Beslag.  # noqa: E501
        :rtype: str
        """
        return self._domein

    @domein.setter
    def domein(self, domein):
        """Sets the domein of this Beslag.

        Het domein waartoe de identificatie behoort.   # noqa: E501

        :param domein: The domein of this Beslag.  # noqa: E501
        :type: str
        """

        self._domein = domein

    @property
    def aandeel_in_betrokken_recht(self):
        """Gets the aandeel_in_betrokken_recht of this Beslag.  # noqa: E501


        :return: The aandeel_in_betrokken_recht of this Beslag.  # noqa: E501
        :rtype: TypeBreuk
        """
        return self._aandeel_in_betrokken_recht

    @aandeel_in_betrokken_recht.setter
    def aandeel_in_betrokken_recht(self, aandeel_in_betrokken_recht):
        """Sets the aandeel_in_betrokken_recht of this Beslag.


        :param aandeel_in_betrokken_recht: The aandeel_in_betrokken_recht of this Beslag.  # noqa: E501
        :type: TypeBreuk
        """

        self._aandeel_in_betrokken_recht = aandeel_in_betrokken_recht

    @property
    def gedeeltelijke_bezwaring_oud_object(self):
        """Gets the gedeeltelijke_bezwaring_oud_object of this Beslag.  # noqa: E501

        Indicatie of het object waarop beslag is gelegd gedeeltelijk uit een inmiddels vervallen object bestaat.   # noqa: E501

        :return: The gedeeltelijke_bezwaring_oud_object of this Beslag.  # noqa: E501
        :rtype: bool
        """
        return self._gedeeltelijke_bezwaring_oud_object

    @gedeeltelijke_bezwaring_oud_object.setter
    def gedeeltelijke_bezwaring_oud_object(self, gedeeltelijke_bezwaring_oud_object):
        """Sets the gedeeltelijke_bezwaring_oud_object of this Beslag.

        Indicatie of het object waarop beslag is gelegd gedeeltelijk uit een inmiddels vervallen object bestaat.   # noqa: E501

        :param gedeeltelijke_bezwaring_oud_object: The gedeeltelijke_bezwaring_oud_object of this Beslag.  # noqa: E501
        :type: bool
        """

        self._gedeeltelijke_bezwaring_oud_object = gedeeltelijke_bezwaring_oud_object

    @property
    def omschrijving_betrokken_recht(self):
        """Gets the omschrijving_betrokken_recht of this Beslag.  # noqa: E501


        :return: The omschrijving_betrokken_recht of this Beslag.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._omschrijving_betrokken_recht

    @omschrijving_betrokken_recht.setter
    def omschrijving_betrokken_recht(self, omschrijving_betrokken_recht):
        """Sets the omschrijving_betrokken_recht of this Beslag.


        :param omschrijving_betrokken_recht: The omschrijving_betrokken_recht of this Beslag.  # noqa: E501
        :type: Waardelijst
        """

        self._omschrijving_betrokken_recht = omschrijving_betrokken_recht

    @property
    def toelichting_bewaarder(self):
        """Gets the toelichting_bewaarder of this Beslag.  # noqa: E501

        Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.   # noqa: E501

        :return: The toelichting_bewaarder of this Beslag.  # noqa: E501
        :rtype: str
        """
        return self._toelichting_bewaarder

    @toelichting_bewaarder.setter
    def toelichting_bewaarder(self, toelichting_bewaarder):
        """Sets the toelichting_bewaarder of this Beslag.

        Toelichtende tekst van de bewaarder. De bewaarder is iemand die bij het Kadaster werkt. Hij schrijft stukken in in de openbare registers en de basisregistratie Kadaster conform de Kadasterwet.   # noqa: E501

        :param toelichting_bewaarder: The toelichting_bewaarder of this Beslag.  # noqa: E501
        :type: str
        """

        self._toelichting_bewaarder = toelichting_bewaarder

    @property
    def aard(self):
        """Gets the aard of this Beslag.  # noqa: E501


        :return: The aard of this Beslag.  # noqa: E501
        :rtype: Waardelijst
        """
        return self._aard

    @aard.setter
    def aard(self, aard):
        """Sets the aard of this Beslag.


        :param aard: The aard of this Beslag.  # noqa: E501
        :type: Waardelijst
        """

        self._aard = aard

    @property
    def aantekeningen(self):
        """Gets the aantekeningen of this Beslag.  # noqa: E501


        :return: The aantekeningen of this Beslag.  # noqa: E501
        :rtype: list[AantekeningBasis]
        """
        return self._aantekeningen

    @aantekeningen.setter
    def aantekeningen(self, aantekeningen):
        """Sets the aantekeningen of this Beslag.


        :param aantekeningen: The aantekeningen of this Beslag.  # noqa: E501
        :type: list[AantekeningBasis]
        """

        self._aantekeningen = aantekeningen

    @property
    def beslagleggers(self):
        """Gets the beslagleggers of this Beslag.  # noqa: E501


        :return: The beslagleggers of this Beslag.  # noqa: E501
        :rtype: list[PersoonBeperkt]
        """
        return self._beslagleggers

    @beslagleggers.setter
    def beslagleggers(self, beslagleggers):
        """Sets the beslagleggers of this Beslag.


        :param beslagleggers: The beslagleggers of this Beslag.  # noqa: E501
        :type: list[PersoonBeperkt]
        """

        self._beslagleggers = beslagleggers

    @property
    def bedrag_vordering(self):
        """Gets the bedrag_vordering of this Beslag.  # noqa: E501


        :return: The bedrag_vordering of this Beslag.  # noqa: E501
        :rtype: Bedrag
        """
        return self._bedrag_vordering

    @bedrag_vordering.setter
    def bedrag_vordering(self, bedrag_vordering):
        """Sets the bedrag_vordering of this Beslag.


        :param bedrag_vordering: The bedrag_vordering of this Beslag.  # noqa: E501
        :type: Bedrag
        """

        self._bedrag_vordering = bedrag_vordering

    @property
    def stuk_identificaties(self):
        """Gets the stuk_identificaties of this Beslag.  # noqa: E501

                    Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een Kadasterstuk zijn.   # noqa: E501

        :return: The stuk_identificaties of this Beslag.  # noqa: E501
        :rtype: list[str]
        """
        return self._stuk_identificaties

    @stuk_identificaties.setter
    def stuk_identificaties(self, stuk_identificaties):
        """Sets the stuk_identificaties of this Beslag.

                    Identificatie van het stuk. Een stuk is een brondocument dat aanleiding geeft tot een wijziging van de gegevens in een basisregistratie. Dit kan een aangeboden stuk of een Kadasterstuk zijn.   # noqa: E501

        :param stuk_identificaties: The stuk_identificaties of this Beslag.  # noqa: E501
        :type: list[str]
        """

        self._stuk_identificaties = stuk_identificaties

    @property
    def is_gebaseerd_op_stukdeel_identificatie(self):
        """Gets the is_gebaseerd_op_stukdeel_identificatie of this Beslag.  # noqa: E501

        De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop dit beslag is gebaseerd.   # noqa: E501

        :return: The is_gebaseerd_op_stukdeel_identificatie of this Beslag.  # noqa: E501
        :rtype: str
        """
        return self._is_gebaseerd_op_stukdeel_identificatie

    @is_gebaseerd_op_stukdeel_identificatie.setter
    def is_gebaseerd_op_stukdeel_identificatie(self, is_gebaseerd_op_stukdeel_identificatie):
        """Sets the is_gebaseerd_op_stukdeel_identificatie of this Beslag.

        De identificatie van het stukdeel (paragraaf in een akte met een rechtsfeit) waarop dit beslag is gebaseerd.   # noqa: E501

        :param is_gebaseerd_op_stukdeel_identificatie: The is_gebaseerd_op_stukdeel_identificatie of this Beslag.  # noqa: E501
        :type: str
        """

        self._is_gebaseerd_op_stukdeel_identificatie = is_gebaseerd_op_stukdeel_identificatie

    @property
    def is_vermeld_in_stukdeel_identificaties(self):
        """Gets the is_vermeld_in_stukdeel_identificaties of this Beslag.  # noqa: E501

        De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin dit beslag is vermeld   # noqa: E501

        :return: The is_vermeld_in_stukdeel_identificaties of this Beslag.  # noqa: E501
        :rtype: list[str]
        """
        return self._is_vermeld_in_stukdeel_identificaties

    @is_vermeld_in_stukdeel_identificaties.setter
    def is_vermeld_in_stukdeel_identificaties(self, is_vermeld_in_stukdeel_identificaties):
        """Sets the is_vermeld_in_stukdeel_identificaties of this Beslag.

        De identificaties van de stukdelen (paragrafen in een akte met een rechtsfeit) waarin dit beslag is vermeld   # noqa: E501

        :param is_vermeld_in_stukdeel_identificaties: The is_vermeld_in_stukdeel_identificaties of this Beslag.  # noqa: E501
        :type: list[str]
        """

        self._is_vermeld_in_stukdeel_identificaties = is_vermeld_in_stukdeel_identificaties

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Beslag):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Beslag):
            return True

        return self.to_dict() != other.to_dict()
