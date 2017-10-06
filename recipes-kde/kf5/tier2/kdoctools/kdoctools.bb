require ${BPN}.inc

DEPENDS += "${BPN}-native gettext-native karchive ki18n libxslt libxml2"

inherit cmake_lib

SRC_URI += " \
    file://0002-Make-our-cross-build-find-docbookl10nhelper.patch \
    file://0003-set-meinproc5-executable-so-that-it-can-be-found-for.patch \
    file://0004-Add-cmdline-param-to-help-find-xsl.patch \
"

do_configure_append() {
    # remove build host paths
    sed -i 's:${STAGING_DIR_NATIVE}::g' ${B}/config-kdoctools.h
    sed -i 's:${STAGING_DIR_TARGET}::g' ${B}/config-kdoctools.h
}

do_install_prepend() {
    # HACK: copy all-l10n.xml from native-sysroot to our builddir
    cp -f ${STAGING_DIR_NATIVE}${datadir}/kf5/kdoctools/customization/xsl/all-l10n.xml ${B}/src/customization/xsl/
}

# native binaries
CMAKE_ALIGN_SYSROOT[1] = "KF5DocTools, -s${_IMPORT_PREFIX}/bin, -S${STAGING_BINDIR_NATIVE}"

# make meinproc5 find kdoctools data
CMAKE_ALIGN_SYSROOT[2] = "KF5DocToolsMacros.cmake, -sCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE}, -SCOMMAND ${KDOCTOOLS_MEINPROC_EXECUTABLE} --srcdir ${STAGING_DATADIR}/kf5/kdoctools"

FILES_${PN}-dev += "${datadir}/kf5/kdoctools/customization"
