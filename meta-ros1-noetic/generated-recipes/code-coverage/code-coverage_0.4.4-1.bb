# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "CMake configuration to run coverage"
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
HOMEPAGE = "https://github.com/mikeferguson/code_coverage"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "code_coverage"
ROS_BPN = "code_coverage"

ROS_BUILD_DEPENDS = " \
    lcov \
    python3-coverage \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    lcov \
    python3-coverage \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lcov \
    python3-coverage \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mikeferguson/code_coverage-gbp/archive/release/noetic/code_coverage/0.4.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/code_coverage"
SRC_URI = "git://github.com/mikeferguson/code_coverage-gbp;${ROS_BRANCH};protocol=https"
SRCREV = "9a564e5d5c7cbd6fc3e518eb404e95efb61c3fa2"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
