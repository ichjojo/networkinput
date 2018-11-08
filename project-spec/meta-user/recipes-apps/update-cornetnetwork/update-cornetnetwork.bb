#
# This file is the update-cornetnetwork recipe.
#

SUMMARY = "Simple update-cornetnetwork application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://update-cornetnetwork \
	"

S = "${WORKDIR}"

do_install() {
	     install -d ${D}/${bindir}
	     install -m 0755 ${S}/update-cornetnetwork ${D}/${bindir}
}
