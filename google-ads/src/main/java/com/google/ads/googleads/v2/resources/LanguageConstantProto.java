// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/language_constant.proto

package com.google.ads.googleads.v2.resources;

public final class LanguageConstantProto {
  private LanguageConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_LanguageConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_LanguageConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v2/resources/lang" +
      "uage_constant.proto\022!google.ads.googlead" +
      "s.v2.resources\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\036goog" +
      "le/protobuf/wrappers.proto\032\034google/api/a" +
      "nnotations.proto\"\370\002\n\020LanguageConstant\022H\n" +
      "\rresource_name\030\001 \001(\tB1\340A\003\372A+\n)googleads." +
      "googleapis.com/LanguageConstant\022,\n\002id\030\002 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022/\n" +
      "\004code\030\003 \001(\0132\034.google.protobuf.StringValu" +
      "eB\003\340A\003\022/\n\004name\030\004 \001(\0132\034.google.protobuf.S" +
      "tringValueB\003\340A\003\0223\n\ntargetable\030\005 \001(\0132\032.go" +
      "ogle.protobuf.BoolValueB\003\340A\003:U\352AR\n)googl" +
      "eads.googleapis.com/LanguageConstant\022%la" +
      "nguageConstants/{language_constant}B\202\002\n%" +
      "com.google.ads.googleads.v2.resourcesB\025L" +
      "anguageConstantProtoP\001ZJgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v2/r" +
      "esources;resources\242\002\003GAA\252\002!Google.Ads.Go" +
      "ogleAds.V2.Resources\312\002!Google\\Ads\\Google" +
      "Ads\\V2\\Resources\352\002%Google::Ads::GoogleAd" +
      "s::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_LanguageConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_LanguageConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_LanguageConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Code", "Name", "Targetable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
