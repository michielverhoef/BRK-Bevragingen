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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.DatumOnvolledig;

/**
 * Overlijden is een groep gegevens over het overlijden van een persoon. 
 */
@ApiModel(description = "Overlijden is een groep gegevens over het overlijden van een persoon. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-27T09:37:24.750Z[Etc/UTC]")
public class Overlijden {
  public static final String SERIALIZED_NAME_DATUM = "datum";
  @SerializedName(SERIALIZED_NAME_DATUM)
  private DatumOnvolledig datum;


  public Overlijden datum(DatumOnvolledig datum) {
    
    this.datum = datum;
    return this;
  }

   /**
   * Get datum
   * @return datum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatum() {
    return datum;
  }


  public void setDatum(DatumOnvolledig datum) {
    this.datum = datum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Overlijden overlijden = (Overlijden) o;
    return Objects.equals(this.datum, overlijden.datum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overlijden {\n");
    sb.append("    datum: ").append(toIndentedString(datum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

