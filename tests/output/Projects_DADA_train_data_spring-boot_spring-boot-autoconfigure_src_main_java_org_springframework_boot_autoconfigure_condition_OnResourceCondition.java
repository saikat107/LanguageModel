<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { MultiValueMap < java.lang.String , java.lang.Object > org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata . getAllAnnotationAttributes ( ConditionalOnResource .class . java.lang.String ( ) , true ) ; ResourceLoader org.springframework.boot.autoconfigure.condition.ResourceLoader = org.springframework.boot.autoconfigure.condition.ConditionContext . getResourceLoader ( ) == null ? this . org.springframework.boot.autoconfigure.condition.ResourceLoader : org.springframework.boot.autoconfigure.condition.ConditionContext . getResourceLoader ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; void ( java.util.List<java.lang.String> , org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> . get ( STRING ) ) ; Assert . isTrue ( ! java.util.List<java.lang.String> . boolean ( ) , STRING + STRING ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = org.springframework.boot.autoconfigure.condition.ConditionContext . getEnvironment ( ) . resolvePlaceholders ( java.lang.String ) ; if ( ! org.springframework.boot.autoconfigure.condition.ResourceLoader . getResource ( java.lang.String ) . exists ( ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } if ( ! java.util.List<java.lang.String> . boolean ( ) ) { return ConditionOutcome . noMatch ( ConditionMessage . forCondition ( ConditionalOnResource .class ) . didNotFind ( STRING , STRING ) . items ( Style . QUOTE , java.util.List<java.lang.String> ) ) ; } return ConditionOutcome . match ( ConditionMessage . forCondition ( ConditionalOnResource .class ) . found ( STRING , STRING ) . items ( java.util.List<java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ) { for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { for ( java.lang.Object java.lang.Object : ( java.lang.Object [] ) java.lang.Object ) { java.util.List<java.lang.String> . boolean ( ( java.lang.String ) java.lang.Object ) ; } } }  <METHOD_END>
