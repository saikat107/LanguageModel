<METHOD_START> void ( SqlConfig org.springframework.test.context.jdbc.SqlConfig , java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( org.springframework.test.context.jdbc.SqlConfig , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; AnnotationAttributes org.springframework.test.context.jdbc.AnnotationAttributes = AnnotatedElementUtils . findMergedAnnotationAttributes ( java.lang.Class<> , SqlConfig .class . java.lang.String ( ) , false , false ) ; if ( org.springframework.test.context.jdbc.AnnotationAttributes != null ) { for ( java.lang.String java.lang.String : org.springframework.test.context.jdbc.AnnotationAttributes . keySet ( ) ) { java.lang.Object java.lang.Object = AnnotationUtils . getValue ( org.springframework.test.context.jdbc.SqlConfig , java.lang.String ) ; if ( java.lang.Object != null ) { if ( ! java.lang.Object . boolean ( STRING ) && java.lang.Object != TransactionMode . DEFAULT && java.lang.Object != ErrorMode . DEFAULT ) { org.springframework.test.context.jdbc.AnnotationAttributes . put ( java.lang.String , java.lang.Object ) ; } } } } else { org.springframework.test.context.jdbc.AnnotationAttributes = AnnotationUtils . getAnnotationAttributes ( org.springframework.test.context.jdbc.SqlConfig , false , false ) ; } this . java.lang.String = org.springframework.test.context.jdbc.AnnotationAttributes . getString ( STRING ) ; this . java.lang.String = org.springframework.test.context.jdbc.AnnotationAttributes . getString ( STRING ) ; this . org.springframework.test.context.jdbc.TransactionMode = java.lang.Enum ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , TransactionMode . DEFAULT , TransactionMode . INFERRED ) ; this . java.lang.String = org.springframework.test.context.jdbc.AnnotationAttributes . getString ( STRING ) ; this . java.lang.String = java.lang.String ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , ScriptUtils . DEFAULT_STATEMENT_SEPARATOR ) ; this . java.lang.String = java.lang.String ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , ScriptUtils . DEFAULT_COMMENT_PREFIX ) ; this . java.lang.String = java.lang.String ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , ScriptUtils . DEFAULT_BLOCK_COMMENT_START_DELIMITER ) ; this . java.lang.String = java.lang.String ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , ScriptUtils . DEFAULT_BLOCK_COMMENT_END_DELIMITER ) ; this . org.springframework.test.context.jdbc.ErrorMode = java.lang.Enum ( org.springframework.test.context.jdbc.AnnotationAttributes , STRING , ErrorMode . DEFAULT , ErrorMode . FAIL_ON_ERROR ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> org.springframework.test.context.jdbc.TransactionMode org.springframework.test.context.jdbc.TransactionMode ( ) { return this . org.springframework.test.context.jdbc.TransactionMode ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> org.springframework.test.context.jdbc.ErrorMode org.springframework.test.context.jdbc.ErrorMode ( ) { return this . org.springframework.test.context.jdbc.ErrorMode ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return new ToStringCreator ( this ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . org.springframework.test.context.jdbc.TransactionMode ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . java.lang.String ) . append ( STRING , this . org.springframework.test.context.jdbc.ErrorMode ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> private static < E extends java.lang.Enum<?> < ? > > E E ( AnnotationAttributes org.springframework.test.context.jdbc.AnnotationAttributes , java.lang.String java.lang.String , E E , E E ) { E E = org.springframework.test.context.jdbc.AnnotationAttributes . getEnum ( java.lang.String ) ; if ( E == E ) { E = E ; } return E ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( AnnotationAttributes org.springframework.test.context.jdbc.AnnotationAttributes , java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.String java.lang.String = org.springframework.test.context.jdbc.AnnotationAttributes . getString ( java.lang.String ) ; if ( STRING . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String ; } return java.lang.String ; }  <METHOD_END>
