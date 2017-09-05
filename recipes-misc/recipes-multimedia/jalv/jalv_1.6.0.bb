SUMMARY = "Jalv is a simple but fully featured LV2 host for Jack"
HOMEPAGE = "http://drobilla.net/software/jalv"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb60cfffc455677d4f11cf7f36c12093"

inherit waf

DEPENDS += " \
    gtk+3 \
    gtkmm \
    qtbase \
    lilv \
    suil \
    jack \
"

SRC_URI = "http://download.drobilla.net/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "8390c3313c6a27f06919120de2de9348"
SRC_URI[sha256sum] = "914625972bb2e99552a0bb0ae3b5d27f70901b92fab1f6daf8fb31d1ffbf5cf4"

PACKAGES =+ "${PN}-gtk ${PN}-gtk3 ${PN}-gtkmm ${PN}-qt5"

FILES_${PN}-gtk   = "${bindir}/jalv.gtk"
FILES_${PN}-gtk3  = "${bindir}/jalv.gtk3"
FILES_${PN}-gtkmm = "${bindir}/jalv.gtkmm"
FILES_${PN}-qt5   = "${bindir}/jalv.qt5"
