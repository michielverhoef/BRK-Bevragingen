/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.TypeGerechtigdeEnum;
import org.openapitools.client.model.ZakelijkGerechtigdeHal;
import org.openapitools.client.model.ZakelijkGerechtigdeHalCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZakelijkeGerechtigdenApi {
    private ApiClient localVarApiClient;

    public ZakelijkeGerechtigdenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZakelijkeGerechtigdenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getZakelijkGerechtigde
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param zakelijkgerechtigdeidentificatie De identificatie van de zakelijk gerechtigde  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getZakelijkGerechtigdeCall(String kadastraalonroerendezaakidentificatie, String zakelijkgerechtigdeidentificatie, String fields, String acceptCrs, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden/{zakelijkgerechtigdeidentificatie}"
            .replaceAll("\\{" + "kadastraalonroerendezaakidentificatie" + "\\}", localVarApiClient.escapeString(kadastraalonroerendezaakidentificatie.toString()))
            .replaceAll("\\{" + "zakelijkgerechtigdeidentificatie" + "\\}", localVarApiClient.escapeString(zakelijkgerechtigdeidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZakelijkGerechtigdeValidateBeforeCall(String kadastraalonroerendezaakidentificatie, String zakelijkgerechtigdeidentificatie, String fields, String acceptCrs, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if (kadastraalonroerendezaakidentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadastraalonroerendezaakidentificatie' when calling getZakelijkGerechtigde(Async)");
        }
        
        // verify the required parameter 'zakelijkgerechtigdeidentificatie' is set
        if (zakelijkgerechtigdeidentificatie == null) {
            throw new ApiException("Missing the required parameter 'zakelijkgerechtigdeidentificatie' when calling getZakelijkGerechtigde(Async)");
        }
        

        okhttp3.Call localVarCall = getZakelijkGerechtigdeCall(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, fields, acceptCrs, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het raadplegen van een specifieke zakelijk gerechtigde van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param zakelijkgerechtigdeidentificatie De identificatie van de zakelijk gerechtigde  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @return ZakelijkGerechtigdeHal
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ZakelijkGerechtigdeHal getZakelijkGerechtigde(String kadastraalonroerendezaakidentificatie, String zakelijkgerechtigdeidentificatie, String fields, String acceptCrs) throws ApiException {
        ApiResponse<ZakelijkGerechtigdeHal> localVarResp = getZakelijkGerechtigdeWithHttpInfo(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, fields, acceptCrs);
        return localVarResp.getData();
    }

    /**
     * 
     * Het raadplegen van een specifieke zakelijk gerechtigde van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param zakelijkgerechtigdeidentificatie De identificatie van de zakelijk gerechtigde  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @return ApiResponse&lt;ZakelijkGerechtigdeHal&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ZakelijkGerechtigdeHal> getZakelijkGerechtigdeWithHttpInfo(String kadastraalonroerendezaakidentificatie, String zakelijkgerechtigdeidentificatie, String fields, String acceptCrs) throws ApiException {
        okhttp3.Call localVarCall = getZakelijkGerechtigdeValidateBeforeCall(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, fields, acceptCrs, null);
        Type localVarReturnType = new TypeToken<ZakelijkGerechtigdeHal>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het raadplegen van een specifieke zakelijk gerechtigde van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param zakelijkgerechtigdeidentificatie De identificatie van de zakelijk gerechtigde  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getZakelijkGerechtigdeAsync(String kadastraalonroerendezaakidentificatie, String zakelijkgerechtigdeidentificatie, String fields, String acceptCrs, final ApiCallback<ZakelijkGerechtigdeHal> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZakelijkGerechtigdeValidateBeforeCall(kadastraalonroerendezaakidentificatie, zakelijkgerechtigdeidentificatie, fields, acceptCrs, _callback);
        Type localVarReturnType = new TypeToken<ZakelijkGerechtigdeHal>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getZakelijkGerechtigden
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param type Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.  (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getZakelijkGerechtigdenCall(String kadastraalonroerendezaakidentificatie, String fields, TypeGerechtigdeEnum type, String acceptCrs, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden"
            .replaceAll("\\{" + "kadastraalonroerendezaakidentificatie" + "\\}", localVarApiClient.escapeString(kadastraalonroerendezaakidentificatie.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (acceptCrs != null) {
            localVarHeaderParams.put("Accept-Crs", localVarApiClient.parameterToString(acceptCrs));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getZakelijkGerechtigdenValidateBeforeCall(String kadastraalonroerendezaakidentificatie, String fields, TypeGerechtigdeEnum type, String acceptCrs, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadastraalonroerendezaakidentificatie' is set
        if (kadastraalonroerendezaakidentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadastraalonroerendezaakidentificatie' when calling getZakelijkGerechtigden(Async)");
        }
        

        okhttp3.Call localVarCall = getZakelijkGerechtigdenCall(kadastraalonroerendezaakidentificatie, fields, type, acceptCrs, _callback);
        return localVarCall;

    }

    /**
     * 
     * Het zoeken van zakelijk gerechtigden van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param type Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.  (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @return ZakelijkGerechtigdeHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ZakelijkGerechtigdeHalCollectie getZakelijkGerechtigden(String kadastraalonroerendezaakidentificatie, String fields, TypeGerechtigdeEnum type, String acceptCrs) throws ApiException {
        ApiResponse<ZakelijkGerechtigdeHalCollectie> localVarResp = getZakelijkGerechtigdenWithHttpInfo(kadastraalonroerendezaakidentificatie, fields, type, acceptCrs);
        return localVarResp.getData();
    }

    /**
     * 
     * Het zoeken van zakelijk gerechtigden van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param type Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.  (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @return ApiResponse&lt;ZakelijkGerechtigdeHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ZakelijkGerechtigdeHalCollectie> getZakelijkGerechtigdenWithHttpInfo(String kadastraalonroerendezaakidentificatie, String fields, TypeGerechtigdeEnum type, String acceptCrs) throws ApiException {
        okhttp3.Call localVarCall = getZakelijkGerechtigdenValidateBeforeCall(kadastraalonroerendezaakidentificatie, fields, type, acceptCrs, null);
        Type localVarReturnType = new TypeToken<ZakelijkGerechtigdeHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Het zoeken van zakelijk gerechtigden van een kadastraal onroerende zaak. Het aandeel van de zakelijk gerechtigde wordt altijd geleverd in combinatie met het gezamenlijk aandeel (wanneer twee of meer personen een gezamenlijk aandeel hebben in een zakelijk recht, en ieders afzonderlijke aandeel in het gezamenlijk aandeel niet bekend is) 
     * @param kadastraalonroerendezaakidentificatie De unieke identificatie van een kadastraal onroerende zaak.  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param type Het type recht dat de zakelijk gerechtigde heeft op de kadastraal onroerende zaak. De waarden van de typering staan in een waardelijst.  (optional)
     * @param acceptCrs Gewenste CRS van de coördinaten in de response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * Content-Crs -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 410 </td><td> Gone </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getZakelijkGerechtigdenAsync(String kadastraalonroerendezaakidentificatie, String fields, TypeGerechtigdeEnum type, String acceptCrs, final ApiCallback<ZakelijkGerechtigdeHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getZakelijkGerechtigdenValidateBeforeCall(kadastraalonroerendezaakidentificatie, fields, type, acceptCrs, _callback);
        Type localVarReturnType = new TypeToken<ZakelijkGerechtigdeHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
