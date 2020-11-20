/*
 * Kadaster - BRK-Bevragen API
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
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
import org.openapitools.client.model.PubliekrechtelijkeBeperkingHalCollectie;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PubliekrechtelijkeBeperkingenApi {
    private ApiClient localVarApiClient;

    public PubliekrechtelijkeBeperkingenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PubliekrechtelijkeBeperkingenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPubliekrechtelijkeBeperkingen
     * @param kadastraalOnroerendeZaakIdentificatie De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPubliekrechtelijkeBeperkingenCall(String kadastraalOnroerendeZaakIdentificatie, String fields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/publiekrechtelijkebeperkingen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fields != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields", fields));
        }

        if (kadastraalOnroerendeZaakIdentificatie != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("kadastraalOnroerendeZaakIdentificatie", kadastraalOnroerendeZaakIdentificatie));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
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
    private okhttp3.Call getPubliekrechtelijkeBeperkingenValidateBeforeCall(String kadastraalOnroerendeZaakIdentificatie, String fields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'kadastraalOnroerendeZaakIdentificatie' is set
        if (kadastraalOnroerendeZaakIdentificatie == null) {
            throw new ApiException("Missing the required parameter 'kadastraalOnroerendeZaakIdentificatie' when calling getPubliekrechtelijkeBeperkingen(Async)");
        }
        

        okhttp3.Call localVarCall = getPubliekrechtelijkeBeperkingenCall(kadastraalOnroerendeZaakIdentificatie, fields, _callback);
        return localVarCall;

    }

    /**
     * 
     * Zoeken van de publiekrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalOnroerendeZaakIdentificatie De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return PubliekrechtelijkeBeperkingHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public PubliekrechtelijkeBeperkingHalCollectie getPubliekrechtelijkeBeperkingen(String kadastraalOnroerendeZaakIdentificatie, String fields) throws ApiException {
        ApiResponse<PubliekrechtelijkeBeperkingHalCollectie> localVarResp = getPubliekrechtelijkeBeperkingenWithHttpInfo(kadastraalOnroerendeZaakIdentificatie, fields);
        return localVarResp.getData();
    }

    /**
     * 
     * Zoeken van de publiekrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalOnroerendeZaakIdentificatie De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @return ApiResponse&lt;PubliekrechtelijkeBeperkingHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<PubliekrechtelijkeBeperkingHalCollectie> getPubliekrechtelijkeBeperkingenWithHttpInfo(String kadastraalOnroerendeZaakIdentificatie, String fields) throws ApiException {
        okhttp3.Call localVarCall = getPubliekrechtelijkeBeperkingenValidateBeforeCall(kadastraalOnroerendeZaakIdentificatie, fields, null);
        Type localVarReturnType = new TypeToken<PubliekrechtelijkeBeperkingHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Zoeken van de publiekrechtelijke beperkingen op een kadastraal onroerende zaak. 
     * @param kadastraalOnroerendeZaakIdentificatie De unieke identificatie van een kadastraal onroerende zaak. Gezocht wordt naar publiekrechtelijke beperkingen die rusten op de onroerende zaak  (required)
     * @param fields Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma&#39;s gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.2.0/features/fields.feature) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Zoekactie geslaagd  </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getPubliekrechtelijkeBeperkingenAsync(String kadastraalOnroerendeZaakIdentificatie, String fields, final ApiCallback<PubliekrechtelijkeBeperkingHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPubliekrechtelijkeBeperkingenValidateBeforeCall(kadastraalOnroerendeZaakIdentificatie, fields, _callback);
        Type localVarReturnType = new TypeToken<PubliekrechtelijkeBeperkingHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
