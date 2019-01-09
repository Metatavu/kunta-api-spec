/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.kuntaapi.client;

import fi.metatavu.kuntaapi.ApiException;
import fi.metatavu.kuntaapi.client.model.BadRequest;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.FileDef;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    
    /**
     * Deletes an organization file
     *
     * Deletes single organization file 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationFileTest() throws ApiException {
        String organizationId = null;
        String fileId = null;
        // api.deleteOrganizationFile(organizationId, fileId);

        // TODO: test validations
    }
    
    /**
     * Finds organizations file
     *
     * Finds single organization file 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationFileTest() throws ApiException {
        String organizationId = null;
        String fileId = null;
        // FileDef response = api.findOrganizationFile(organizationId, fileId);

        // TODO: test validations
    }
    
    /**
     * Returns an organization file data
     *
     * Returns an organization file data 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationFileDataTest() throws ApiException {
        String organizationId = null;
        String fileId = null;
        // byte[] response = api.getOrganizationFileData(organizationId, fileId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations files
     *
     * Lists organizations files 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationFilesTest() throws ApiException {
        String organizationId = null;
        String pageId = null;
        String search = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<FileDef> response = api.listOrganizationFiles(organizationId, pageId, search, firstResult, maxResults);

        // TODO: test validations
    }
    
}