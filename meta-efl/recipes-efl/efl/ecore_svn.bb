require ${BPN}.inc

SRCREV = "${EFL_SRCREV}"
PV = "1.6.99+svnr${SRCPV}"
PR = "${INC_PR}.0"
DEFAULT_PREFERENCE = "-1"

SRC_URI = "\
  ${E_SVN}/trunk;module=${SRCNAME};protocol=http;scmdata=keep \
  file://fix-ecore-fb-initialization.patch \
"
S = "${WORKDIR}/${SRCNAME}"
