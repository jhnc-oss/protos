require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=202b39559c1c79fe4715ce81e9e0ac02"

SRC_URI[sha256sum] = "4d2472f9684731e58cc9c56c463be63baa1447d674e0d66aeb5627b22f512c29"

PYPI_PACKAGE = "construct"

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND += "nativesdk"
