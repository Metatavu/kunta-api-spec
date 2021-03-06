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
import fi.metatavu.kuntaapi.client.model.PrintableFormServiceChannel;
import fi.metatavu.kuntaapi.client.model.NotFound;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrintableFormServiceChannelsApi
 */
public class PrintableFormServiceChannelsApiTest {

    private final PrintableFormServiceChannelsApi api = new PrintableFormServiceChannelsApi();

    
    /**
     * Finds a printable form service channel
     *
     * Finds a printable form service channel
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPrintableFormServiceChannelTest() throws ApiException {
        String printableFormServiceChannelId = null;
        // PrintableFormServiceChannel response = api.findPrintableFormServiceChannel(printableFormServiceChannelId);

        // TODO: test validations
    }
    
    /**
     * Lists printable form service channels
     *
     * Lists printable form service channels
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPrintableFormServiceChannelsTest() throws ApiException {
        String organizationId = null;
        String search = null;
        String sortBy = null;
        String sortDir = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<PrintableFormServiceChannel> response = api.listPrintableFormServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);

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
    public void updatePrintableFormServiceChannelTest() throws ApiException {
        String printableFormServiceChannelId = null;
        PrintableFormServiceChannel payload = null;
        // PrintableFormServiceChannel response = api.updatePrintableFormServiceChannel(printableFormServiceChannelId, payload);

        // TODO: test validations
    }
    
}
