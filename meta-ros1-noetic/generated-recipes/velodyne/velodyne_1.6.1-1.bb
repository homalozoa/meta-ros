# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Basic ROS support for the Velodyne 3D LIDARs."
AUTHOR = "Josh Whitley <josh.whitley@autoware.org>"
ROS_AUTHOR = "Jack O'Quin"
HOMEPAGE = "http://www.ros.org/wiki/velodyne"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "velodyne"
ROS_BPN = "velodyne"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    velodyne-driver \
    velodyne-laserscan \
    velodyne-msgs \
    velodyne-pointcloud \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/velodyne-release/archive/release/noetic/velodyne/1.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/velodyne"
SRC_URI = "git://github.com/ros-drivers-gbp/velodyne-release;${ROS_BRANCH};protocol=https"
SRCREV = "4e7fb9e8c08f8444fc6833c09e095a6832c17f85"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
