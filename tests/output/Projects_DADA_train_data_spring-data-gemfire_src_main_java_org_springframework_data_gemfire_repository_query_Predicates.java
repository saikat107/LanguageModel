<METHOD_START> private void ( Predicate org.springframework.data.gemfire.repository.query.Predicate ) { this . org.springframework.data.gemfire.repository.query.Predicate = org.springframework.data.gemfire.repository.query.Predicate ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.gemfire.repository.query.Predicates org.springframework.data.gemfire.repository.query.Predicates ( Predicate org.springframework.data.gemfire.repository.query.Predicate ) { return new org.springframework.data.gemfire.repository.query.Predicates ( org.springframework.data.gemfire.repository.query.Predicate ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.data.gemfire.repository.query.Predicates org.springframework.data.gemfire.repository.query.Predicates ( Part org.springframework.data.gemfire.repository.query.Part , java.util.Iterator<java.lang.Integer> < java.lang.Integer > java.util.Iterator<java.lang.Integer> ) { return org.springframework.data.gemfire.repository.query.Predicates ( new org.springframework.data.gemfire.repository.query.Predicates.AtomicPredicate ( org.springframework.data.gemfire.repository.query.Part , java.util.Iterator<java.lang.Integer> ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.repository.query.Predicates org.springframework.data.gemfire.repository.query.Predicates ( final Predicate org.springframework.data.gemfire.repository.query.Predicate ) { return org.springframework.data.gemfire.repository.query.Predicates ( new Predicate ( ) { @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.query.Predicates .this . org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) , org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.query.Predicates .this . org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) , org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.gemfire.repository.query.Predicates org.springframework.data.gemfire.repository.query.Predicates ( final Predicate org.springframework.data.gemfire.repository.query.Predicate ) { return org.springframework.data.gemfire.repository.query.Predicates ( new Predicate ( ) { @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.query.Predicates .this . org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) , org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.query.Predicates .this . org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) , org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return org.springframework.data.gemfire.repository.query.Predicate . toString ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( Part org.springframework.data.gemfire.repository.query.Part , java.util.Iterator<java.lang.Integer> < java.lang.Integer > java.util.Iterator<java.lang.Integer> ) { Assert . notNull ( org.springframework.data.gemfire.repository.query.Part , STRING ) ; Assert . notNull ( java.util.Iterator<java.lang.Integer> , STRING ) ; this . org.springframework.data.gemfire.repository.query.Part = org.springframework.data.gemfire.repository.query.Part ; this . java.util.Iterator<java.lang.Integer> = java.util.Iterator<java.lang.Integer> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( boolean ( ) ) { return java.lang.String . java.lang.String ( STRING , java.lang.String ( java.lang.String ) , java.util.Iterator<java.lang.Integer> . java.lang.Integer ( ) ) ; } else { Type org.springframework.data.gemfire.repository.query.Type = org.springframework.data.gemfire.repository.query.Part . getType ( ) ; switch ( org.springframework.data.gemfire.repository.query.Type ) { case IS_NULL : case IS_NOT_NULL : return java.lang.String . java.lang.String ( STRING , java.lang.String ( java.lang.String ) , java.lang.String ( org.springframework.data.gemfire.repository.query.Type ) ) ; case FALSE : case TRUE : return java.lang.String . java.lang.String ( STRING , java.lang.String ( java.lang.String ) , java.lang.String ( org.springframework.data.gemfire.repository.query.Type ) , Type . TRUE . equals ( org.springframework.data.gemfire.repository.query.Type ) ) ; default: return java.lang.String . java.lang.String ( STRING , java.lang.String ( java.lang.String ) , java.lang.String ( org.springframework.data.gemfire.repository.query.Type ) , java.util.Iterator<java.lang.Integer> . java.lang.Integer ( ) ) ; } } }  <METHOD_END>
<METHOD_START> boolean boolean ( ) { switch ( org.springframework.data.gemfire.repository.query.Part . shouldIgnoreCase ( ) ) { case ALWAYS : case WHEN_POSSIBLE : return true ; case NEVER : default: return false ; } }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( STRING , java.lang.String ( java.lang.String ) , org.springframework.data.gemfire.repository.query.Part . getProperty ( ) . toDotPath ( ) ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( java.lang.String != null ? java.lang.String : QueryBuilder . DEFAULT_ALIAS ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( Type org.springframework.data.gemfire.repository.query.Type ) { switch ( org.springframework.data.gemfire.repository.query.Type ) { case FALSE : case IS_NULL : case SIMPLE_PROPERTY : case TRUE : return STRING ; case IS_NOT_NULL : case NEGATING_SIMPLE_PROPERTY : return STRING ; case GREATER_THAN : return STRING ; case GREATER_THAN_EQUAL : return STRING ; case LESS_THAN : return STRING ; case LESS_THAN_EQUAL : return STRING ; case IN : return STRING ; case NOT_IN : return STRING ; case LIKE : case STARTING_WITH : case ENDING_WITH : case CONTAINING : return STRING ; default: throw new java.lang.IllegalArgumentException ( java.lang.String . java.lang.String ( STRING , org.springframework.data.gemfire.repository.query.Type ) ) ; } }  <METHOD_END>