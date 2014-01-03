/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.rs.client;

import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import org.gedcomx.Gedcomx;
import org.gedcomx.links.SupportsLinks;

/**
 * @author Ryan Heaton
 */
public class RecordState extends GedcomxApplicationState<Gedcomx> {

  public RecordState(ClientRequest request, ClientResponse response, String accessToken, StateFactory stateFactory) {
    super(request, response, accessToken, stateFactory);
  }

  @Override
  protected RecordState clone(ClientRequest request, ClientResponse response) {
    return new RecordState(request, response, this.accessToken, this.stateFactory);
  }

  @Override
  public RecordState ifSuccessful() {
    return (RecordState) super.ifSuccessful();
  }

  @Override
  public RecordState head() {
    return (RecordState) super.head();
  }

  @Override
  public RecordState get() {
    return (RecordState) super.get();
  }

  @Override
  public RecordState delete() {
    return (RecordState) super.delete();
  }

  @Override
  public RecordState put(Gedcomx e) {
    return (RecordState) super.put(e);
  }

  @Override
  protected Gedcomx loadEntity(ClientResponse response) {
    return response.getClientResponseStatus() == ClientResponse.Status.OK ? response.getEntity(Gedcomx.class) : null;
  }

  @Override
  protected SupportsLinks getScope() {
    return getEntity();
  }

}