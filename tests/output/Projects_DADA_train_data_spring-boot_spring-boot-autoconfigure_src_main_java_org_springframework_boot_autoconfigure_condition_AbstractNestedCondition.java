<METHOD_START> void ( ConfigurationPhase org.springframework.boot.autoconfigure.condition.ConfigurationPhase ) { Assert . notNull ( org.springframework.boot.autoconfigure.condition.ConfigurationPhase , STRING ) ; this . org.springframework.boot.autoconfigure.condition.ConfigurationPhase = org.springframework.boot.autoconfigure.condition.ConfigurationPhase ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConfigurationPhase org.springframework.boot.autoconfigure.condition.ConfigurationPhase ( ) { return this . org.springframework.boot.autoconfigure.condition.ConfigurationPhase ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { java.lang.String java.lang.String = java.lang.Class<? extends org.springframework.boot.autoconfigure.condition.AbstractNestedCondition> ( ) . java.lang.String ( ) ; org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions = new org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions ( org.springframework.boot.autoconfigure.condition.ConditionContext , java.lang.String ) ; org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes = new org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes ( org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions ) ; return org.springframework.boot.autoconfigure.condition.ConditionOutcome ( org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberMatchOutcomes );  <METHOD_END>
<METHOD_START> public void ( org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions ) { this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = java.util.Collections . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberConditions . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( ) ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionOutcome> <> ( ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionOutcome> <> ( ) ; for ( ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome : this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) { ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . isMatch ( ) ? java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> : java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) . add ( org.springframework.boot.autoconfigure.condition.ConditionOutcome ) ; } this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = java.util.Collections . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) ; this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = java.util.Collections . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( ) { return this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( ) { return this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( ) { return this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ; }  <METHOD_END>
<METHOD_START> void ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , java.lang.String java.lang.String ) { this . org.springframework.boot.autoconfigure.condition.ConditionContext = org.springframework.boot.autoconfigure.condition.ConditionContext ; this . org.springframework.boot.autoconfigure.condition.MetadataReaderFactory = new SimpleMetadataReaderFactory ( org.springframework.boot.autoconfigure.condition.ConditionContext . getResourceLoader ( ) ) ; java.lang.String [] java.lang.String[] = org.springframework.boot.autoconfigure.condition.AnnotationMetadata ( java.lang.String ) . getMemberClassNames ( ) ; this . java.util.Map<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> = java.util.Map<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> < AnnotationMetadata , java.util.List<org.springframework.boot.autoconfigure.condition.Condition> < Condition > > java.util.Map<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> ( java.lang.String [] java.lang.String[] ) { MultiValueMap < AnnotationMetadata , Condition > org.springframework.boot.autoconfigure.condition.MultiValueMap<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,org.springframework.boot.autoconfigure.condition.Condition> = new LinkedMultiValueMap <> ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { AnnotationMetadata org.springframework.boot.autoconfigure.condition.AnnotationMetadata = org.springframework.boot.autoconfigure.condition.AnnotationMetadata ( java.lang.String ) ; for ( java.lang.String [] java.lang.String[] : java.util.List<java.lang.String[]> ( org.springframework.boot.autoconfigure.condition.AnnotationMetadata ) ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { Condition org.springframework.boot.autoconfigure.condition.Condition = org.springframework.boot.autoconfigure.condition.Condition ( java.lang.String ) ; org.springframework.boot.autoconfigure.condition.MultiValueMap<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,org.springframework.boot.autoconfigure.condition.Condition> . add ( org.springframework.boot.autoconfigure.condition.AnnotationMetadata , org.springframework.boot.autoconfigure.condition.Condition ) ; } } } return java.util.Collections . java.util.Map ( org.springframework.boot.autoconfigure.condition.MultiValueMap<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,org.springframework.boot.autoconfigure.condition.Condition> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.condition.AnnotationMetadata org.springframework.boot.autoconfigure.condition.AnnotationMetadata ( java.lang.String java.lang.String ) { try { return this . org.springframework.boot.autoconfigure.condition.MetadataReaderFactory . getMetadataReader ( java.lang.String ) . getAnnotationMetadata ( ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.List<java.lang.String[]> < java.lang.String [] > java.util.List<java.lang.String[]> ( AnnotatedTypeMetadata org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata ) { MultiValueMap < java.lang.String , java.lang.Object > org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> = org.springframework.boot.autoconfigure.condition.AnnotatedTypeMetadata . getAllAnnotationAttributes ( Conditional .class . java.lang.String ( ) , true ) ; java.lang.Object java.lang.Object = ( org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> != null ? org.springframework.boot.autoconfigure.condition.MultiValueMap<java.lang.String,java.lang.Object> . get ( STRING ) : null ) ; return ( java.util.List<java.lang.String[]> < java.lang.String [] > ) ( java.lang.Object != null ? java.lang.Object : java.util.Collections . java.util.List<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.condition.Condition org.springframework.boot.autoconfigure.condition.Condition ( java.lang.String java.lang.String ) { java.lang.Class<?> < ? > java.lang.Class<?> = ClassUtils . resolveClassName ( java.lang.String , this . org.springframework.boot.autoconfigure.condition.ConditionContext . getClassLoader ( ) ) ; return ( Condition ) BeanUtils . instantiateClass ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( ) { java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionOutcome> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> < AnnotationMetadata , java.util.List<org.springframework.boot.autoconfigure.condition.Condition> < Condition > > java.util.Map.Entry<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> : this . java.util.Map<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> . entrySet ( ) ) { AnnotationMetadata org.springframework.boot.autoconfigure.condition.AnnotationMetadata = java.util.Map.Entry<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> . getKey ( ) ; java.util.List<org.springframework.boot.autoconfigure.condition.Condition> < Condition > java.util.List<org.springframework.boot.autoconfigure.condition.Condition> = java.util.Map.Entry<org.springframework.boot.autoconfigure.condition.AnnotationMetadata,java.util.List<org.springframework.boot.autoconfigure.condition.Condition>> . getValue ( ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> . add ( new org.springframework.boot.autoconfigure.condition.AbstractNestedCondition.MemberOutcomes ( this . org.springframework.boot.autoconfigure.condition.ConditionContext , org.springframework.boot.autoconfigure.condition.AnnotationMetadata , java.util.List<org.springframework.boot.autoconfigure.condition.Condition> ) . org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ) ) ; } return java.util.Collections . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) ; }  <METHOD_END>
<METHOD_START> void ( ConditionContext org.springframework.boot.autoconfigure.condition.ConditionContext , AnnotationMetadata org.springframework.boot.autoconfigure.condition.AnnotationMetadata , java.util.List<org.springframework.boot.autoconfigure.condition.Condition> < Condition > java.util.List<org.springframework.boot.autoconfigure.condition.Condition> ) { this . org.springframework.boot.autoconfigure.condition.ConditionContext = org.springframework.boot.autoconfigure.condition.ConditionContext ; this . org.springframework.boot.autoconfigure.condition.AnnotationMetadata = org.springframework.boot.autoconfigure.condition.AnnotationMetadata ; this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList <> ( java.util.List<org.springframework.boot.autoconfigure.condition.Condition> . size ( ) ) ; for ( Condition org.springframework.boot.autoconfigure.condition.Condition : java.util.List<org.springframework.boot.autoconfigure.condition.Condition> ) { this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> . add ( org.springframework.boot.autoconfigure.condition.ConditionOutcome ( org.springframework.boot.autoconfigure.condition.AnnotationMetadata , org.springframework.boot.autoconfigure.condition.Condition ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( AnnotationMetadata org.springframework.boot.autoconfigure.condition.AnnotationMetadata , Condition org.springframework.boot.autoconfigure.condition.Condition ) { if ( org.springframework.boot.autoconfigure.condition.Condition instanceof SpringBootCondition ) { return ( ( SpringBootCondition ) org.springframework.boot.autoconfigure.condition.Condition ) . getMatchOutcome ( this . org.springframework.boot.autoconfigure.condition.ConditionContext , org.springframework.boot.autoconfigure.condition.AnnotationMetadata ) ; } return new ConditionOutcome ( org.springframework.boot.autoconfigure.condition.Condition . matches ( this . org.springframework.boot.autoconfigure.condition.ConditionContext , org.springframework.boot.autoconfigure.condition.AnnotationMetadata ) , ConditionMessage . empty ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.autoconfigure.condition.ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome ( ) { ConditionMessage . ConditionMessage ConditionMessage.Builder = ConditionMessage . forCondition ( STRING + ClassUtils . getShortName ( this . org.springframework.boot.autoconfigure.condition.AnnotationMetadata . getClassName ( ) ) ) ; if ( this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> . size ( ) == NUMBER ) { ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome = this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> . get ( NUMBER ) ; return new ConditionOutcome ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . isMatch ( ) , ConditionMessage.Builder . because ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . getMessage ( ) ) ) ; } java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionOutcome> <> ( ) ; java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> < ConditionOutcome > java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> = new java.util.ArrayList<org.springframework.boot.autoconfigure.condition.ConditionOutcome> <> ( ) ; for ( ConditionOutcome org.springframework.boot.autoconfigure.condition.ConditionOutcome : this . java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) { ( org.springframework.boot.autoconfigure.condition.ConditionOutcome . isMatch ( ) ? java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> : java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) . add ( org.springframework.boot.autoconfigure.condition.ConditionOutcome ) ; } if ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> . isEmpty ( ) ) { return ConditionOutcome . match ( ConditionMessage.Builder . found ( STRING ) . items ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) ) ; } return ConditionOutcome . noMatch ( ConditionMessage.Builder . found ( STRING ) . items ( java.util.List<org.springframework.boot.autoconfigure.condition.ConditionOutcome> ) ) ; }  <METHOD_END>
