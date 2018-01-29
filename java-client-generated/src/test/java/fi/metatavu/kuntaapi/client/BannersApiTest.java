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
import fi.metatavu.kuntaapi.client.model.NewsArticle;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.Attachment;
import fi.metatavu.kuntaapi.client.model.Banner;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BannersApi
 */
public class BannersApiTest {

    private final BannersApi api = new BannersApi();

    
    /**
     * Finds organizations banner
     *
     * Finds single organization banner 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationBannerTest() throws ApiException {
        String organizationId = null;
        String bannerId = null;
        // NewsArticle response = api.findOrganizationBanner(organizationId, bannerId);

        // TODO: test validations
    }
    
    /**
     * Returns a single organiztion banner image
     *
     * Returns a single organiztion banner image 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationBannerImageTest() throws ApiException {
        String organizationId = null;
        String bannerId = null;
        String imageId = null;
        // Attachment response = api.findOrganizationBannerImage(organizationId, bannerId, imageId);

        // TODO: test validations
    }
    
    /**
     * Returns an organization banner image data
     *
     * Returns an organization banner image data 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationBannerImageDataTest() throws ApiException {
        String organizationId = null;
        String bannerId = null;
        String imageId = null;
        Integer size = null;
        // byte[] response = api.getOrganizationBannerImageData(organizationId, bannerId, imageId, size);

        // TODO: test validations
    }
    
    /**
     * Returns a list of organization banner images
     *
     * Returns a list of organization banner images 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationBannerImagesTest() throws ApiException {
        String organizationId = null;
        String bannerId = null;
        // List<Attachment> response = api.listOrganizationBannerImages(organizationId, bannerId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations banners
     *
     * Lists organizations banners 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationBannersTest() throws ApiException {
        String organizationId = null;
        // List<Banner> response = api.listOrganizationBanners(organizationId);

        // TODO: test validations
    }
    
}
