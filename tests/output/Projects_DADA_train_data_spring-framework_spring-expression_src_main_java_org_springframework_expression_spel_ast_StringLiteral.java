<METHOD_START> public void ( java.lang.String java.lang.String , int int , java.lang.String java.lang.String ) { super( java.lang.String , int ); java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - NUMBER ) ; this . org.springframework.expression.spel.ast.TypedValue = new TypedValue ( java.lang.String . java.lang.String ( STRING , STRING ) . java.lang.String ( STRING , STRING ) ) ; this . exitTypeDescriptor = STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.expression.spel.ast.TypedValue org.springframework.expression.spel.ast.TypedValue ( ) { return this . org.springframework.expression.spel.ast.TypedValue ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + org.springframework.expression.spel.ast.TypedValue ( ) . getValue ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MethodVisitor org.springframework.expression.spel.ast.MethodVisitor , CodeFlow org.springframework.expression.spel.ast.CodeFlow ) { org.springframework.expression.spel.ast.MethodVisitor . visitLdcInsn ( this . org.springframework.expression.spel.ast.TypedValue . getValue ( ) ) ; org.springframework.expression.spel.ast.CodeFlow . pushDescriptor ( this . exitTypeDescriptor ) ; }  <METHOD_END>
