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
	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// V1Iterative Matrix based on a custom iterative algorithm (suggestions -> mapping -> reduce -> repeat)
//
// swagger:model v1Iterative
type V1Iterative struct {

	// Number of concurrent runs
	Concurrency int32 `json:"concurrency,omitempty"`

	// Container specification for crating new observations based on data from previous iterations
	Container V1Container `json:"container,omitempty"`

	// A list of Early stopping objects, accpets both metric and failure early stopping mechanisms
	EarlyStopping []interface{} `json:"early_stopping"`

	// Kind of matrix, should be equal to "iterative"
	Kind *string `json:"kind,omitempty"`

	// Number of iterations to run
	NumIterations int32 `json:"num_iterations,omitempty"`

	// Hyperparams/Space definition of params to traverse
	Params map[string]interface{} `json:"params,omitempty"`

	// Seed for the random generator
	Seed int32 `json:"seed,omitempty"`
}

// Validate validates this v1 iterative
func (m *V1Iterative) Validate(formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *V1Iterative) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *V1Iterative) UnmarshalBinary(b []byte) error {
	var res V1Iterative
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
