<METHOD_START> public void ( JolokiaProperties org.springframework.boot.actuate.autoconfigure.JolokiaProperties ) { this . org.springframework.boot.actuate.autoconfigure.JolokiaProperties = org.springframework.boot.actuate.autoconfigure.JolokiaProperties ; }  <METHOD_END>
<METHOD_START> @ Bean @ ConditionalOnMissingBean public org.springframework.boot.actuate.autoconfigure.JolokiaMvcEndpoint org.springframework.boot.actuate.autoconfigure.JolokiaMvcEndpoint ( ) { JolokiaMvcEndpoint org.springframework.boot.actuate.autoconfigure.JolokiaMvcEndpoint = new JolokiaMvcEndpoint ( ) ; org.springframework.boot.actuate.autoconfigure.JolokiaMvcEndpoint . setInitParameters ( java.util.Properties ( ) ) ; return org.springframework.boot.actuate.autoconfigure.JolokiaMvcEndpoint ; }  <METHOD_END>
<METHOD_START> private java.util.Properties java.util.Properties ( ) { java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . void ( this . org.springframework.boot.actuate.autoconfigure.JolokiaProperties . getConfig ( ) ) ; return java.util.Properties ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.actuate.autoconfigure.ConditionOutcome org.springframework.boot.actuate.autoconfigure.ConditionOutcome ( ConditionContext org.springframework.boot.actuate.autoconfigure.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.actuate.autoconfigure.AnnotatedTypeMetadata ) { boolean boolean = boolean ( org.springframework.boot.actuate.autoconfigure.ConditionContext , STRING , true ) ; ConditionMessage . ConditionMessage ConditionMessage.Builder = ConditionMessage . forCondition ( STRING ) ; if ( boolean ( org.springframework.boot.actuate.autoconfigure.ConditionContext , STRING , boolean ) ) { return ConditionOutcome . match ( ConditionMessage.Builder . because ( STRING ) ) ; } return ConditionOutcome . noMatch ( ConditionMessage.Builder . because ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ConditionContext org.springframework.boot.actuate.autoconfigure.ConditionContext , java.lang.String java.lang.String , boolean boolean ) { RelaxedPropertyResolver org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver = new RelaxedPropertyResolver ( org.springframework.boot.actuate.autoconfigure.ConditionContext . getEnvironment ( ) , java.lang.String ) ; return org.springframework.boot.actuate.autoconfigure.RelaxedPropertyResolver . getProperty ( STRING , java.lang.Boolean .class , boolean ) ; }  <METHOD_END>
