#!/usr/bin/python
#
# Copyright 2019 Polyaxon, Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# coding: utf-8

"""
    Polyaxon sdk

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: 1.14.4
    Contact: contact@polyaxon.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import polyaxon_sdk
from polyaxon_sdk.api.build_service_api import BuildServiceApi  # noqa: E501
from polyaxon_sdk.rest import ApiException


class TestBuildServiceApi(unittest.TestCase):
    """BuildServiceApi unit test stubs"""

    def setUp(self):
        self.api = polyaxon_sdk.api.build_service_api.BuildServiceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_archive_build(self):
        """Test case for archive_build

        Archive build  # noqa: E501
        """
        pass

    def test_bookmark_build(self):
        """Test case for bookmark_build

        Bookmark build  # noqa: E501
        """
        pass

    def test_create_build(self):
        """Test case for create_build

        Create new build  # noqa: E501
        """
        pass

    def test_create_build_code_ref(self):
        """Test case for create_build_code_ref

        Create build code ref  # noqa: E501
        """
        pass

    def test_create_build_status(self):
        """Test case for create_build_status

        Create new build status  # noqa: E501
        """
        pass

    def test_delete_build(self):
        """Test case for delete_build

        Delete build  # noqa: E501
        """
        pass

    def test_delete_builds(self):
        """Test case for delete_builds

        Delete builds  # noqa: E501
        """
        pass

    def test_get_build(self):
        """Test case for get_build

        Get build  # noqa: E501
        """
        pass

    def test_get_build_code_ref(self):
        """Test case for get_build_code_ref

        Get build code ref  # noqa: E501
        """
        pass

    def test_list_archived_builds(self):
        """Test case for list_archived_builds

        List archived builds  # noqa: E501
        """
        pass

    def test_list_bookmarked_builds(self):
        """Test case for list_bookmarked_builds

        List bookmarked builds  # noqa: E501
        """
        pass

    def test_list_build_statuses(self):
        """Test case for list_build_statuses

        List build statuses  # noqa: E501
        """
        pass

    def test_list_builds(self):
        """Test case for list_builds

        List builds  # noqa: E501
        """
        pass

    def test_restart_build(self):
        """Test case for restart_build

        Restart build  # noqa: E501
        """
        pass

    def test_restore_build(self):
        """Test case for restore_build

        Restore build  # noqa: E501
        """
        pass

    def test_stop_build(self):
        """Test case for stop_build

        Stop build  # noqa: E501
        """
        pass

    def test_stop_builds(self):
        """Test case for stop_builds

        Stop builds  # noqa: E501
        """
        pass

    def test_un_bookmark_build(self):
        """Test case for un_bookmark_build

        UnBookmark build  # noqa: E501
        """
        pass

    def test_update_build2(self):
        """Test case for update_build2

        Update build  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
