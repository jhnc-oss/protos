require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=7c629c42ff5179bf9719384b3d3b090a"

SRC_URI[sha256sum] = "7653374cc0c10e9fe8153e954e23b0c815e221ddbf5416cb6620fcdc8fe44c54"

PYPI_PACKAGE = "profinet_py"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "python3-construct (>=2.10)"

BBCLASSEXTEND = "native nativesdk"
