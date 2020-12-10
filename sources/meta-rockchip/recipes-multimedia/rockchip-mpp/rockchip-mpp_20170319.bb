# Copyright (C) 2016 - 2017 Randy Li <ayaka@soulik.info>
# Released under the GNU GENERAL PUBLIC LICENSE Version 2
# (see COPYING.GPLv2 for the terms)
include rockchip-mpp.inc

# TAG = "release_20171218"
SRCREV = "develop"
SRC_URI = "git://github.com/rockchip-linux/mpp.git;branch=develop"
# SRC_URI = "git://github.com/rockchip-linux/mpp.git;tag=${TAG};nobranch=1"

MPP_VERSION = "1.3.1"

# PV = "${MPP_VERSION}+${TAG}"
PV = "${MPP_VERSION}+"

S = "${WORKDIR}/git"
