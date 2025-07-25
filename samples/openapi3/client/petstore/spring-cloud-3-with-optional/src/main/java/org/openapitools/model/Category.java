package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A category for a pet
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class Category {

  private Optional<Long> id = Optional.empty();

  private Optional<@Pattern(regexp = "^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$") String> name = Optional.empty();

  public Category id(Long id) {
    this.id = Optional.ofNullable(id);
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("id")
  public Optional<Long> getId() {
    return id;
  }

  public void setId(Optional<Long> id) {
    this.id = id;
  }

  public Category name(String name) {
    this.name = Optional.ofNullable(name);
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @JsonProperty("name")
  public Optional<@Pattern(regexp = "^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$") String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Category category = (Category) o;
    return Objects.equals(this.id, category.id) &&
        Objects.equals(this.name, category.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Category {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

