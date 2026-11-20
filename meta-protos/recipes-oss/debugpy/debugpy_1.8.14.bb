SUMMARY = "A debugger for Python 3"
DESCRIPTION = "An implementation of the Debug Adapter Protocol for Python 3"
HOMEPAGE = "https://github.com/microsoft/debugpy/"
BUGTRACKER = "https://github.com/microsoft/debugpy/issues"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7b6b095fe2a2e2b66cb08d295b605789"

SRC_URI[sha256sum] = "7cd287184318416850aa8b60ac90105837bb1e59531898c07569d197d2ed5322"

PYPI_PACKAGE = "debugpy"
PYPI_PACKAGE_EXT = "tar.gz"

inherit pypi setuptools3

PYDEVD_ATTACH_DIR = "${PYTHON_SITEPACKAGES_DIR}/debugpy/_vendored/pydevd/pydevd_attach_to_process"

def get_so_suffix(d):
    arch = d.getVar('TARGET_ARCH')
    if arch == 'x86_64':
        return 'amd64'
    if arch == 'aarch64':
        return 'aarch64'
    if arch in ('i386', 'i586', 'i686'):
        return 'x86'
    bb.fatal("debugpy: unsupported TARGET_ARCH '%s'" % arch)

do_compile:append() {
    cd ${S}/src/${PN}/_vendored/pydevd/pydevd_attach_to_process/linux_and_mac
    ${CXX} ${LDFLAGS} -std=c++11 -shared -fPIC -nostartfiles \
        attach.cpp -o attach_linux_${@get_so_suffix(d)}.so
}

do_install:append() {
    install -d ${D}${PYDEVD_ATTACH_DIR}
    install -m 0755 \
        ${S}/src/${PN}/_vendored/pydevd/pydevd_attach_to_process/linux_and_mac/attach_linux_${@get_so_suffix(d)}.so \
        ${D}${PYDEVD_ATTACH_DIR}/
}

RDEPENDS:${PN} += "glibc"

BBCLASSEXTEND = "native nativesdk"

COMPATIBLE_MACHINE = "^(genericx86-64|mc-x86-64|wsl-x86-64|hw-aarch64)$"
COMPATIBLE_MACHINE:class-native = "(.*)"
COMPATIBLE_MACHINE:class-nativesdk = "(.*)"
