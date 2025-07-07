require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/catchorg/Catch2.git;protocol=https;nobranch=1"
SRCREV = "2b60af89e23d28eefc081bc930831ee9d45ea58b"

S = "${WORKDIR}/git"

inherit cmake

do_install:append() {
    rm -rf ${D}${datadir}/Catch2
}

ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"

