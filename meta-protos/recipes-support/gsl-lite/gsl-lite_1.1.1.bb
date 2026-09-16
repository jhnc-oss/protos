SUMMARY = "ISO C++ Core Guidelines Library implementation for C++98, C++11 up"
DESCRIPTION = "gsl-lite is a portable, single-file, header-only library for defensive programming based on the C++ Core Guidelines Support Library specification."
HOMEPAGE = "https://github.com/gsl-lite/gsl-lite"
BUGTRACKER = "https://github.com/gsl-lite/gsl-lite/issues"
SECTION = "devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE;md5=50d8e8c330913e8c1efd822288399a9a"

SRC_URI = "git://github.com/gsl-lite/gsl-lite.git;protocol=https;branch=master"
SRCREV = "b19adc1ffe61b05d8c8858dc824edb7c15da68fc"

S = "${WORKDIR}/git"

inherit cmake

# Header-only library
ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"

