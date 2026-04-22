require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/catchorg/Catch2.git;protocol=https;nobranch=1"
SRCREV = "b670de4fe12ac7c5e858b7de3a14fb4bd18c760e"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCMAKE_POSITION_INDEPENDENT_CODE=ON"

do_install:append() {
    rm -rf ${D}${datadir}/Catch2
}

ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"

