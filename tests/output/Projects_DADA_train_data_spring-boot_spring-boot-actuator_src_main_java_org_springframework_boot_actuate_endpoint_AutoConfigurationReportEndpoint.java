<METHOD_START> public void ( ) { super( STRING ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report ( ) { return new org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report ( this . org.springframework.boot.actuate.endpoint.ConditionEvaluationReport ) ; }  <METHOD_END>
<METHOD_START> public void ( ConditionEvaluationReport org.springframework.boot.actuate.endpoint.ConditionEvaluationReport ) { this . org.springframework.boot.actuate.endpoint.MultiValueMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> = new LinkedMultiValueMap <> ( ) ; this . java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> = new java.util.LinkedHashMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> <> ( ) ; this . java.util.List<java.lang.String> = org.springframework.boot.actuate.endpoint.ConditionEvaluationReport . getExclusions ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> < java.lang.String , ConditionAndOutcomes > java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> : org.springframework.boot.actuate.endpoint.ConditionEvaluationReport . getConditionAndOutcomesBySource ( ) . entrySet ( ) ) { if ( java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> . getValue ( ) . isFullMatch ( ) ) { void ( this . org.springframework.boot.actuate.endpoint.MultiValueMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> , java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> . getKey ( ) , java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> . getValue ( ) ) ; } else { void ( this . java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> , java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> . getKey ( ) , java.util.Map.Entry<java.lang.String,org.springframework.boot.actuate.endpoint.ConditionAndOutcomes> . getValue ( ) ) ; } } boolean boolean = org.springframework.boot.actuate.endpoint.ConditionEvaluationReport . getParent ( ) != null ; this . org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report = ( boolean ? new org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report ( org.springframework.boot.actuate.endpoint.ConditionEvaluationReport . getParent ( ) ) : null ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> < java.lang.String , org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> , java.lang.String java.lang.String , ConditionAndOutcomes org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) { java.lang.String java.lang.String = ClassUtils . getShortName ( java.lang.String ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> . org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions ( java.lang.String , new org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions ( org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( MultiValueMap < java.lang.String , org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition > org.springframework.boot.actuate.endpoint.MultiValueMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> , java.lang.String java.lang.String , ConditionAndOutcomes org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) { java.lang.String java.lang.String = ClassUtils . getShortName ( java.lang.String ) ; for ( ConditionAndOutcome org.springframework.boot.actuate.endpoint.ConditionAndOutcome : org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) { org.springframework.boot.actuate.endpoint.MultiValueMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> . add ( java.lang.String , new org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition ( org.springframework.boot.actuate.endpoint.ConditionAndOutcome ) ) ; } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition>> < java.lang.String , java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> < org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition > > java.util.Map<java.lang.String,java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition>> ( ) { return this . org.springframework.boot.actuate.endpoint.MultiValueMap<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> < java.lang.String , org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> ( ) { return this . java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndConditions> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report ( ) { return this . org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.Report ; }  <METHOD_END>
<METHOD_START> public void ( ConditionAndOutcomes org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) { for ( ConditionAndOutcome org.springframework.boot.actuate.endpoint.ConditionAndOutcome : org.springframework.boot.actuate.endpoint.ConditionAndOutcomes ) { java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> < org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition > java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> = org.springframework.boot.actuate.endpoint.ConditionAndOutcome . getOutcome ( ) . isMatch ( ) ? this . java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> : this . java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ; java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> . boolean ( new org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition ( org.springframework.boot.actuate.endpoint.ConditionAndOutcome ) ) ; } }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> < org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition > java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ( ) { return this . java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> < org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition > java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ( ) { return this . java.util.List<org.springframework.boot.actuate.endpoint.AutoConfigurationReportEndpoint.MessageAndCondition> ; }  <METHOD_END>
<METHOD_START> public void ( ConditionAndOutcome org.springframework.boot.actuate.endpoint.ConditionAndOutcome ) { Condition org.springframework.boot.actuate.endpoint.Condition = org.springframework.boot.actuate.endpoint.ConditionAndOutcome . getCondition ( ) ; ConditionOutcome org.springframework.boot.actuate.endpoint.ConditionOutcome = org.springframework.boot.actuate.endpoint.ConditionAndOutcome . getOutcome ( ) ; this . java.lang.String = ClassUtils . getShortName ( org.springframework.boot.actuate.endpoint.Condition . getClass ( ) ) ; if ( StringUtils . hasLength ( org.springframework.boot.actuate.endpoint.ConditionOutcome . getMessage ( ) ) ) { this . java.lang.String = org.springframework.boot.actuate.endpoint.ConditionOutcome . getMessage ( ) ; } else { this . java.lang.String = ( org.springframework.boot.actuate.endpoint.ConditionOutcome . isMatch ( ) ? STRING : STRING ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
