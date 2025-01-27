require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=439c6f54322baa097f0a398de5eb3d9a"

SRC_URI:append = " file://0001-remove_unknown_classifier.patch"
SRC_URI[sha256sum] = "8a60f3c4401f309c0eb6e754fb6c4e0442231203907cebf61ae74615b52cd38a"

PYPI_PACKAGE = "rpyc"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
    python3-plumbum \
"

BBCLASSEXTEND = "native nativesdk"
