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
import fi.metatavu.kuntaapi.client.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Finds an organizations contact
     *
     * Finds organization&#39;s single contact 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationContactTest() throws ApiException {
        String organizationId = null;
        String contactId = null;
        // Contact response = api.findOrganizationContact(organizationId, contactId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations contacts
     *
     * Lists organizations contacts 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationContactsTest() throws ApiException {
        String organizationId = null;
        String search = null;
        String sortBy = null;
        String sortDir = null;
        Long firstResult = null;
        Long maxResults = null;
        // List<Contact> response = api.listOrganizationContacts(organizationId, search, sortBy, sortDir, firstResult, maxResults);

        // TODO: test validations
    }
    
}
