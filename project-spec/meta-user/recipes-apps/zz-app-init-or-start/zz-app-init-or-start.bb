#
# This file is the zz-app-init-or-start recipe.
#

SUMMARY = "Simple zz-app-init-or-start application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://zz-app-init-or-start \
	"

S = "${WORKDIR}"


FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
inherit update-rc.d
INITSCRIPT_NAME = "zz-app-init-or-start"
INITSCRIPT_PARAMS = "start 99 S ."
do_install() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${S}/zz-app-init-or-start ${D}${sysconfdir}/init.d/zz-app-init-or-start
}
FILES_${PN} += "${sysconfdir}/*"





