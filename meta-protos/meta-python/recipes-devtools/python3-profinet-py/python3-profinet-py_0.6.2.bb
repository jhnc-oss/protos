require ${PN}.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=4ffc483fa629a1ed1688853ec44078c9"

SRC_URI[sha256sum] = "20e44828861190f70944e5f89f6dfbe71d439a360f149fe9cce2537743cd8c1b"

PYPI_PACKAGE = "profinet_py"

inherit pypi python_setuptools_build_meta

do_configure:append() {
    sed -i \
        -E -e 's/^license = "([^"]*)"/license = { text = "\1" }/' \
        -e '/^license-files = /d' \
        ${S}/pyproject.toml
}

RDEPENDS:${PN} = "python3-construct (>=2.10)"

BBCLASSEXTEND = "native nativesdk"
