// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/user_data_service.proto

package com.google.ads.googleads.v3.services;

public interface UserDataOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.UserDataOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of user data to be appended to the user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserData create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * The list of user data to be appended to the user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserData create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v3.common.UserData getCreate();
  /**
   * <pre>
   * The list of user data to be appended to the user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.common.UserData create = 1;</code>
   */
  com.google.ads.googleads.v3.common.UserDataOrBuilder getCreateOrBuilder();

  public com.google.ads.googleads.v3.services.UserDataOperation.OperationCase getOperationCase();
}
