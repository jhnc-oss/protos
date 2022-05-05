SUMMARY = "Dummy recipe (does nothing)"
DESCRIPTION = "Placeholder to avoid 'no .bb files' warnings – does nothing"
AUTHOR = "protos"
HOMEPAGE = "https://github.com/jhnc-oss/protos"
BUGTRACKER = "https://github.com/jhnc-oss/protos/issues"
SECTION = "none"
LICENSE = "MIT"

BBCLASSEXTEND = ""
CVE_PRODUCT = ""

do_show_info[doc] = "Dummy - does nothing"
python do_show_info() {
    bb.plain("-------------------------------------")
    bb.plain("  This recipe is a placeholder only  ")
    bb.plain("-------------------------------------")
}

addtask show_info before do_build
