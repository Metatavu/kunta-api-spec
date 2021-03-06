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
import fi.metatavu.kuntaapi.client.model.Event;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.Attachment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    
    /**
     * Returns organizations event by id
     *
     * Returns organizations event by id 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationEventTest() throws ApiException {
        String organizationId = null;
        String eventId = null;
        // Event response = api.findOrganizationEvent(organizationId, eventId);

        // TODO: test validations
    }
    
    /**
     * Returns an event image
     *
     * Returns an event image  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationEventImageTest() throws ApiException {
        String organizationId = null;
        String eventId = null;
        String imageId = null;
        // Attachment response = api.findOrganizationEventImage(organizationId, eventId, imageId);

        // TODO: test validations
    }
    
    /**
     * Returns an event image data
     *
     * Returns an event image data 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationEventImageDataTest() throws ApiException {
        String organizationId = null;
        String eventId = null;
        String imageId = null;
        Integer size = null;
        // byte[] response = api.getOrganizationEventImageData(organizationId, eventId, imageId, size);

        // TODO: test validations
    }
    
    /**
     * Returns list of event images
     *
     * Returns list of event images 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationEventImagesTest() throws ApiException {
        String organizationId = null;
        String eventId = null;
        // List<Attachment> response = api.listOrganizationEventImages(organizationId, eventId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations events
     *
     * Lists organizations events 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationEventsTest() throws ApiException {
        String organizationId = null;
        String startBefore = null;
        String startAfter = null;
        String endBefore = null;
        String endAfter = null;
        Integer firstResult = null;
        Integer maxResults = null;
        String orderBy = null;
        String orderDir = null;
        // List<Event> response = api.listOrganizationEvents(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir);

        // TODO: test validations
    }
    
}
