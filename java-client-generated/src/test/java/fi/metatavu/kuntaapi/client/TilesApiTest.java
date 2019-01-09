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
import fi.metatavu.kuntaapi.client.model.Tile;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.Attachment;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TilesApi
 */
public class TilesApiTest {

    private final TilesApi api = new TilesApi();

    
    /**
     * Finds organizations tile
     *
     * Finds single organization tile 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationTileTest() throws ApiException {
        String organizationId = null;
        String tileId = null;
        // Tile response = api.findOrganizationTile(organizationId, tileId);

        // TODO: test validations
    }
    
    /**
     * Returns a single organiztion tile image
     *
     * Returns a single organiztion tile image 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findOrganizationTileImageTest() throws ApiException {
        String organizationId = null;
        String tileId = null;
        String imageId = null;
        // Attachment response = api.findOrganizationTileImage(organizationId, tileId, imageId);

        // TODO: test validations
    }
    
    /**
     * Returns an organization tile image data
     *
     * Returns an organization tile image data 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationTileImageDataTest() throws ApiException {
        String organizationId = null;
        String tileId = null;
        String imageId = null;
        Integer size = null;
        // byte[] response = api.getOrganizationTileImageData(organizationId, tileId, imageId, size);

        // TODO: test validations
    }
    
    /**
     * Returns a list of organization tile images
     *
     * Returns a list of organization tile images 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationTileImagesTest() throws ApiException {
        String organizationId = null;
        String tileId = null;
        // List<Attachment> response = api.listOrganizationTileImages(organizationId, tileId);

        // TODO: test validations
    }
    
    /**
     * Lists organizations tiles
     *
     * Lists organizations tiles 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationTilesTest() throws ApiException {
        String organizationId = null;
        // List<Tile> response = api.listOrganizationTiles(organizationId);

        // TODO: test validations
    }
    
}