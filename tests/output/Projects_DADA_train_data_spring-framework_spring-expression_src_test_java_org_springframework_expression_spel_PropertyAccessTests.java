<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluate ( STRING , STRING , java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { evaluateAndCheckError ( STRING , SpelMessage . PROPERTY_OR_FIELD_NOT_READABLE , NUMBER ) ; evaluateAndCheckError ( STRING , SpelMessage . PROPERTY_OR_FIELD_NOT_READABLE , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SpelExpression org.springframework.expression.spel.SpelExpression = ( SpelExpression ) parser . parseExpression ( STRING ) ; EvaluationContext org.springframework.expression.spel.EvaluationContext = new StandardEvaluationContext ( null ) ; try { org.springframework.expression.spel.SpelExpression . getValue ( org.springframework.expression.spel.EvaluationContext ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { void ( java.lang.Exception , SpelMessage . PROPERTY_OR_FIELD_NOT_READABLE_ON_NULL ) ; } assertFalse ( org.springframework.expression.spel.SpelExpression . isWritable ( org.springframework.expression.spel.EvaluationContext ) ) ; try { org.springframework.expression.spel.SpelExpression . setValue ( org.springframework.expression.spel.EvaluationContext , STRING ) ; fail ( STRING ) ; } catch ( java.lang.Exception java.lang.Exception ) { void ( java.lang.Exception , SpelMessage . PROPERTY_OR_FIELD_NOT_WRITABLE_ON_NULL ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Exception java.lang.Exception , SpelMessage org.springframework.expression.spel.SpelMessage ) { if ( java.lang.Exception instanceof SpelEvaluationException ) { SpelMessage org.springframework.expression.spel.SpelMessage = ( ( SpelEvaluationException ) java.lang.Exception ) . getMessageCode ( ) ; assertEquals ( STRING , org.springframework.expression.spel.SpelMessage , org.springframework.expression.spel.SpelMessage ) ; } else { fail ( STRING + java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SpelExpressionParser org.springframework.expression.spel.SpelExpressionParser = new SpelExpressionParser ( ) ; StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = new StandardEvaluationContext ( ) ; org.springframework.expression.spel.StandardEvaluationContext . addPropertyAccessor ( new org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor ( ) ) ; Expression org.springframework.expression.spel.Expression = org.springframework.expression.spel.SpelExpressionParser . parseRaw ( STRING ) ; java.lang.Integer java.lang.Integer = org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Integer .class ) ; assertEquals ( ( int ) java.lang.Integer , NUMBER ) ; org.springframework.expression.spel.Expression = org.springframework.expression.spel.SpelExpressionParser . parseRaw ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext ) ; assertNotNull ( java.lang.Object ) ; org.springframework.expression.spel.Expression = org.springframework.expression.spel.SpelExpressionParser . parseRaw ( STRING ) ; org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , NUMBER ) ; java.lang.Integer = org.springframework.expression.spel.Expression . getValue ( org.springframework.expression.spel.StandardEvaluationContext , java.lang.Integer .class ) ; assertEquals ( ( int ) java.lang.Integer , NUMBER ) ; try { org.springframework.expression.spel.Expression . setValue ( org.springframework.expression.spel.StandardEvaluationContext , STRING ) ; fail ( STRING ) ; } catch ( EvaluationException org.springframework.expression.spel.EvaluationException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StandardEvaluationContext org.springframework.expression.spel.StandardEvaluationContext = new StandardEvaluationContext ( ) ; java.util.List<org.springframework.expression.spel.PropertyAccessor> < PropertyAccessor > java.util.List<org.springframework.expression.spel.PropertyAccessor> = org.springframework.expression.spel.StandardEvaluationContext . getPropertyAccessors ( ) ; assertEquals ( NUMBER , java.util.List<org.springframework.expression.spel.PropertyAccessor> . size ( ) ) ; org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor = new org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor ( ) ; org.springframework.expression.spel.StandardEvaluationContext . addPropertyAccessor ( org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor ) ; assertEquals ( NUMBER , org.springframework.expression.spel.StandardEvaluationContext . getPropertyAccessors ( ) . size ( ) ) ; java.util.List<org.springframework.expression.spel.PropertyAccessor> < PropertyAccessor > java.util.List<org.springframework.expression.spel.PropertyAccessor> = new java.util.ArrayList<org.springframework.expression.spel.PropertyAccessor> <> ( ) ; java.util.List<org.springframework.expression.spel.PropertyAccessor> . addAll ( org.springframework.expression.spel.StandardEvaluationContext . getPropertyAccessors ( ) ) ; assertTrue ( org.springframework.expression.spel.StandardEvaluationContext . removePropertyAccessor ( org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor ) ) ; assertFalse ( org.springframework.expression.spel.StandardEvaluationContext . removePropertyAccessor ( org.springframework.expression.spel.PropertyAccessTests.StringyPropertyAccessor ) ) ; assertEquals ( NUMBER , org.springframework.expression.spel.StandardEvaluationContext . getPropertyAccessors ( ) . size ( ) ) ; org.springframework.expression.spel.StandardEvaluationContext . setPropertyAccessors ( java.util.List<org.springframework.expression.spel.PropertyAccessor> ) ; assertEquals ( NUMBER , org.springframework.expression.spel.StandardEvaluationContext . getPropertyAccessors ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Expression org.springframework.expression.spel.Expression = parser . parseExpression ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.Expression . getValue ( new StandardEvaluationContext ( java.lang.String .class ) ) ; assertEquals ( java.lang.Object , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( ) { return new java.lang.Class [] { java.lang.String .class } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( EvaluationContext org.springframework.expression.spel.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.expression.spel.AccessException { if ( ! ( java.lang.Object instanceof java.lang.String ) ) { throw new java.lang.RuntimeException ( STRING ) ; } return ( java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( EvaluationContext org.springframework.expression.spel.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.expression.spel.AccessException { if ( ! ( java.lang.Object instanceof java.lang.String ) ) { throw new java.lang.RuntimeException ( STRING ) ; } return ( java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.TypedValue org.springframework.expression.spel.TypedValue ( EvaluationContext org.springframework.expression.spel.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) throws org.springframework.expression.spel.AccessException { if ( ! java.lang.String . boolean ( STRING ) ) { throw new java.lang.RuntimeException ( STRING ) ; } return new TypedValue ( int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EvaluationContext org.springframework.expression.spel.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) throws org.springframework.expression.spel.AccessException { if ( ! java.lang.String . boolean ( STRING ) ) { throw new java.lang.RuntimeException ( STRING ) ; } try { int = ( java.lang.Integer ) org.springframework.expression.spel.EvaluationContext . getTypeConverter ( ) . convertValue ( java.lang.Object , TypeDescriptor . forObject ( java.lang.Object ) , TypeDescriptor . valueOf ( java.lang.Integer .class ) ) ; } catch ( EvaluationException org.springframework.expression.spel.EvaluationException ) { throw new AccessException ( STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) + STRING ) ; } }  <METHOD_END>