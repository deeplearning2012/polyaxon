// Copyright 2019 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1ProjectSettings
 */

public class V1ProjectSettings {
  @SerializedName("logs_store")
  private String logsStore = null;

  @SerializedName("outputs_store")
  private String outputsStore = null;

  @SerializedName("artifacts_stores")
  private List<String> artifactsStores = null;

  @SerializedName("git_accesses")
  private List<String> gitAccesses = null;

  @SerializedName("registry_accesses")
  private List<String> registryAccesses = null;

  @SerializedName("k8s_secrets")
  private List<String> k8sSecrets = null;

  @SerializedName("k8s_config_maps")
  private List<String> k8sConfigMaps = null;

  @SerializedName("run_profile")
  private String runProfile = null;

  @SerializedName("run_profiles")
  private List<String> runProfiles = null;

  public V1ProjectSettings logsStore(String logsStore) {
    this.logsStore = logsStore;
    return this;
  }

   /**
   * Get logsStore
   * @return logsStore
  **/
  @ApiModelProperty(value = "")
  public String getLogsStore() {
    return logsStore;
  }

  public void setLogsStore(String logsStore) {
    this.logsStore = logsStore;
  }

  public V1ProjectSettings outputsStore(String outputsStore) {
    this.outputsStore = outputsStore;
    return this;
  }

   /**
   * Get outputsStore
   * @return outputsStore
  **/
  @ApiModelProperty(value = "")
  public String getOutputsStore() {
    return outputsStore;
  }

  public void setOutputsStore(String outputsStore) {
    this.outputsStore = outputsStore;
  }

  public V1ProjectSettings artifactsStores(List<String> artifactsStores) {
    this.artifactsStores = artifactsStores;
    return this;
  }

  public V1ProjectSettings addArtifactsStoresItem(String artifactsStoresItem) {
    if (this.artifactsStores == null) {
      this.artifactsStores = new ArrayList<String>();
    }
    this.artifactsStores.add(artifactsStoresItem);
    return this;
  }

   /**
   * Get artifactsStores
   * @return artifactsStores
  **/
  @ApiModelProperty(value = "")
  public List<String> getArtifactsStores() {
    return artifactsStores;
  }

  public void setArtifactsStores(List<String> artifactsStores) {
    this.artifactsStores = artifactsStores;
  }

  public V1ProjectSettings gitAccesses(List<String> gitAccesses) {
    this.gitAccesses = gitAccesses;
    return this;
  }

  public V1ProjectSettings addGitAccessesItem(String gitAccessesItem) {
    if (this.gitAccesses == null) {
      this.gitAccesses = new ArrayList<String>();
    }
    this.gitAccesses.add(gitAccessesItem);
    return this;
  }

   /**
   * Get gitAccesses
   * @return gitAccesses
  **/
  @ApiModelProperty(value = "")
  public List<String> getGitAccesses() {
    return gitAccesses;
  }

  public void setGitAccesses(List<String> gitAccesses) {
    this.gitAccesses = gitAccesses;
  }

  public V1ProjectSettings registryAccesses(List<String> registryAccesses) {
    this.registryAccesses = registryAccesses;
    return this;
  }

  public V1ProjectSettings addRegistryAccessesItem(String registryAccessesItem) {
    if (this.registryAccesses == null) {
      this.registryAccesses = new ArrayList<String>();
    }
    this.registryAccesses.add(registryAccessesItem);
    return this;
  }

   /**
   * Get registryAccesses
   * @return registryAccesses
  **/
  @ApiModelProperty(value = "")
  public List<String> getRegistryAccesses() {
    return registryAccesses;
  }

  public void setRegistryAccesses(List<String> registryAccesses) {
    this.registryAccesses = registryAccesses;
  }

  public V1ProjectSettings k8sSecrets(List<String> k8sSecrets) {
    this.k8sSecrets = k8sSecrets;
    return this;
  }

  public V1ProjectSettings addK8sSecretsItem(String k8sSecretsItem) {
    if (this.k8sSecrets == null) {
      this.k8sSecrets = new ArrayList<String>();
    }
    this.k8sSecrets.add(k8sSecretsItem);
    return this;
  }

