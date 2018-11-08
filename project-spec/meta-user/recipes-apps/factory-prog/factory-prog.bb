#
# This file is the factory-prog recipe.
#

SUMMARY = "Simple factory-prog application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://factory-prog \
	"

S = "${WORKDIR}"

do_install() {
	     install -d ${D}/${bindir}
	     install -m 0755 ${S}/factory-prog ${D}/${bindir}
}
