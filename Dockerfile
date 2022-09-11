FROM ravindrab5/gradle



ENV GRADLE_HOME=/opt/gradle \
    GRADLE_VERSION=7.4.2 \
    GRADLE_OPTS=-Xmx1024m

COPY . .

WORKDIR /usr/src/myapp

RUN chmod +x run_tests.sh


#CMD /bin/bash -c "source /root/.bashrc && /usr/src/myapp/run_tests.sh"
#CMD /bin/bash -c "source /root/.bashrc"
#SHELL ["/bin/bash", "-c"]

ENTRYPOINT ["/bin/bash", "-c","/usr/src/myapp/run_tests.sh"]