   /**
   * Get k8sSecrets
   * @return k8sSecrets
  **/
  @ApiModelProperty(value = "")
  public List<String> getK8sSecrets() {
    return k8sSecrets;
  }

  public void setK8sSecrets(List<String> k8sSecrets) {
    this.k8sSecrets = k8sSecrets;
  }

  public V1ProjectSettings k8sConfigMaps(List<String> k8sConfigMaps) {
    this.k8sConfigMaps = k8sConfigMaps;
    return this;
  }

  public V1ProjectSettings addK8sConfigMapsItem(String k8sConfigMapsItem) {
    if (this.k8sConfigMaps == null) {
      this.k8sConfigMaps = new ArrayList<String>();
    }
    this.k8sConfigMaps.add(k8sConfigMapsItem);
    return this;
  }

   /**
   * Get k8sConfigMaps
   * @return k8sConfigMaps
  **/
  @ApiModelProperty(value = "")
  public List<String> getK8sConfigMaps() {
    return k8sConfigMaps;
  }

  public void setK8sConfigMaps(List<String> k8sConfigMaps) {
    this.k8sConfigMaps = k8sConfigMaps;
  }

  public V1ProjectSettings runProfile(String runProfile) {
    this.runProfile = runProfile;
    return this;
  }

   /**
   * Get runProfile
   * @return runProfile
  **/
  @ApiModelProperty(value = "")
  public String getRunProfile() {
    return runProfile;
  }

  public void setRunProfile(String runProfile) {
    this.runProfile = runProfile;
  }

  public V1ProjectSettings runProfiles(List<String> runProfiles) {
    this.runProfiles = runProfiles;
    return this;
  }

  public V1ProjectSettings addRunProfilesItem(String runProfilesItem) {
    if (this.runProfiles == null) {
      this.runProfiles = new ArrayList<String>();
    }
    this.runProfiles.add(runProfilesItem);
    return this;
  }

   /**
   * Get runProfiles
   * @return runProfiles
  **/
  @ApiModelProperty(value = "")
  public List<String> getRunProfiles() {
    return runProfiles;
  }

  public void setRunProfiles(List<String> runProfiles) {
    this.runProfiles = runProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProjectSettings v1ProjectSettings = (V1ProjectSettings) o;
    return Objects.equals(this.logsStore, v1ProjectSettings.logsStore) &&
        Objects.equals(this.outputsStore, v1ProjectSettings.outputsStore) &&
        Objects.equals(this.artifactsStores, v1ProjectSettings.artifactsStores) &&
        Objects.equals(this.gitAccesses, v1ProjectSettings.gitAccesses) &&
        Objects.equals(this.registryAccesses, v1ProjectSettings.registryAccesses) &&
        Objects.equals(this.k8sSecrets, v1ProjectSettings.k8sSecrets) &&
        Objects.equals(this.k8sConfigMaps, v1ProjectSettings.k8sConfigMaps) &&
        Objects.equals(this.runProfile, v1ProjectSettings.runProfile) &&
        Objects.equals(this.runProfiles, v1ProjectSettings.runProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logsStore, outputsStore, artifactsStores, gitAccesses, registryAccesses, k8sSecrets, k8sConfigMaps, runProfile, runProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProjectSettings {\n");
    
    sb.append("    logsStore: ").append(toIndentedString(logsStore)).append("\n");
    sb.append("    outputsStore: ").append(toIndentedString(outputsStore)).append("\n");
    sb.append("    artifactsStores: ").append(toIndentedString(artifactsStores)).append("\n");
    sb.append("    gitAccesses: ").append(toIndentedString(gitAccesses)).append("\n");
    sb.append("    registryAccesses: ").append(toIndentedString(registryAccesses)).append("\n");
    sb.append("    k8sSecrets: ").append(toIndentedString(k8sSecrets)).append("\n");
    sb.append("    k8sConfigMaps: ").append(toIndentedString(k8sConfigMaps)).append("\n");
    sb.append("    runProfile: ").append(toIndentedString(runProfile)).append("\n");
    sb.append("    runProfiles: ").append(toIndentedString(runProfiles)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
