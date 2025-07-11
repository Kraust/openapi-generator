package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public interface PetApiService {
      public Response addPet(Pet pet, SecurityContext securityContext);
      public Response deletePet(Long petId, SecurityContext securityContext);
      public Response findPetsByStatus(List<String> status, SecurityContext securityContext);
      @Deprecated public Response findPetsByTags(List<String> tags, SecurityContext securityContext);
      public Response getPetById(Long petId, SecurityContext securityContext);
      public Response updatePet(Pet pet, SecurityContext securityContext);
      public Response updatePetWithForm(Long petId, String name, String status, SecurityContext securityContext);
      public Response uploadFile(Long petId, String additionalMetadata, Attachment _fileDetail, SecurityContext securityContext);
}
