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
import fi.metatavu.kuntaapi.client.model.Code;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CodesApi
 */
public class CodesApiTest {

    private final CodesApi api = new CodesApi();

    
    /**
     * Finds a code
     *
     * Finds a code
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCodeTest() throws ApiException {
        String codeId = null;
        // Code response = api.findCode(codeId);

        // TODO: test validations
    }
    
    /**
     * Lists codes
     *
     * Lists codes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCodesTest() throws ApiException {
        List<String> types = null;
        String search = null;
        String sortBy = null;
        String sortDir = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<Code> response = api.listCodes(types, search, sortBy, sortDir, firstResult, maxResults);

        // TODO: test validations
    }
    
}