// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/ad_group_criterion.proto

package com.google.ads.googleads.v2.resources;

public final class AdGroupCriterionProto {
  private AdGroupCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_QualityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_PositionEstimates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v2/resources/ad_g" +
      "roup_criterion.proto\022!google.ads.googlea" +
      "ds.v2.resources\032-google/ads/googleads/v2" +
      "/common/criteria.proto\0325google/ads/googl" +
      "eads/v2/common/custom_parameter.proto\032Fg" +
      "oogle/ads/googleads/v2/enums/ad_group_cr" +
      "iterion_approval_status.proto\032=google/ad" +
      "s/googleads/v2/enums/ad_group_criterion_" +
      "status.proto\0322google/ads/googleads/v2/en" +
      "ums/bidding_source.proto\032Cgoogle/ads/goo" +
      "gleads/v2/enums/criterion_system_serving" +
      "_status.proto\0322google/ads/googleads/v2/e" +
      "nums/criterion_type.proto\0328google/ads/go" +
      "ogleads/v2/enums/quality_score_bucket.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\032\036google/protobuf" +
      "/wrappers.proto\032\034google/api/annotations." +
      "proto\"\254#\n\020AdGroupCriterion\022H\n\rresource_n" +
      "ame\030\001 \001(\tB1\340A\005\372A+\n)googleads.googleapis." +
      "com/AdGroupCriterion\0226\n\014criterion_id\030\032 \001" +
      "(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022`\n\006" +
      "status\030\003 \001(\0162P.google.ads.googleads.v2.e" +
      "nums.AdGroupCriterionStatusEnum.AdGroupC" +
      "riterionStatus\022Z\n\014quality_info\030\004 \001(\0132?.g" +
      "oogle.ads.googleads.v2.resources.AdGroup" +
      "Criterion.QualityInfoB\003\340A\003\022X\n\010ad_group\030\005" +
      " \001(\0132\034.google.protobuf.StringValueB(\340A\005\372" +
      "A\"\n googleads.googleapis.com/AdGroup\022Q\n\004" +
      "type\030\031 \001(\0162>.google.ads.googleads.v2.enu" +
      "ms.CriterionTypeEnum.CriterionTypeB\003\340A\003\022" +
      "1\n\010negative\030\037 \001(\0132\032.google.protobuf.Bool" +
      "ValueB\003\340A\005\022\200\001\n\025system_serving_status\0304 \001" +
      "(\0162\\.google.ads.googleads.v2.enums.Crite" +
      "rionSystemServingStatusEnum.CriterionSys" +
      "temServingStatusB\003\340A\003\022~\n\017approval_status" +
      "\0305 \001(\0162`.google.ads.googleads.v2.enums.A" +
      "dGroupCriterionApprovalStatusEnum.AdGrou" +
      "pCriterionApprovalStatusB\003\340A\003\0222\n\014bid_mod" +
      "ifier\030, \001(\0132\034.google.protobuf.DoubleValu" +
      "e\0223\n\016cpc_bid_micros\030\020 \001(\0132\033.google.proto" +
      "buf.Int64Value\0223\n\016cpm_bid_micros\030\021 \001(\0132\033" +
      ".google.protobuf.Int64Value\0223\n\016cpv_bid_m" +
      "icros\030\030 \001(\0132\033.google.protobuf.Int64Value" +
      "\022;\n\026percent_cpc_bid_micros\030! \001(\0132\033.googl" +
      "e.protobuf.Int64Value\022B\n\030effective_cpc_b" +
      "id_micros\030\022 \001(\0132\033.google.protobuf.Int64V" +
      "alueB\003\340A\003\022B\n\030effective_cpm_bid_micros\030\023 " +
      "\001(\0132\033.google.protobuf.Int64ValueB\003\340A\003\022B\n" +
      "\030effective_cpv_bid_micros\030\024 \001(\0132\033.google" +
      ".protobuf.Int64ValueB\003\340A\003\022J\n effective_p" +
      "ercent_cpc_bid_micros\030\" \001(\0132\033.google.pro" +
      "tobuf.Int64ValueB\003\340A\003\022e\n\030effective_cpc_b" +
      "id_source\030\025 \001(\0162>.google.ads.googleads.v" +
      "2.enums.BiddingSourceEnum.BiddingSourceB" +
      "\003\340A\003\022e\n\030effective_cpm_bid_source\030\026 \001(\0162>" +
      ".google.ads.googleads.v2.enums.BiddingSo" +
      "urceEnum.BiddingSourceB\003\340A\003\022e\n\030effective" +
      "_cpv_bid_source\030\027 \001(\0162>.google.ads.googl" +
      "eads.v2.enums.BiddingSourceEnum.BiddingS" +
      "ourceB\003\340A\003\022m\n effective_percent_cpc_bid_" +
      "source\030# \001(\0162>.google.ads.googleads.v2.e" +
      "nums.BiddingSourceEnum.BiddingSourceB\003\340A" +
      "\003\022f\n\022position_estimates\030\n \001(\0132E.google.a" +
      "ds.googleads.v2.resources.AdGroupCriteri" +
      "on.PositionEstimatesB\003\340A\003\0220\n\nfinal_urls\030" +
      "\013 \003(\0132\034.google.protobuf.StringValue\0227\n\021f" +
      "inal_mobile_urls\0303 \003(\0132\034.google.protobuf" +
      ".StringValue\0226\n\020final_url_suffix\0302 \001(\0132\034" +
      ".google.protobuf.StringValue\022;\n\025tracking" +
      "_url_template\030\r \001(\0132\034.google.protobuf.St" +
      "ringValue\022N\n\025url_custom_parameters\030\016 \003(\013" +
      "2/.google.ads.googleads.v2.common.Custom" +
      "Parameter\022C\n\007keyword\030\033 \001(\0132+.google.ads." +
      "googleads.v2.common.KeywordInfoB\003\340A\005H\000\022G" +
      "\n\tplacement\030\034 \001(\0132-.google.ads.googleads" +
      ".v2.common.PlacementInfoB\003\340A\005H\000\022Y\n\023mobil" +
      "e_app_category\030\035 \001(\01325.google.ads.google" +
      "ads.v2.common.MobileAppCategoryInfoB\003\340A\005" +
      "H\000\022X\n\022mobile_application\030\036 \001(\01325.google." +
      "ads.googleads.v2.common.MobileApplicatio" +
      "nInfoB\003\340A\005H\000\022N\n\rlisting_group\030  \001(\01320.go" +
      "ogle.ads.googleads.v2.common.ListingGrou" +
      "pInfoB\003\340A\005H\000\022F\n\tage_range\030$ \001(\0132,.google" +
      ".ads.googleads.v2.common.AgeRangeInfoB\003\340" +
      "A\005H\000\022A\n\006gender\030% \001(\0132*.google.ads.google" +
      "ads.v2.common.GenderInfoB\003\340A\005H\000\022L\n\014incom" +
      "e_range\030& \001(\0132/.google.ads.googleads.v2." +
      "common.IncomeRangeInfoB\003\340A\005H\000\022R\n\017parenta" +
      "l_status\030\' \001(\01322.google.ads.googleads.v2" +
      ".common.ParentalStatusInfoB\003\340A\005H\000\022F\n\tuse" +
      "r_list\030* \001(\0132,.google.ads.googleads.v2.c" +
      "ommon.UserListInfoB\003\340A\005H\000\022N\n\ryoutube_vid" +
      "eo\030( \001(\01320.google.ads.googleads.v2.commo" +
      "n.YouTubeVideoInfoB\003\340A\005H\000\022R\n\017youtube_cha" +
      "nnel\030) \001(\01322.google.ads.googleads.v2.com" +
      "mon.YouTubeChannelInfoB\003\340A\005H\000\022?\n\005topic\030+" +
      " \001(\0132).google.ads.googleads.v2.common.To" +
      "picInfoB\003\340A\005H\000\022N\n\ruser_interest\030- \001(\01320." +
      "google.ads.googleads.v2.common.UserInter" +
      "estInfoB\003\340A\005H\000\022C\n\007webpage\030. \001(\0132+.google" +
      ".ads.googleads.v2.common.WebpageInfoB\003\340A" +
      "\005H\000\022U\n\021app_payment_model\030/ \001(\01323.google." +
      "ads.googleads.v2.common.AppPaymentModelI" +
      "nfoB\003\340A\005H\000\022R\n\017custom_affinity\0300 \001(\01322.go" +
      "ogle.ads.googleads.v2.common.CustomAffin" +
      "ityInfoB\003\340A\005H\000\022N\n\rcustom_intent\0301 \001(\01320." +
      "google.ads.googleads.v2.common.CustomInt" +
      "entInfoB\003\340A\005H\000\032\223\003\n\013QualityInfo\0227\n\rqualit" +
      "y_score\030\001 \001(\0132\033.google.protobuf.Int32Val" +
      "ueB\003\340A\003\022m\n\026creative_quality_score\030\002 \001(\0162" +
      "H.google.ads.googleads.v2.enums.QualityS" +
      "coreBucketEnum.QualityScoreBucketB\003\340A\003\022o" +
      "\n\030post_click_quality_score\030\003 \001(\0162H.googl" +
      "e.ads.googleads.v2.enums.QualityScoreBuc" +
      "ketEnum.QualityScoreBucketB\003\340A\003\022k\n\024searc" +
      "h_predicted_ctr\030\004 \001(\0162H.google.ads.googl" +
      "eads.v2.enums.QualityScoreBucketEnum.Qua" +
      "lityScoreBucketB\003\340A\003\032\205\003\n\021PositionEstimat" +
      "es\022?\n\025first_page_cpc_micros\030\001 \001(\0132\033.goog" +
      "le.protobuf.Int64ValueB\003\340A\003\022C\n\031first_pos" +
      "ition_cpc_micros\030\002 \001(\0132\033.google.protobuf" +
      ".Int64ValueB\003\340A\003\022@\n\026top_of_page_cpc_micr" +
      "os\030\003 \001(\0132\033.google.protobuf.Int64ValueB\003\340" +
      "A\003\022T\n*estimated_add_clicks_at_first_posi" +
      "tion_cpc\030\004 \001(\0132\033.google.protobuf.Int64Va" +
      "lueB\003\340A\003\022R\n(estimated_add_cost_at_first_" +
      "position_cpc\030\005 \001(\0132\033.google.protobuf.Int" +
      "64ValueB\003\340A\003:i\352Af\n)googleads.googleapis." +
      "com/AdGroupCriterion\0229customers/{custome" +
      "r}/adGroupCriteria/{ad_group_criterion}B" +
      "\013\n\tcriterionB\202\002\n%com.google.ads.googlead" +
      "s.v2.resourcesB\025AdGroupCriterionProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v2/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V2.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V2\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V2::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdGroupCriterionApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.AdGroupCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CriterionSystemServingStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "CriterionId", "Status", "QualityInfo", "AdGroup", "Type", "Negative", "SystemServingStatus", "ApprovalStatus", "BidModifier", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "PercentCpcBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectivePercentCpcBidMicros", "EffectiveCpcBidSource", "EffectiveCpmBidSource", "EffectiveCpvBidSource", "EffectivePercentCpcBidSource", "PositionEstimates", "FinalUrls", "FinalMobileUrls", "FinalUrlSuffix", "TrackingUrlTemplate", "UrlCustomParameters", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "ListingGroup", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Topic", "UserInterest", "Webpage", "AppPaymentModel", "CustomAffinity", "CustomIntent", "Criterion", });
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_QualityInfo_descriptor =
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_QualityInfo_descriptor,
        new java.lang.String[] { "QualityScore", "CreativeQualityScore", "PostClickQualityScore", "SearchPredictedCtr", });
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_PositionEstimates_descriptor =
      internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_AdGroupCriterion_PositionEstimates_descriptor,
        new java.lang.String[] { "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", "EstimatedAddClicksAtFirstPositionCpc", "EstimatedAddCostAtFirstPositionCpc", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdGroupCriterionApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.AdGroupCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CriterionSystemServingStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v2.enums.QualityScoreBucketProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
