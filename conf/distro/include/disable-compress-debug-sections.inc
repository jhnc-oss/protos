# Disable compress-debug-sections allowing older binutils
# (e.g. version 2.29) to consume libraries packaged by
# yocto builds (binutils 2.34).
TARGET_CFLAGS += "-Wa,--compress-debug-sections=none"
