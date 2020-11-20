/* 
 * Kadaster - BRK-Bevragen API
 *
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Hoeveelheid geld in cijfers in een bepaalde valuta.   Waardelijst in deze component :   [Valuta](http://www.kadaster.nl/schemas/waardelijsten/Valuta/)\&quot; 
    /// </summary>
    [DataContract]
    public partial class Bedrag :  IEquatable<Bedrag>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Bedrag" /> class.
        /// </summary>
        /// <param name="som">Het bedrag. Dit is een waarde met max. 2 decimalen. .</param>
        /// <param name="valuta">valuta.</param>
        public Bedrag(float som = default(float), Waardelijst valuta = default(Waardelijst))
        {
            this.Som = som;
            this.Valuta = valuta;
        }
        
        /// <summary>
        /// Het bedrag. Dit is een waarde met max. 2 decimalen. 
        /// </summary>
        /// <value>Het bedrag. Dit is een waarde met max. 2 decimalen. </value>
        [DataMember(Name="som", EmitDefaultValue=false)]
        public float Som { get; set; }

        /// <summary>
        /// Gets or Sets Valuta
        /// </summary>
        [DataMember(Name="valuta", EmitDefaultValue=false)]
        public Waardelijst Valuta { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Bedrag {\n");
            sb.Append("  Som: ").Append(Som).Append("\n");
            sb.Append("  Valuta: ").Append(Valuta).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Bedrag);
        }

        /// <summary>
        /// Returns true if Bedrag instances are equal
        /// </summary>
        /// <param name="input">Instance of Bedrag to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Bedrag input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Som == input.Som ||
                    (this.Som != null &&
                    this.Som.Equals(input.Som))
                ) && 
                (
                    this.Valuta == input.Valuta ||
                    (this.Valuta != null &&
                    this.Valuta.Equals(input.Valuta))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Som != null)
                    hashCode = hashCode * 59 + this.Som.GetHashCode();
                if (this.Valuta != null)
                    hashCode = hashCode * 59 + this.Valuta.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
