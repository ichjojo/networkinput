#
# This file is the read-loc-id recipe.
#

SUMMARY = "Simple read-loc-id application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://read-loc-id \
	"

S = "${WORKDIR}"

do_install() {
	     install -d ${D}/${bindir}
	     install -m 0755 ${S}/read-loc-id ${D}/${bindir}
}
