FROM openjdk:11-alpine
ENTRYPOINT ["/usr/bin/{{cookiecutter.service_name}}.sh"]

COPY {{cookiecutter.service_name}}.sh /usr/bin/{{cookiecutter.service_name}}.sh
COPY target/{{cookiecutter.service_name}}.jar /usr/share/{{cookiecutter.service_name}}/{{cookiecutter.service_name}}.jar