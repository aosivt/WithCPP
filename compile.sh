#!/bin/bash
javac -d bin/ src/main/java/aos/JNIHelloWorld.java
cd bin
javah aos.JNIHelloWorld
mv aos_JNIHelloWorld.h JNIHelloWorld.h
g++ -I/opt/jdk1.8.0_91/include -I/opt/jdk1.8.0_91/include/linux/ -fPIC JNIHelloWorld.cpp -shared -o helloworld.so