// Copyright 2018-2020 Polyaxon, Inc.
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

/* tslint:disable */
/* eslint-disable */
/**
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * The version of the OpenAPI document: 1.0.98
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    V1Environment,
    V1EnvironmentFromJSON,
    V1EnvironmentFromJSONTyped,
    V1EnvironmentToJSON,
    V1Init,
    V1InitFromJSON,
    V1InitFromJSONTyped,
    V1InitToJSON,
} from './';

/**
 * 
 * @export
 * @interface V1KFReplica
 */
export interface V1KFReplica {
    /**
     * 
     * @type {number}
     * @memberof V1KFReplica
     */
    replicas?: number;
    /**
     * 
     * @type {V1Environment}
     * @memberof V1KFReplica
     */
    environment?: V1Environment;
    /**
     * 
     * @type {Array<string>}
     * @memberof V1KFReplica
     */
    connections?: Array<string>;
    /**
     * 
     * @type {Array<object>}
     * @memberof V1KFReplica
     */
    volumes?: Array<object>;
    /**
     * 
     * @type {Array<V1Init>}
     * @memberof V1KFReplica
     */
    init?: Array<V1Init>;
    /**
     * 
     * @type {Array<object>}
     * @memberof V1KFReplica
     */
    sidecars?: Array<object>;
    /**
     * 
     * @type {object}
     * @memberof V1KFReplica
     */
    container?: object;
}

export function V1KFReplicaFromJSON(json: any): V1KFReplica {
    return V1KFReplicaFromJSONTyped(json, false);
}

export function V1KFReplicaFromJSONTyped(json: any, ignoreDiscriminator: boolean): V1KFReplica {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'replicas': !exists(json, 'replicas') ? undefined : json['replicas'],
        'environment': !exists(json, 'environment') ? undefined : V1EnvironmentFromJSON(json['environment']),
        'connections': !exists(json, 'connections') ? undefined : json['connections'],
        'volumes': !exists(json, 'volumes') ? undefined : json['volumes'],
        'init': !exists(json, 'init') ? undefined : ((json['init'] as Array<any>).map(V1InitFromJSON)),
        'sidecars': !exists(json, 'sidecars') ? undefined : json['sidecars'],
        'container': !exists(json, 'container') ? undefined : json['container'],
    };
}

export function V1KFReplicaToJSON(value?: V1KFReplica | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'replicas': value.replicas,
        'environment': V1EnvironmentToJSON(value.environment),
        'connections': value.connections,
        'volumes': value.volumes,
        'init': value.init === undefined ? undefined : ((value.init as Array<any>).map(V1InitToJSON)),
        'sidecars': value.sidecars,
        'container': value.container,
    };
}


