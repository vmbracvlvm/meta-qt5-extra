SUMMARY = "An Audio/MIDI multi-track sequencer"
HOMEPAGE = "http://qtractor.sourceforge.net/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
    qttools-native \
    qtbase \
    qtx11extras \
    jack \
    lilv \
    libmad \
    rubberband \
    dssi \
    suil \
"

inherit qmake5_base autotools-brokensep pkgconfig gtk-icon-cache

SRC_URI = " \
    git://github.com/schnitzeltony/qtractor.git \
    file://0001-find-native-qt-build-tools-by-configure-options-auto.patch \
    file://0002-do-nor-try-run-for-float-sse-detection.patch \
    file://0003-do-nor-try-run-for-suil-libs-detection.patch \
"
SRCREV = "85968e9481f457d9345ab64676f46a18a3c26047"
PV = "0.8.4+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECONF = " \
    --with-qmake=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/qmake \
    --with-moc=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/moc \
    --with-uic=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/uic \
    --with-lupdate=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lupdate \
    --with-lrelease=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
"

FILES_${PN} += " \
    ${datadir}/mime \
    ${datadir}/metainfo \
"
