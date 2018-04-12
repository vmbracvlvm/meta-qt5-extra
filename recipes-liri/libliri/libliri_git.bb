SUMMARY = "Workspace, programs and plugins for Liri OS"
LICENSE = "LGPLv3 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.FDL;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"
SRCREV = "340f505694bdbd2ba74065b38b77c98d7d6225c1"
S = "${WORKDIR}/git"

DEPENDS += " \
    libqtxdg \
"

EXTRA_OECONF_QBS = " \
    modules.lirideployment.prefix:${prefix} \
    modules.lirideployment.dataDir:${datadir} \
    modules.lirideployment.libDir:${libdir} \
    modules.lirideployment.qmlDir:${OE_QMAKE_PATH_QML} \
    modules.lirideployment.pluginsDir:${OE_QMAKE_PATH_PLUGINS} \
    modules.lirideployment.qbsModulesDir:${datadir}/qbs \
"

#EXTRA_OECONF_QBS = "--log-level debug"

