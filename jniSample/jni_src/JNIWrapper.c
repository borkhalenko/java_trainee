#include "JNIWrapper.h"
#include <stdio.h>

JNIEXPORT jint JNICALL Java_JNIWrapper_sayHello
  (JNIEnv * env, jclass cl){
    printf("Hello world from native C code!");
    return 1;
  }