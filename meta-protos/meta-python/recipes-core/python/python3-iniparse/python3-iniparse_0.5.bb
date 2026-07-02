SUMMARY = "Accessing and Modifying INI files"
DESCRIPTION = "Python iniparse module with patches from Fedora project"
HOMEPAGE = "https://github.com/candlepin/python-iniparse"
BUGTRACKER = "https://github.com/candlepin/python-iniparse/issues"
SECTION = "development"
LICENSE = "MIT & PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE-PSF;md5=1c78a5bb3584b353496d5f6f34edb4b2 \
                    file://LICENSE;md5=52f28065af11d69382693b45b5a8eb54"

SRC_URI[sha256sum] = "932e5239d526e7acb504017bb707be67019ac428a6932368e6851691093aa842"

inherit pypi setuptools3

DEPENDS += "python3-six"
RDEPENDS:${PN} += "python3-core python3-six"

BBCLASSEXTEND = "native nativesdk"
