require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=4ffc483fa629a1ed1688853ec44078c9"

SRC_URI[sha256sum] = "7653374cc0c10e9fe8153e954e23b0c815e221ddbf5416cb6620fcdc8fe44c54"

PYPI_PACKAGE = "profinet_py"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "python3-construct (>=2.10)"

BBCLASSEXTEND = "native nativesdk"
