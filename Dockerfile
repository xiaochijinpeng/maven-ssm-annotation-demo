FROM tomcat:9.0.12-jre8
MAINTAINER Cutie Chi <chi@cutie.ooo>
RUN rm -rf /usr/local/tomcat/webapps/ROOT
ADD ./target/maven-ssm-annotation-demo.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]
