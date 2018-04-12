SUMMARY = "Shared imports and modules for projects using the qbs build system"
LICENSE = "BSD"
LIC_FILES_CHKSUM = " \
	file://LICENSE.BSD;md5=7dbe51b99809cbe518c3c785aa776a5f \
"

inherit liri

# avoid circular dependeny coming form liri.bbclass
DEPENDS_remove = "${BPN}"

PV = "1.2.0+git${SRCPV}"
SRCREV = "170f9bcc4169079fa7a5167744fa63bdba28462c"
S = "${WORKDIR}/git"

EXTRA_OECONF_QBS = "project.prefix:${prefix}"

ALLOW_EMPTY_${PN} = "1"

FILES_${PN}-dev = "${QBS_DATA_PATH}"
