#
# This file is the led-heartbeat recipe.
#

SUMMARY = "Simple led-heartbeat application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://led-heartbeat \
	"

S = "${WORKDIR}"

do_install() {
	     install -d ${D}/${bindir}
	     install -m 0755 ${S}/led-heartbeat ${D}/${bindir}
}
