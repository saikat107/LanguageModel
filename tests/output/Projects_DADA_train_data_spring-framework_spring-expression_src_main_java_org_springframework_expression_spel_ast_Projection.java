<METHOD_START> public void ( boolean boolean , int int , SpelNodeImpl org.springframework.expression.spel.ast.SpelNodeImpl ) { super( int , org.springframework.expression.spel.ast.SpelNodeImpl ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { return org.springframework.expression.spel.ast.ValueRef ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.expression.spel.ast.ValueRef org.springframework.expression.spel.ast.ValueRef ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { TypedValue org.springframework.expression.spel.ast.TypedValue = org.springframework.expression.spel.ast.ExpressionState . getActiveContextObject ( ) ; java.lang.Object java.lang.Object = org.springframework.expression.spel.ast.TypedValue . getValue ( ) ; boolean boolean = ObjectUtils . isArray ( java.lang.Object ) ; if ( java.lang.Object instanceof java.util.Map ) { java.util.Map<?,?> < ? , ? > java.util.Map<?,?> = ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> : java.util.Map<,> . java.util.Set<java.util.Map.Entry<,>> ( ) ) { try { org.springframework.expression.spel.ast.ExpressionState . pushActiveContextObject ( new TypedValue ( java.util.Map.Entry<,> ) ) ; org.springframework.expression.spel.ast.ExpressionState . enterScope ( ) ; java.util.List<java.lang.Object> . boolean ( this . children [ NUMBER ] . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ) ; } finally { org.springframework.expression.spel.ast.ExpressionState . popActiveContextObject ( ) ; org.springframework.expression.spel.ast.ExpressionState . exitScope ( ) ; } } return new ValueRef . ValueRef ( new TypedValue ( java.util.List<java.lang.Object> ) , this ) ; } if ( java.lang.Object instanceof java.lang.Iterable || boolean ) { java.lang.Iterable<?> < ? > java.lang.Iterable<?> = ( java.lang.Object instanceof java.lang.Iterable ? ( java.lang.Iterable<?> < ? > ) java.lang.Object : java.util.Arrays . java.util.List ( ObjectUtils . toObjectArray ( java.lang.Object ) ) ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> <> ( ) ; int int = NUMBER ; java.lang.Class<?> < ? > java.lang.Class<?> = null ; for ( java.lang.Object java.lang.Object : java.lang.Iterable<> ) { try { org.springframework.expression.spel.ast.ExpressionState . pushActiveContextObject ( new TypedValue ( java.lang.Object ) ) ; org.springframework.expression.spel.ast.ExpressionState . enterScope ( STRING , int ) ; java.lang.Object java.lang.Object = this . children [ NUMBER ] . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) . getValue ( ) ; if ( java.lang.Object != null && boolean ) { java.lang.Class<?> = java.lang.Class<?> ( java.lang.Class<> , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } java.util.List<java.lang.Object> . boolean ( java.lang.Object ) ; } finally { org.springframework.expression.spel.ast.ExpressionState . exitScope ( ) ; org.springframework.expression.spel.ast.ExpressionState . popActiveContextObject ( ) ; } int ++ ; } if ( boolean ) { if ( java.lang.Class<> == null ) { java.lang.Class<?> = java.lang.Object .class ; } java.lang.Object java.lang.Object = java.lang.reflect.Array . java.lang.Object ( java.lang.Class<> , java.util.List<java.lang.Object> . int ( ) ) ; java.lang.System . void ( java.util.List<java.lang.Object> . java.lang.Object[] ( ) , NUMBER , java.lang.Object , NUMBER , java.util.List<java.lang.Object> . int ( ) ) ; return new ValueRef . ValueRef ( new TypedValue ( java.lang.Object ) , this ) ; } return new ValueRef . ValueRef ( new TypedValue ( java.util.List<java.lang.Object> ) , this ) ; } if ( java.lang.Object == null ) { if ( this . boolean ) { return ValueRef . NullValueRef . INSTANCE ; } throw new SpelEvaluationException ( getStartPosition ( ) , SpelMessage . PROJECTION_NOT_SUPPORTED_ON_TYPE , STRING ) ; } throw new SpelEvaluationException ( getStartPosition ( ) , SpelMessage . PROJECTION_NOT_SUPPORTED_ON_TYPE , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + getChild ( NUMBER ) . toStringAST ( ) + STRING ; }  <METHOD_END>
<METHOD_START> private java.lang.Class<?> < ? > java.lang.Class<?> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> == null ) { return java.lang.Class<> ; } if ( java.lang.Class<> . boolean ( java.lang.Class<> ) ) { return java.lang.Class<> ; } java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<> ; while ( java.lang.Class<> != java.lang.Object .class ) { if ( java.lang.Class<> . boolean ( java.lang.Class<> ) ) { return java.lang.Class<> ; } java.lang.Class<?> = java.lang.Class<> . java.lang.Class<? super > ( ) ; } java.lang.Class<?> < ? > [] java.lang.Class<?>[] = ClassUtils . getAllInterfacesForClass ( java.lang.Class<> ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { if ( java.lang.Class<> . boolean ( java.lang.Class<> ) ) { return java.lang.Class<> ; } } return java.lang.Object .class ; }  <METHOD_END>