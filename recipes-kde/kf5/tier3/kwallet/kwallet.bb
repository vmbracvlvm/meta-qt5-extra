SUMMARY = "Secure and unified container for user passwords"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += " \
    libgcrypt \
    gpgme \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kdbusaddons \
    kiconthemes \
    ki18n \
    knotifications \
    kservice \
    kwidgetsaddons \
    kwindowsystem \
    gettext-native \
    kdoctools-native \
    kauth-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "802c5985ccfff94cfa025d6a938e7476"
SRC_URI[sha256sum] = "3fd8d7a940adc974b6ee8a9af0d3f40eae9d279eb8884d99b9d08f25939e758d"

# fixes
# FAILED: bin/libkwalletbackend5.so.5.49.0 
# : && /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot-native/usr/bin/arm-angstrom-linux-gnueabi/arm-angstrom-linux-gnueabi-g++ -fPIC -march=armv7ve -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=/home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot  -O2 -pipe -g -feliminate-unused-debug-types -fdebug-prefix-map=/home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0=/usr/src/debug/kwallet/5.49.0-r0 -fdebug-prefix-map=/home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot= -fdebug-prefix-map=/home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot-native=  -fvisibility-inlines-hidden  -march=armv7ve -mthumb -mfpu=neon-vfpv4 -mfloat-abi=hard -mcpu=cortex-a7  --sysroot=/home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot -std=c++0x -fno-operator-names -fno-exceptions -Wall -Wextra -Wcast-align -Wchar-subscripts -Wformat-security -Wno-long-long -Wpointer-arith -Wundef -Wnon-virtual-dtor -Woverloaded-virtual -Werror=return-type -Wvla -Wdate-time -fdiagnostics-color=always -pedantic -Wsuggest-override -Wlogical-op -Wzero-as-null-pointer-constant  -Wl,--no-undefined -Wl,--fatal-warnings -Wl,--enable-new-dtags -Wl,-O1 -Wl,--hash-style=gnu -Wl,--as-needed -shared -Wl,-soname,libkwalletbackend5.so.5 -o bin/libkwalletbackend5.so.5.49.0 src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/blockcipher.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/blowfish.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/cbc.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/sha1.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/kwalletentry.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/kwalletbackend.cc.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/backendpersisthandler.cpp.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/kwalletbackend_debug.cpp.o src/runtime/kwalletd/backend/CMakeFiles/kwalletbackend5.dir/kwalletbackend5_autogen/mocs_compilation.cpp.o  /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libKF5WidgetsAddons.so.5.49.0 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libKF5Notifications.so.5.49.0 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libKF5I18n.so.5.49.0 -lgcrypt /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib//libgpgmepp.so /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libKF5CoreAddons.so.5.49.0 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libQt5DBus.so.5.11.1 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libQt5Widgets.so.5.11.1 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libQt5Gui.so.5.11.1 /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/usr/lib/libQt5Core.so.5.11.1 -lpthread -lgpgme -lassuan && :
# /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot-native/usr/bin/arm-angstrom-linux-gnueabi/../../libexec/arm-angstrom-linux-gnueabi/gcc/arm-angstrom-linux-gnueabi/8.2.0/ld: warning: discarding version information for __pthread_key_create@GLIBC_2.4, defined in unused shared library /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot/lib/libpthread.so.0 (linked with --as-needed)
# /home/superandy/tmp/oe-core-glibc/work/cortexa7t2hf-neon-vfpv4-angstrom-linux-gnueabi/kwallet/5.49.0-r0/recipe-sysroot-native/usr/bin/arm-angstrom-linux-gnueabi/../../libexec/arm-angstrom-linux-gnueabi/gcc/arm-angstrom-linux-gnueabi/8.2.0/ld: error: treating warnings as errors
#collect2: error: ld returned 1 exit status
LDFLAGS_append = " ${@bb.utils.contains('DISTRO_FEATURES', 'ld-is-gold', '-Wl,--no-fatal-warnings', '', d)}"

FILES_${PN} += "${datadir}"
