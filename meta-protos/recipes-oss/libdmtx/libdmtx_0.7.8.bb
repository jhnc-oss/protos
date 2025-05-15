require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=b58872aaf3a9d51c1f002b9d7940f4f1"

SRC_URI = "git://github.com/dmtx/libdmtx.git;protocol=https;branch=master"
SRCREV = "500d7af6106713610a0f8b2d96aefa81912b96bc"

S = "${WORKDIR}/git"

inherit autotools

BBCLASSEXTEND = "native nativesdk"
