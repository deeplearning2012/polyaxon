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

// Code generated by go-swagger; DO NOT EDIT.

package service_model

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"github.com/go-openapi/errors"
	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// V1Hyperband Matrix based on hyperband
//
// swagger:model v1Hyperband
type V1Hyperband struct {

	// Number of concurrent runs
	Concurrency int32 `json:"concurrency,omitempty"`

	// A list of Early stopping objects, accpets both metric and failure early stopping mechanisms
	EarlyStopping []interface{} `json:"early_stopping"`

	// Eta
	Eta int32 `json:"eta,omitempty"`

	// Kind of matrix, should be equal to "hyperband"
	Kind *string `json:"kind,omitempty"`

	// Max iteration
	MaxIterations int32 `json:"max_iterations,omitempty"`

	// Metric to optimize during the iterations
	Metric *V1OptimizationMetric `json:"metric,omitempty"`

	// Hyperparams/Space definition of params to traverse
	Params map[string]interface{} `json:"params,omitempty"`

	// Resource to optimize (should be an integer or a float)
	Resource *V1OptimizationResource `json:"resource,omitempty"`

	// A flag to resume or restart the selected runs
	Resume bool `json:"resume,omitempty"`

	// Seed for the random generator
	Seed int32 `json:"seed,omitempty"`
}

// Validate validates this v1 hyperband
func (m *V1Hyperband) Validate(formats strfmt.Registry) error {
	var res []error

	if err := m.validateMetric(formats); err != nil {
		res = append(res, err)
	}

	if err := m.validateResource(formats); err != nil {
		res = append(res, err)
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}

func (m *V1Hyperband) validateMetric(formats strfmt.Registry) error {

	if swag.IsZero(m.Metric) { // not required
		return nil
	}

	if m.Metric != nil {
		if err := m.Metric.Validate(formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("metric")
			}
			return err
		}
	}

	return nil
}

func (m *V1Hyperband) validateResource(formats strfmt.Registry) error {

	if swag.IsZero(m.Resource) { // not required
		return nil
	}

	if m.Resource != nil {
		if err := m.Resource.Validate(formats); err != nil {
			if ve, ok := err.(*errors.Validation); ok {
				return ve.ValidateName("resource")
			}
			return err
		}
	}

	return nil
}

// MarshalBinary interface implementation
func (m *V1Hyperband) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *V1Hyperband) UnmarshalBinary(b []byte) error {
	var res V1Hyperband
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
