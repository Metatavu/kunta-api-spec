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
import fi.metatavu.kuntaapi.client.model.OrganizationSetting;
import fi.metatavu.kuntaapi.client.model.BadRequest;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * Creates organization setting
     *
     * Creates organization setting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationSettingTest() throws ApiException {
        String organizationId = null;
        OrganizationSetting setting = null;
        // OrganizationSetting response = api.createOrganizationSetting(organizationId, setting);

        // TODO: test validations
    }
    
    /**
     * Deletes an organization setting
     *
     * Deletes an organization setting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationSettingTest() throws ApiException {
        String organizationId = null;
        String settingId = null;
        // api.deleteOrganizationSetting(organizationId, settingId);

        // TODO: test validations
    }
    
    /**
     * Finds organizations setting
     *
     * Finds single organization setting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationSettingTest() throws ApiException {
        String organizationId = null;
        String settingId = null;
        // OrganizationSetting response = api.findOrganizationSetting(organizationId, settingId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations settings
     *
     * Lists organizations settings 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationSettingsTest() throws ApiException {
        String organizationId = null;
        String key = null;
        // List<OrganizationSetting> response = api.listOrganizationSettings(organizationId, key);

        // TODO: test validations
    }
    
    /**
     * Updates an organization setting
     *
     * Updates an organization setting 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationSettingTest() throws ApiException {
        String organizationId = null;
        String settingId = null;
        OrganizationSetting setting = null;
        // OrganizationSetting response = api.updateOrganizationSetting(organizationId, settingId, setting);

        // TODO: test validations
    }
    
}
