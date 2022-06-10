# protos

[![ci](https://github.com/jhnc-oss/protos/actions/workflows/ci.yml/badge.svg)](https://github.com/jhnc-oss/protos/actions/workflows/ci.yml)
![GitHub](https://img.shields.io/github/license/jhnc-oss/protos?color=yellow)

Repository of the Protos Yocto distribution.


- [**meta-protos**](https://github.com/jhnc-oss/meta-protos): Meta layer
- [**yocto-manifest**](https://github.com/jhnc-oss/yocto-manifests): Repository manifest


## TODOs

Drop legacy layer meta-python2 as soon as we can get rid of our dunfell-backport
of [Qt5.12.4](https://github.com/jhnc-oss/meta-qt5/tree/backport/5.12.4-dunfell-23.0.11)
and switch to officially supported version as provided by meta-qt5.
