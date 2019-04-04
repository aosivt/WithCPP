#include <iostream>
#include "JNIHelloWorld.h"

JNIEXPORT void JNICALL Java_aos_JNIHelloWorld_printHelloWorld
(JNIEnv *, jobject){
    std::cout << "Hello world";
}

JNIEXPORT jint JNICALL Java_aos_JNIHelloWorld_multiply
(JNIEnv *, jobject,jint a, jint b){
    return a*b;
}