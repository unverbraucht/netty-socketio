module netty.socketio {
  exports com.corundumstudio.socketio;
  exports com.corundumstudio.socketio.ack;
  exports com.corundumstudio.socketio.annotation;
  exports com.corundumstudio.socketio.handler;
  exports com.corundumstudio.socketio.listener;
  exports com.corundumstudio.socketio.namespace;
  exports com.corundumstudio.socketio.misc;
  exports com.corundumstudio.socketio.messages;
  exports com.corundumstudio.socketio.protocol;

  requires transitive spring.beans;
  requires transitive spring.core;

  requires com.fasterxml.jackson.core;
  requires com.fasterxml.jackson.annotation;
  requires com.fasterxml.jackson.databind;

  requires transitive com.hazelcast.core;
  requires transitive com.hazelcast.client;

  requires transitive redisson;

  requires static io.netty.transport.classes.epoll;
  requires io.netty.codec;
  requires io.netty.transport;
  requires io.netty.buffer;
  requires io.netty.common;
  requires io.netty.handler;
  requires io.netty.codec.http;
  requires org.slf4j;
}