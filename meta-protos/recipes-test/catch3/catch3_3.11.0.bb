require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e4224ccaecb14d942c71d31bef20d78c"

SRC_URI = "git://github.com/catchorg/Catch2.git;protocol=https;nobranch=1"
SRCREV = "b3fb4b9feafcd8d91c5cb510a4775143fdbef02f"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DCMAKE_POSITION_INDEPENDENT_CODE=ON"

do_install:append() {
    rm -rf ${D}${datadir}/Catch2
}

ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"

