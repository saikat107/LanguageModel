<METHOD_START> public void ( int int , SpelNodeImpl ... org.springframework.expression.spel.ast.SpelNodeImpl[] ) { super( int , org.springframework.expression.spel.ast.SpelNodeImpl[] ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ExpressionState org.springframework.expression.spel.ast.ExpressionState ) throws org.springframework.expression.spel.ast.EvaluationException { TypedValue org.springframework.expression.spel.ast.TypedValue = this . children [ NUMBER ] . getValueInternal ( org.springframework.expression.spel.ast.ExpressionState ) ; getChild ( NUMBER ) . setValue ( org.springframework.expression.spel.ast.ExpressionState , org.springframework.expression.spel.ast.TypedValue . getValue ( ) ) ; return org.springframework.expression.spel.ast.TypedValue ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return getChild ( NUMBER ) . toStringAST ( ) + STRING + getChild ( NUMBER ) . toStringAST ( ) ; }  <METHOD_END>
