// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/final_app_url.proto

package com.google.ads.googleads.v5.common;

public final class FinalAppUrlProto {
  private FinalAppUrlProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_FinalAppUrl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_FinalAppUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v5/common/final_a" +
      "pp_url.proto\022\036google.ads.googleads.v5.co" +
      "mmon\032Agoogle/ads/googleads/v5/enums/app_" +
      "url_operating_system_type.proto\032\034google/" +
      "api/annotations.proto\"\220\001\n\013FinalAppUrl\022g\n" +
      "\007os_type\030\001 \001(\0162V.google.ads.googleads.v5" +
      ".enums.AppUrlOperatingSystemTypeEnum.App" +
      "UrlOperatingSystemType\022\020\n\003url\030\003 \001(\tH\000\210\001\001" +
      "B\006\n\004_urlB\353\001\n\"com.google.ads.googleads.v5" +
      ".commonB\020FinalAppUrlProtoP\001ZDgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v5/common;common\242\002\003GAA\252\002\036Google.Ads.Goo" +
      "gleAds.V5.Common\312\002\036Google\\Ads\\GoogleAds\\" +
      "V5\\Common\352\002\"Google::Ads::GoogleAds::V5::" +
      "Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.AppUrlOperatingSystemTypeProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_FinalAppUrl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_FinalAppUrl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_FinalAppUrl_descriptor,
        new java.lang.String[] { "OsType", "Url", "Url", });
    com.google.ads.googleads.v5.enums.AppUrlOperatingSystemTypeProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
