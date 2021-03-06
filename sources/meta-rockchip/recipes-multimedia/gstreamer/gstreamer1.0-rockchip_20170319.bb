# Copyright (C) 2016 - 2017 Randy Li <ayaka@soulik.info>
# Released under the GNU GENERAL PUBLIC LICENSE Version 2
# (see COPYING.GPLv2 for the terms)
include gstreamer1.0-rockchip.inc

# TAG = "release_20170319"
# TAG = "release_20171218"
# TAG = "release_20170607"
# SRC_URI = "git://github.com/rockchip-linux/gstreamer-rockchip.git;tag=${TAG};nobranch=1"

SRCREV = "master"

SRC_URI = "git://github.com/rockchip-linux/gstreamer-rockchip.git;branch=master"

# PV = "1.10.5++${TAG}"
PV = "1.10.5++"

S = "${WORKDIR}/git"
