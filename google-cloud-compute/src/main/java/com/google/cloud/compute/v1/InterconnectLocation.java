/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InterconnectLocation implements ApiMessage {
  private final String address;
  private final String availabilityZone;
  private final String city;
  private final String continent;
  private final String creationTimestamp;
  private final String description;
  private final String facilityProvider;
  private final String facilityProviderFacilityId;
  private final String id;
  private final String kind;
  private final String name;
  private final String peeringdbFacilityId;
  private final List<InterconnectLocationRegionInfo> regionInfos;
  private final String selfLink;
  private final String status;

  private InterconnectLocation() {
    this.address = null;
    this.availabilityZone = null;
    this.city = null;
    this.continent = null;
    this.creationTimestamp = null;
    this.description = null;
    this.facilityProvider = null;
    this.facilityProviderFacilityId = null;
    this.id = null;
    this.kind = null;
    this.name = null;
    this.peeringdbFacilityId = null;
    this.regionInfos = null;
    this.selfLink = null;
    this.status = null;
  }

  private InterconnectLocation(
      String address,
      String availabilityZone,
      String city,
      String continent,
      String creationTimestamp,
      String description,
      String facilityProvider,
      String facilityProviderFacilityId,
      String id,
      String kind,
      String name,
      String peeringdbFacilityId,
      List<InterconnectLocationRegionInfo> regionInfos,
      String selfLink,
      String status) {
    this.address = address;
    this.availabilityZone = availabilityZone;
    this.city = city;
    this.continent = continent;
    this.creationTimestamp = creationTimestamp;
    this.description = description;
    this.facilityProvider = facilityProvider;
    this.facilityProviderFacilityId = facilityProviderFacilityId;
    this.id = id;
    this.kind = kind;
    this.name = name;
    this.peeringdbFacilityId = peeringdbFacilityId;
    this.regionInfos = regionInfos;
    this.selfLink = selfLink;
    this.status = status;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("address".equals(fieldName)) {
      return address;
    }
    if ("availabilityZone".equals(fieldName)) {
      return availabilityZone;
    }
    if ("city".equals(fieldName)) {
      return city;
    }
    if ("continent".equals(fieldName)) {
      return continent;
    }
    if ("creationTimestamp".equals(fieldName)) {
      return creationTimestamp;
    }
    if ("description".equals(fieldName)) {
      return description;
    }
    if ("facilityProvider".equals(fieldName)) {
      return facilityProvider;
    }
    if ("facilityProviderFacilityId".equals(fieldName)) {
      return facilityProviderFacilityId;
    }
    if ("id".equals(fieldName)) {
      return id;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("peeringdbFacilityId".equals(fieldName)) {
      return peeringdbFacilityId;
    }
    if ("regionInfos".equals(fieldName)) {
      return regionInfos;
    }
    if ("selfLink".equals(fieldName)) {
      return selfLink;
    }
    if ("status".equals(fieldName)) {
      return status;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  public List<String> getFieldMask() {
    return null;
  }

  public String getAddress() {
    return address;
  }

  public String getAvailabilityZone() {
    return availabilityZone;
  }

  public String getCity() {
    return city;
  }

  public String getContinent() {
    return continent;
  }

  public String getCreationTimestamp() {
    return creationTimestamp;
  }

  public String getDescription() {
    return description;
  }

  public String getFacilityProvider() {
    return facilityProvider;
  }

  public String getFacilityProviderFacilityId() {
    return facilityProviderFacilityId;
  }

  public String getId() {
    return id;
  }

  public String getKind() {
    return kind;
  }

  public String getName() {
    return name;
  }

  public String getPeeringdbFacilityId() {
    return peeringdbFacilityId;
  }

  public List<InterconnectLocationRegionInfo> getRegionInfosList() {
    return regionInfos;
  }

  public String getSelfLink() {
    return selfLink;
  }

  public String getStatus() {
    return status;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InterconnectLocation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InterconnectLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InterconnectLocation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InterconnectLocation();
  }

  public static class Builder {
    private String address;
    private String availabilityZone;
    private String city;
    private String continent;
    private String creationTimestamp;
    private String description;
    private String facilityProvider;
    private String facilityProviderFacilityId;
    private String id;
    private String kind;
    private String name;
    private String peeringdbFacilityId;
    private List<InterconnectLocationRegionInfo> regionInfos;
    private String selfLink;
    private String status;

    Builder() {}

    public Builder mergeFrom(InterconnectLocation other) {
      if (other == InterconnectLocation.getDefaultInstance()) return this;
      if (other.getAddress() != null) {
        this.address = other.address;
      }
      if (other.getAvailabilityZone() != null) {
        this.availabilityZone = other.availabilityZone;
      }
      if (other.getCity() != null) {
        this.city = other.city;
      }
      if (other.getContinent() != null) {
        this.continent = other.continent;
      }
      if (other.getCreationTimestamp() != null) {
        this.creationTimestamp = other.creationTimestamp;
      }
      if (other.getDescription() != null) {
        this.description = other.description;
      }
      if (other.getFacilityProvider() != null) {
        this.facilityProvider = other.facilityProvider;
      }
      if (other.getFacilityProviderFacilityId() != null) {
        this.facilityProviderFacilityId = other.facilityProviderFacilityId;
      }
      if (other.getId() != null) {
        this.id = other.id;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getPeeringdbFacilityId() != null) {
        this.peeringdbFacilityId = other.peeringdbFacilityId;
      }
      if (other.getRegionInfosList() != null) {
        this.regionInfos = other.regionInfos;
      }
      if (other.getSelfLink() != null) {
        this.selfLink = other.selfLink;
      }
      if (other.getStatus() != null) {
        this.status = other.status;
      }
      return this;
    }

    Builder(InterconnectLocation source) {
      this.address = source.address;
      this.availabilityZone = source.availabilityZone;
      this.city = source.city;
      this.continent = source.continent;
      this.creationTimestamp = source.creationTimestamp;
      this.description = source.description;
      this.facilityProvider = source.facilityProvider;
      this.facilityProviderFacilityId = source.facilityProviderFacilityId;
      this.id = source.id;
      this.kind = source.kind;
      this.name = source.name;
      this.peeringdbFacilityId = source.peeringdbFacilityId;
      this.regionInfos = source.regionInfos;
      this.selfLink = source.selfLink;
      this.status = source.status;
    }

    public String getAddress() {
      return address;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }

    public String getAvailabilityZone() {
      return availabilityZone;
    }

    public Builder setAvailabilityZone(String availabilityZone) {
      this.availabilityZone = availabilityZone;
      return this;
    }

    public String getCity() {
      return city;
    }

    public Builder setCity(String city) {
      this.city = city;
      return this;
    }

    public String getContinent() {
      return continent;
    }

    public Builder setContinent(String continent) {
      this.continent = continent;
      return this;
    }

    public String getCreationTimestamp() {
      return creationTimestamp;
    }

    public Builder setCreationTimestamp(String creationTimestamp) {
      this.creationTimestamp = creationTimestamp;
      return this;
    }

    public String getDescription() {
      return description;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public String getFacilityProvider() {
      return facilityProvider;
    }

    public Builder setFacilityProvider(String facilityProvider) {
      this.facilityProvider = facilityProvider;
      return this;
    }

    public String getFacilityProviderFacilityId() {
      return facilityProviderFacilityId;
    }

    public Builder setFacilityProviderFacilityId(String facilityProviderFacilityId) {
      this.facilityProviderFacilityId = facilityProviderFacilityId;
      return this;
    }

    public String getId() {
      return id;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    public String getKind() {
      return kind;
    }

    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    public String getName() {
      return name;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public String getPeeringdbFacilityId() {
      return peeringdbFacilityId;
    }

    public Builder setPeeringdbFacilityId(String peeringdbFacilityId) {
      this.peeringdbFacilityId = peeringdbFacilityId;
      return this;
    }

    public List<InterconnectLocationRegionInfo> getRegionInfosList() {
      return regionInfos;
    }

    public Builder addAllRegionInfos(List<InterconnectLocationRegionInfo> regionInfos) {
      if (this.regionInfos == null) {
        this.regionInfos = new LinkedList<>();
      }
      this.regionInfos.addAll(regionInfos);
      return this;
    }

    public Builder addRegionInfos(InterconnectLocationRegionInfo regionInfos) {
      if (this.regionInfos == null) {
        this.regionInfos = new LinkedList<>();
      }
      this.regionInfos.add(regionInfos);
      return this;
    }

    public String getSelfLink() {
      return selfLink;
    }

    public Builder setSelfLink(String selfLink) {
      this.selfLink = selfLink;
      return this;
    }

    public String getStatus() {
      return status;
    }

    public Builder setStatus(String status) {
      this.status = status;
      return this;
    }

    public InterconnectLocation build() {

      return new InterconnectLocation(
          address,
          availabilityZone,
          city,
          continent,
          creationTimestamp,
          description,
          facilityProvider,
          facilityProviderFacilityId,
          id,
          kind,
          name,
          peeringdbFacilityId,
          regionInfos,
          selfLink,
          status);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAddress(this.address);
      newBuilder.setAvailabilityZone(this.availabilityZone);
      newBuilder.setCity(this.city);
      newBuilder.setContinent(this.continent);
      newBuilder.setCreationTimestamp(this.creationTimestamp);
      newBuilder.setDescription(this.description);
      newBuilder.setFacilityProvider(this.facilityProvider);
      newBuilder.setFacilityProviderFacilityId(this.facilityProviderFacilityId);
      newBuilder.setId(this.id);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setPeeringdbFacilityId(this.peeringdbFacilityId);
      newBuilder.addAllRegionInfos(this.regionInfos);
      newBuilder.setSelfLink(this.selfLink);
      newBuilder.setStatus(this.status);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InterconnectLocation{"
        + "address="
        + address
        + ", "
        + "availabilityZone="
        + availabilityZone
        + ", "
        + "city="
        + city
        + ", "
        + "continent="
        + continent
        + ", "
        + "creationTimestamp="
        + creationTimestamp
        + ", "
        + "description="
        + description
        + ", "
        + "facilityProvider="
        + facilityProvider
        + ", "
        + "facilityProviderFacilityId="
        + facilityProviderFacilityId
        + ", "
        + "id="
        + id
        + ", "
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "peeringdbFacilityId="
        + peeringdbFacilityId
        + ", "
        + "regionInfos="
        + regionInfos
        + ", "
        + "selfLink="
        + selfLink
        + ", "
        + "status="
        + status
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InterconnectLocation) {
      InterconnectLocation that = (InterconnectLocation) o;
      return Objects.equals(this.address, that.getAddress())
          && Objects.equals(this.availabilityZone, that.getAvailabilityZone())
          && Objects.equals(this.city, that.getCity())
          && Objects.equals(this.continent, that.getContinent())
          && Objects.equals(this.creationTimestamp, that.getCreationTimestamp())
          && Objects.equals(this.description, that.getDescription())
          && Objects.equals(this.facilityProvider, that.getFacilityProvider())
          && Objects.equals(this.facilityProviderFacilityId, that.getFacilityProviderFacilityId())
          && Objects.equals(this.id, that.getId())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.peeringdbFacilityId, that.getPeeringdbFacilityId())
          && Objects.equals(this.regionInfos, that.getRegionInfosList())
          && Objects.equals(this.selfLink, that.getSelfLink())
          && Objects.equals(this.status, that.getStatus());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        address,
        availabilityZone,
        city,
        continent,
        creationTimestamp,
        description,
        facilityProvider,
        facilityProviderFacilityId,
        id,
        kind,
        name,
        peeringdbFacilityId,
        regionInfos,
        selfLink,
        status);
  }
}
