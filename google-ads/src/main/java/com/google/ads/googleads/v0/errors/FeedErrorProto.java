// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/feed_error.proto

package com.google.ads.googleads.v0.errors;

public final class FeedErrorProto {
  private FeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_FeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_FeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/google/ads/googleads/v0/errors/feed_er" +
      "ror.proto\022\036google.ads.googleads.v0.error" +
      "s\"\336\005\n\rFeedErrorEnum\"\314\005\n\tFeedError\022\017\n\013UNS" +
      "PECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\036\n\032ATTRIBUTE_NAM" +
      "ES_NOT_UNIQUE\020\002\022/\n+ATTRIBUTES_DO_NOT_MAT" +
      "CH_EXISTING_ATTRIBUTES\020\003\022.\n*CANNOT_SPECI" +
      "FY_USER_ORIGIN_FOR_SYSTEM_FEED\020\004\0224\n0CANN" +
      "OT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTEM_" +
      "FEED\020\005\0222\n.CANNOT_SPECIFY_FEED_ATTRIBUTES" +
      "_FOR_SYSTEM_FEED\020\006\0224\n0CANNOT_UPDATE_FEED" +
      "_ATTRIBUTES_WITH_ORIGIN_GOOGLE\020\007\022\020\n\014FEED" +
      "_REMOVED\020\010\022\030\n\024INVALID_ORIGIN_VALUE\020\t\022\033\n\027" +
      "FEED_ORIGIN_IS_NOT_USER\020\n\022 \n\034INVALID_AUT" +
      "H_TOKEN_FOR_EMAIL\020\013\022\021\n\rINVALID_EMAIL\020\014\022\027" +
      "\n\023DUPLICATE_FEED_NAME\020\r\022\025\n\021INVALID_FEED_" +
      "NAME\020\016\022\026\n\022MISSING_OAUTH_INFO\020\017\022.\n*NEW_AT" +
      "TRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY\020\020\022\027" +
      "\n\023TOO_MANY_ATTRIBUTES\020\021\022\034\n\030INVALID_BUSIN" +
      "ESS_ACCOUNT\020\022\0223\n/BUSINESS_ACCOUNT_CANNOT" +
      "_ACCESS_LOCATION_ACCOUNT\020\023\022\036\n\032INVALID_AF" +
      "FILIATE_CHAIN_ID\020\024B\304\001\n\"com.google.ads.go" +
      "ogleads.v0.errorsB\016FeedErrorProtoP\001ZDgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v0/errors;errors\242\002\003GAA\252\002\036Google" +
      ".Ads.GoogleAds.V0.Errors\312\002\036Google\\Ads\\Go" +
      "ogleAds\\V0\\Errorsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_FeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_FeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_FeedErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}