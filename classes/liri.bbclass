LIRI_GIT_BRANCH ?= "develop"

SRC_URI = "git://github.com/lirios/${@'${BPN}'.replace('liri-', '')}.git;protocol=git;branch=${LIRI_GIT_BRANCH}"

DEPENDS += " \
    qtbase \
    qtdeclarative \
    liri-qbs-shared \
"

inherit qbs pkgconfig


