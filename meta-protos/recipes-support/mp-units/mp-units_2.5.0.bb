SUMMARY = "The Domain-Correct Quantities and Units Library for C++"
DESCRIPTION = "The Domain-Correct Quantities and Units Library for C++ — full quantity kind safety, ISO 80000 compliant, C++29 standardization candidate."
HOMEPAGE = "https://github.com/mpusz/mp-units"
BUGTRACKER = "https://github.com/mpusz/mp-units/issues"
SECTION = "devel"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=bf70af7320ef4b73e22b21cb72e738fa"

DEPENDS = "\
    fmt \
    microsoft-gsl \
"

SRC_URI = "git://github.com/mpusz/mp-units.git;protocol=https;branch=master"
SRCREV = "27d2def9082ce00d7eb4f75695dbead4a748f23f"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "\
    -DMP_UNITS_API_CONTRACTS=MS-GSL \
    -DMP_UNITS_API_STD_FORMAT=OFF \
"

# Avoid building unit tests
OECMAKE_SOURCEPATH = "${S}/src"

# Header-only library
ALLOW_EMPTY:${PN} = "1"

BBCLASSEXTEND = "native nativesdk"

