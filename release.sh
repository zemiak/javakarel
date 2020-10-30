#!/bin/sh

// gpg --keyserver keys.gnupg.net --send-key XXX

GPG_TTY=$(tty)
export GPG_TTY

java -version 2>&1 | grep '1.8'
if [ $? -ne 0 ]
then
    echo "Use java 1.8"
    exit 10
fi

mvn -DperformRelease=true clean deploy || exit 20
