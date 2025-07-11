package org.openapitools.virtualan.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Model for testing model name same as property name
 */

@Schema(name = "Name", description = "Model for testing model name same as property name")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class Name {

  private Integer name;

  private @Nullable Integer snakeCase;

  private @Nullable String property;

  private @Nullable Integer _123number;

  public Name() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Name(Integer name) {
    this.name = name;
  }

  public Name name(Integer name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public Integer getName() {
    return name;
  }

  public void setName(Integer name) {
    this.name = name;
  }

  public Name snakeCase(@Nullable Integer snakeCase) {
    this.snakeCase = snakeCase;
    return this;
  }

  /**
   * Get snakeCase
   * @return snakeCase
   */
  
  @Schema(name = "snake_case", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("snake_case")
  public @Nullable Integer getSnakeCase() {
    return snakeCase;
  }

  public void setSnakeCase(@Nullable Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  public Name property(@Nullable String property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
   */
  
  @Schema(name = "property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public @Nullable String getProperty() {
    return property;
  }

  public void setProperty(@Nullable String property) {
    this.property = property;
  }

  public Name _123number(@Nullable Integer _123number) {
    this._123number = _123number;
    return this;
  }

  /**
   * Get _123number
   * @return _123number
   */
  
  @Schema(name = "123Number", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("123Number")
  public @Nullable Integer get123number() {
    return _123number;
  }

  public void set123number(@Nullable Integer _123number) {
    this._123number = _123number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.name, name.name) &&
        Objects.equals(this.snakeCase, name.snakeCase) &&
        Objects.equals(this.property, name.property) &&
        Objects.equals(this._123number, name._123number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, snakeCase, property, _123number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snakeCase: ").append(toIndentedString(snakeCase)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    _123number: ").append(toIndentedString(_123number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

