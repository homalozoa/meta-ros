# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The criutils package"
AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
ROS_AUTHOR = "Francisco Suarez-Ruiz <fsuarez6@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/criutils"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD 3-Clause"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d84cded89c768806cb84461439476daa"

ROS_CN = "criutils"
ROS_BPN = "criutils"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    baldor \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    python3-numpy \
    python3-termcolor \
    resource-retriever \
    rostopic \
    sensor-msgs \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/crigroup/criutils-release/archive/release/noetic/criutils/0.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/criutils"
SRC_URI = "git://github.com/crigroup/criutils-release;${ROS_BRANCH};protocol=https"
SRCREV = "8ee2dfcb056fdc5ebfc4b6c87e2ac4374cdf0686"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
