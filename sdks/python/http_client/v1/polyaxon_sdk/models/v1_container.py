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
    Polyaxon SDKs and REST API specification.

    Polyaxon SDKs and REST API specification.  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: contact@polyaxon.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class V1Container(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        "kind": "str",
        "image": "str",
        "image_pull_policy": "str",
        "command": "list[str]",
        "args": "list[str]",
    }

    attribute_map = {
        "kind": "kind",
        "image": "image",
        "image_pull_policy": "image_pull_policy",
        "command": "command",
        "args": "args",
    }

    def __init__(
        self, kind=None, image=None, image_pull_policy=None, command=None, args=None
    ):  # noqa: E501
        """V1Container - a model defined in Swagger"""  # noqa: E501

        self._kind = None
        self._image = None
        self._image_pull_policy = None
        self._command = None
        self._args = None
        self.discriminator = None

        if kind is not None:
            self.kind = kind
        if image is not None:
            self.image = image
        if image_pull_policy is not None:
            self.image_pull_policy = image_pull_policy
        if command is not None:
            self.command = command
        if args is not None:
            self.args = args

    @property
    def kind(self):
        """Gets the kind of this V1Container.  # noqa: E501


        :return: The kind of this V1Container.  # noqa: E501
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """Sets the kind of this V1Container.


        :param kind: The kind of this V1Container.  # noqa: E501
        :type: str
        """

        self._kind = kind

    @property
    def image(self):
        """Gets the image of this V1Container.  # noqa: E501


        :return: The image of this V1Container.  # noqa: E501
        :rtype: str
        """
        return self._image

    @image.setter
    def image(self, image):
        """Sets the image of this V1Container.


        :param image: The image of this V1Container.  # noqa: E501
        :type: str
        """

        self._image = image

    @property
    def image_pull_policy(self):
        """Gets the image_pull_policy of this V1Container.  # noqa: E501


        :return: The image_pull_policy of this V1Container.  # noqa: E501
        :rtype: str
        """
        return self._image_pull_policy

    @image_pull_policy.setter
    def image_pull_policy(self, image_pull_policy):
        """Sets the image_pull_policy of this V1Container.


        :param image_pull_policy: The image_pull_policy of this V1Container.  # noqa: E501
        :type: str
        """

        self._image_pull_policy = image_pull_policy

    @property
    def command(self):
        """Gets the command of this V1Container.  # noqa: E501

        The command to execute on the container.  # noqa: E501

        :return: The command of this V1Container.  # noqa: E501
        :rtype: list[str]
        """
        return self._command

    @command.setter
    def command(self, command):
        """Sets the command of this V1Container.

        The command to execute on the container.  # noqa: E501

        :param command: The command of this V1Container.  # noqa: E501
        :type: list[str]
        """

        self._command = command

    @property
    def args(self):
        """Gets the args of this V1Container.  # noqa: E501

        Arguments to the entrypoint.  # noqa: E501

        :return: The args of this V1Container.  # noqa: E501
        :rtype: list[str]
        """
        return self._args

    @args.setter
    def args(self, args):
        """Sets the args of this V1Container.

        Arguments to the entrypoint.  # noqa: E501

        :param args: The args of this V1Container.  # noqa: E501
        :type: list[str]
        """

        self._args = args

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(
                    map(lambda x: x.to_dict() if hasattr(x, "to_dict") else x, value)
                )
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(
                    map(
                        lambda item: (item[0], item[1].to_dict())
                        if hasattr(item[1], "to_dict")
                        else item,
                        value.items(),
                    )
                )
            else:
                result[attr] = value
        if issubclass(V1Container, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, V1Container):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other