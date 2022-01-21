#!/bin/bash
#
# Set Spring Profile as running 'local'
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dspring.profiles.active=local"
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dlogging.level.root=INFO"
#
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dspring.cloud.discovery.enabled=false"
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dspring.cloud.consul.enabled=false"
#
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dmanagement.endpoint.mappings.enabled=true"
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dmanagement.endpoint.env.enabled=true"
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -Dmanagement.endpoints.web.exposure.include=info,health,mappings,env,beans"
#
RUNTIME_PROPERTIES="${RUNTIME_PROPERTIES} -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9001"
#
#
rm run.log
echo ${RUNTIME_PROPERTIES}
java ${RUNTIME_PROPERTIES} -jar ./target/Your-SB-Parent-POM-Usage.jar | tee -a run.log
