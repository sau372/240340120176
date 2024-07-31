FROM openjdk:11
COPY . /usr/src/myapp 
WORKDIR /usr/src/myapp 
RUN javac PrimeNumber.java 
CMD ["java", "PrimeNumber"]