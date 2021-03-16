#!/bin/sh
exec /usr/bin/java $JVM_DEFAULT_ARGS $JVM_ARGS -jar /usr/share/{{cookiecutter.service_name}}/{{cookiecutter.service_name}}.jar "$@"