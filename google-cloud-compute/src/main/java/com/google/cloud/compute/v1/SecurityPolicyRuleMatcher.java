/*
 * Copyright 2018 Google LLC
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
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class SecurityPolicyRuleMatcher implements ApiMessage {
  private final SecurityPolicyRuleMatcherConfig config;
  private final String versionedExpr;

  private SecurityPolicyRuleMatcher() {
    this.config = null;
    this.versionedExpr = null;
  }

  private SecurityPolicyRuleMatcher(SecurityPolicyRuleMatcherConfig config, String versionedExpr) {
    this.config = config;
    this.versionedExpr = versionedExpr;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if (fieldName.equals("config")) {
      return config;
    }
    if (fieldName.equals("versionedExpr")) {
      return versionedExpr;
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

  public SecurityPolicyRuleMatcherConfig getConfig() {
    return config;
  }

  public String getVersionedExpr() {
    return versionedExpr;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(SecurityPolicyRuleMatcher prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static SecurityPolicyRuleMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final SecurityPolicyRuleMatcher DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new SecurityPolicyRuleMatcher();
  }

  public static class Builder {
    private SecurityPolicyRuleMatcherConfig config;
    private String versionedExpr;

    Builder() {}

    public Builder mergeFrom(SecurityPolicyRuleMatcher other) {
      if (other == SecurityPolicyRuleMatcher.getDefaultInstance()) return this;
      if (other.getConfig() != null) {
        this.config = other.config;
      }
      if (other.getVersionedExpr() != null) {
        this.versionedExpr = other.versionedExpr;
      }
      return this;
    }

    Builder(SecurityPolicyRuleMatcher source) {
      this.config = source.config;
      this.versionedExpr = source.versionedExpr;
    }

    public SecurityPolicyRuleMatcherConfig getConfig() {
      return config;
    }

    public Builder setConfig(SecurityPolicyRuleMatcherConfig config) {
      this.config = config;
      return this;
    }

    public String getVersionedExpr() {
      return versionedExpr;
    }

    public Builder setVersionedExpr(String versionedExpr) {
      this.versionedExpr = versionedExpr;
      return this;
    }

    public SecurityPolicyRuleMatcher build() {

      return new SecurityPolicyRuleMatcher(config, versionedExpr);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setConfig(this.config);
      newBuilder.setVersionedExpr(this.versionedExpr);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "SecurityPolicyRuleMatcher{"
        + "config="
        + config
        + ", "
        + "versionedExpr="
        + versionedExpr
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SecurityPolicyRuleMatcher) {
      SecurityPolicyRuleMatcher that = (SecurityPolicyRuleMatcher) o;
      return Objects.equals(this.config, that.getConfig())
          && Objects.equals(this.versionedExpr, that.getVersionedExpr());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, versionedExpr);
  }
}