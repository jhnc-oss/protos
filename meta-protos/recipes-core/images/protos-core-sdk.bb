SUMMARY = "PROTOS core SDK"
DESCRIPTION = "PROTOS core SDK suitable for development work."
HOMEPAGE = "https://github.com/jhnc-oss/protos"
LICENSE = "MIT"

CVE_PRODUCT = ""

inherit populate_sdk

SDKIMAGE_FEATURES:append = " dev-pkgs tools-sdk staticdev-pkgs"
SDKIMAGE_FEATURES:remove = "dbg-pkgs src-pkgs"

TOOLCHAIN_TARGET_TASK:append = "\
    extra-cmake-modules \
    fontconfig \
    libx11 \
    libxft \
    libxi \
    libxmu \
    libxt \
    meson \
    wayland \
"

TOOLCHAIN_HOST_TASK:append = "\
    nativesdk-clang \
    nativesdk-cmake \
    nativesdk-fontconfig \
    nativesdk-libx11 \
    nativesdk-libxft \
    nativesdk-make \
    nativesdk-wayland \
    nativesdk-wayland-dev \
"

GCC_VERSION = "gcc133"

TOOLCHAIN_OUTPUTNAME = "${DISTRO}-${SDKMACHINE}-toolchain-${GCC_VERSION}-${MACHINE}-${DISTRO_VERSION}"
TOOLCHAINEXT_OUTPUTNAME = "${DISTRO}-${SDKMACHINE}-toolchain-ext-${GCC_VERSION}-${MACHINE}-${DISTRO_VERSION}"

