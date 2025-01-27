require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=80f451d0892e64764fe22dbd241b5f02"
SRC_URI[sha256sum] = "961bd6fb24f31bba75333c234145fff88e6de0a90fc0f7e5e7c79deca69f6bb2"

PYPI_PACKAGE = "flit_scm"

inherit pypi python_flit_core

DEPENDS += "python3-setuptools-scm-native"

BBCLASSEXTEND = "native nativesdk"
