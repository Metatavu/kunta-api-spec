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
import fi.metatavu.kuntaapi.client.model.ElectronicServiceChannel;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.NotFound;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ElectronicServiceChannelsApi
 */
public class ElectronicServiceChannelsApiTest {

    private final ElectronicServiceChannelsApi api = new ElectronicServiceChannelsApi();

    
    /**
     * Finds an electronic service channel by id
     *
     * Finds an electronic service channel by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findElectronicServiceChannelTest() throws ApiException {
        String electronicServiceChannelId = null;
        // ElectronicServiceChannel response = api.findElectronicServiceChannel(electronicServiceChannelId);

        // TODO: test validations
    }
    
    /**
     * Lists electronic service channels
     *
     * Lists electronic service channels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listElectronicServiceChannelsTest() throws ApiException {
        String organizationId = null;
        String search = null;
        String sortBy = null;
        String sortDir = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<ElectronicServiceChannel> response = api.listElectronicServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * Updates a channel
     *
     * Updates a service channel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateElectronicServiceChannelTest() throws ApiException {
        String electronicServiceChannelId = null;
        ElectronicServiceChannel payload = null;
        // ElectronicServiceChannel response = api.updateElectronicServiceChannel(electronicServiceChannelId, payload);

        // TODO: test validations
    }
    
}
