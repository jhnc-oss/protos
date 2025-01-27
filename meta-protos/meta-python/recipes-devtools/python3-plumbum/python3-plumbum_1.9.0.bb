require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=f638c141bfa8dc89f890a3a4ee2cb888"

SRC_URI[sha256sum] = "e640062b72642c3873bd5bdc3effed75ba4d3c70ef6b6a7b907357a84d909219"

PYPI_PACKAGE = "plumbum"

DEPENDS += "python3-hatch-vcs-native"

inherit pypi python_hatchling

BBCLASSEXTEND = "native nativesdk"
